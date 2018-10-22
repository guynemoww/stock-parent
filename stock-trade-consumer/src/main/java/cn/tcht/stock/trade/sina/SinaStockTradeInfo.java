package cn.tcht.stock.trade.sina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tcht.stock.dto.sina.SinaStockTradeInDto;
import cn.tcht.stock.facade.sina.SinaStockTradeFacade;

/**   
* @Title: SinaStockTradeInfo.java 
* @Package cn.tcht.stock.trade.sina 
* @Description: 
* @author teamsun_wangwei
* @date 2018年8月1日 上午10:27:46 
* @version V1.0.0  
*/
@Service
public class SinaStockTradeInfo {
	@Autowired
	private SinaStockTradeFacade sinaStockTradeFacade;
								
	public void getSinaStockInfo(String stockNum) {
		SinaStockTradeInDto result = sinaStockTradeFacade.getSinaStockInfo(stockNum);
		
		System.out.println("返回结果:" + result);
	}
	

}
