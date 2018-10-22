package cn.tcht.stock.dto.sina;

import java.io.Serializable;
import java.util.Date;

import cn.tcht.stock.commons.base.message.BaseRequestBody;

/**   
* @Title: SinaStockTradeInDto.java 
* @Package cn.tcht.stock.dto.sina 
* @Description: 
* @author teamsun_wangwei
* @date 2018年8月2日 上午9:55:24 
* @version V1.0.0  
*/
public class SinaStockTradeInDto extends BaseRequestBody implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;
    
    private String stockNum;
    
    private String shortStockName;
    
    private String oldStockName;
    
    private String fullStockName;
    
    private String registerPlace;
    
    private Date upDate;
    
    private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStockNum() {
		return stockNum;
	}

	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getShortStockName() {
		return shortStockName;
	}

	public void setShortStockName(String shortStockName) {
		this.shortStockName = shortStockName;
	}

	public String getOldStockName() {
		return oldStockName;
	}

	public void setOldStockName(String oldStockName) {
		this.oldStockName = oldStockName;
	}

	public String getFullStockName() {
		return fullStockName;
	}

	public void setFullStockName(String fullStockName) {
		this.fullStockName = fullStockName;
	}

	public String getRegisterPlace() {
		return registerPlace;
	}

	public void setRegisterPlace(String registerPlace) {
		this.registerPlace = registerPlace;
	}

	public Date getUpDate() {
		return upDate;
	}

	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "SinaStockTradeInDto [id=" + id + ", stockNum=" + stockNum + ", shortStockName=" + shortStockName
				+ ", oldStockName=" + oldStockName + ", fullStockName=" + fullStockName + ", registerPlace="
				+ registerPlace + ", upDate=" + upDate + ", remarks=" + remarks + "]";
	}
}
