package cn.tcht.stock.facade.sina;

/**   
* @Title: SinaStock.java 
* @Package cn.tcht.stock.facade.sina 
* @Description: 
* @author teamsun_wangwei
* @date 2018年8月13日 上午10:56:58 
* @version V1.0.0  
*/
public interface SinaStock {

	String getStockNum(String stockNum);
	
	String deleteStock(String stockNum);
	
	String addStockNum(String stockNum);
	
	
}
