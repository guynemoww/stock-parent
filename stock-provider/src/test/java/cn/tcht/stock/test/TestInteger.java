package cn.tcht.stock.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**   
* @Title: TestInteger.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月26日 下午5:11:35 
* @version V1.0.0  
*/
public class TestInteger {

	@Test
	public void test() {
		String str = "";
		List<String> list = Arrays.asList(str.split(","));
		if(list == null || list.size() == 0) {
			list.add("''");
		}
		
		System.out.println(list.toString());
	}

}
