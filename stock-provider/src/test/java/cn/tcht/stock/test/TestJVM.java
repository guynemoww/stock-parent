package cn.tcht.stock.test;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.LinkedList;
import java.util.List;

/**   
* @Title: TestJVM.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月13日 下午2:31:18 
* @version V1.0.0  
*/
public class TestJVM {
	
	public static void main(String[] args) {
		String str = "2";
		List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();
		
//		List l = new LinkedList();
//        // Enter infinite loop which will add a String to the list: l on each
//       
//        while(str == "2") {
//        	System.out.println("1");
//        }
		System.out.println("start");
		System.exit(-1);
		do {
			System.out.println("do while");
		}while(str.equals("3"));
		
        while(str.equals("3")) {
        	System.out.println("while 2");
        }
        
        
	}

}
