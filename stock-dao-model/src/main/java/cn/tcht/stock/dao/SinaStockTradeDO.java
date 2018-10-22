package cn.tcht.stock.dao;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title: 
 * @Package cn.tfb.stock.trade.dao
 * @Description: 
 * @date 2018/7/26 9:22
 */
@Component
public class SinaStockTradeDO implements Serializable{
    private static final long serialVersionUID = 2219823005942915816L;
    
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
		return "SinaStockTradeDO [id=" + id + ", stockNum=" + stockNum + ", shortStockName=" + shortStockName
				+ ", oldStockName=" + oldStockName + ", fullStockName=" + fullStockName + ", registerPlace="
				+ registerPlace + ", upDate=" + upDate + ", remarks=" + remarks + "]";
	}

}
