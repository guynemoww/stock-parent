package cn.tcht.stock.test.sina;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.tcht.stock.commons.test.base.BaseTest;
import cn.tcht.stock.dto.sina.SinaStockTradeInDto;
import cn.tcht.stock.facade.sina.SinaStockTradeFacade;

/**   
* @Title: SinaStockTest.java 
* @Package cn.tcht.stock.test.sina 
* @Description: 
* @author teamsun_wangwei
* @date 2018年8月1日 上午10:40:36 
* @version V1.0.0  
*/
public class SinaStockTest extends BaseTest{
	
	@Autowired
	private SinaStockTradeFacade sinaStockTradeFacade;
	
	@Test
	public void getSinaStockInfo() {
		SinaStockTradeInDto result = sinaStockTradeFacade.getSinaStockInfo("002274");
		
		System.out.println(result);
	}
	
	

}









