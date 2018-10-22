package cn.tcht.stock.facade.sina;

import cn.tcht.stock.commons.base.exception.ServiceException;
import cn.tcht.stock.dto.sina.SinaStockTradeInDto;

public interface SinaStockTradeFacade {
	
	public SinaStockTradeInDto getSinaStockInfo(String stockNum) throws ServiceException;
	
}
