package cn.tcht.stock.test;

import java.math.BigDecimal;

import org.junit.Test;

/**   
* @Title: TestEquals.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月26日 下午5:08:45 
* @version V1.0.0  
*/

public class TestEquals {
	
	@Test
	public void testEquals() {
		Integer m = 5;
		Integer k = new Integer(5);
		
		System.out.println(m.hashCode());
		System.out.println(k.hashCode());
		if(m == k) {

			System.out.println("真");
		}
	}
	
	@Test
	public void testBigDecimal() {
		String str = "";
		Integer LL ;
		String s1 = String.valueOf("");
		
		System.out.println("转换后的值:" + s1);
		BigDecimal b1 = new BigDecimal(str);
		
		
		System.out.println(b1);
		
	}
	
	
	

}
