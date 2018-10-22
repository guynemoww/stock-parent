package cn.tcht.stock.provider.sina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tcht.stock.biz.sina.SinaStockBiz;
import cn.tcht.stock.commons.base.exception.ServiceException;
import cn.tcht.stock.dao.SinaStockTradeDO;
import cn.tcht.stock.dto.sina.SinaStockTradeInDto;
import cn.tcht.stock.facade.sina.SinaStockTradeFacade;

@Service("sinaStockTradeFacade")
public class SinaStockTradeFacadeImpl implements SinaStockTradeFacade{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SinaStockBiz sinaStockBiz;

	@Override
	public SinaStockTradeInDto getSinaStockInfo(String stockNum) throws ServiceException {
		logger.info("[调用新浪股票接口]开始,入参{}", stockNum);
		sinaStockBiz.sinaInDtoCheck(stockNum);
		
		SinaStockTradeDO sinaDO = sinaStockBiz.getSinaStockTradeInfo(stockNum);
		
		logger.info("[调用新浪股票接口]结束,返回参数{}", sinaDO.toString());
		SinaStockTradeInDto inDto = new SinaStockTradeInDto();
		BeanUtils.copyProperties(sinaDO, inDto);
		
		return inDto;
	}
	

}
