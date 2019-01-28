package cn.tcht.stock.biz.sina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.StringUtils;

import cn.tcht.stock.commons.base.exception.ServiceException;
import cn.tcht.stock.dao.SinaStockTradeDO;
import cn.tcht.stock.dao.service.sina.SinaStockService;

@Service
public class SinaStockBiz {
	@Autowired
	private SinaStockService sinaStockService;

	/**
	 *    股票代码非空校验
	 * @param stockId
	 */
	public void sinaInDtoCheck(String stockNum) {
		if(StringUtils.isBlank(stockNum)) {
			throw new ServiceException("A0101001", "股票代码不允许为空");
		}
		
	}
	
	/**
	 * 股票信息查询
	 * @param stockId
	 * @return
	 */
	public SinaStockTradeDO getSinaStockTradeInfo(String stockNum) {
		SinaStockTradeDO sinaStockTradeDO = sinaStockService.getReadSuperDAO().getObject("SinaStockTradeDOMapping.selectSinaStockTradeById", stockNum);
		if(sinaStockTradeDO == null) {
			throw new ServiceException("A0101002", "输入的股票代码有误，请重新输入");
		}
		return sinaStockTradeDO;
	}
	
	
	
	
	
	
}
