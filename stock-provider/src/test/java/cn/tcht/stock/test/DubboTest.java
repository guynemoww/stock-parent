package cn.tcht.stock.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.tcht.stock.commons.base.exception.ServiceException;
import cn.tcht.stock.dto.sina.SinaStockTradeInDto;
import cn.tcht.stock.facade.sina.SinaStockTradeFacade;

public class DubboTest {
	@Autowired
	private SinaStockTradeFacade sinaStocTradeFacade;
	@Autowired @Qualifier("testAuto1")
	private TestAuto auto;
	
	
	
	@Test
	public void test() {
		SinaStockTradeInDto result = sinaStocTradeFacade.getSinaStockInfo("002024");
		System.out.println(result);
	}
	
	//测试解析json
	@Test
	public void testJson() {
		String str = "{'type':'1','name':'ww','addr':'cd'}";
		
		JSONObject json = JSON.parseObject(str);
		
		System.out.println(json.get("type"));
		System.out.println(json.get("addr"));
		System.out.println(json.get("name"));
		
	}
	
	@Test
	public void testDouble() {
		Double d1 = 555.5;
		Double d2 = 666.6;
		Double d3 = new Double(111.11);
		if(d1 + d3 > d2) {
			System.out.println("compare:");
		}
	}

	@Test
	public void testObject() {
		Double d = -5.6;
	        
        if(null == d || d > 0.0){
            System.out.println("null");
        }
		
	}
	
	@Test
	public void testArray() {
		String str = "";
		if(StringUtils.isBlank(str)) {
			System.out.println("无需校验字段");
			return;
		}
		String[] arr = str.split(",");
		
		String subInformation = "{'name':'','type':'01','idNo':'','address':'','tel':'138'}";
		JSONObject json = JSON.parseObject(subInformation);
		
		StringUtils.isBlank("");
		
		for(String a : arr) {
			if(StringUtils.isBlank(json.getString(a))) {
				throw new ServiceException("", a + "不允许为空");
			}
		}
	}
	
	@Test
	public void testSplit() {
		String str = "";
		System.out.println(str.split(",").toString());
		
	}
	
	@Test
	public void testNull() {
		SinaStockTradeInDto inDto = null;
		
		if(StringUtils.isBlank(inDto.getFullStockName())) {
			throw new ServiceException("1111", "名称不能为空");
		}
		
	}
	
	@Test
	public void testParseJson() {
//		String str = "{'type':'01','name':'cd'}";
		String str = "{}";
		JSONObject json = null;
		if(StringUtils.isBlank(str)) {
			return;
		}
		try {
			json = JSON.parseObject(str);
		}catch (Exception e) {
			throw new ServiceException("B4000132", "字符串转换为对象出错");
		}
		
		System.out.println(json.getString("type"));
		
	}
	
	@Test
	public void randomSerialNo() {
		String str = this.getString();
		System.out.println(str);
	}
	
	
	
	public String getString() {
		this.getBase();
		return "str222";
	}
	
	public ApplyBase getBase() {
		return new ApplyBase();
	}
	
	@Test
	public void testDouble2 () {
		System.out.println("------------------------------------------");
		
	}
	
	
	
	
	
	
}
