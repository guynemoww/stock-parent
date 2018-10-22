package cn.tcht.stock.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**   
* @Title: TestCachedThreadPool.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月6日 下午5:26:59 
* @version V1.0.0  
*/
public class TestCachedThreadPool {
	
	public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);   
		System.out.println("开始:"+System.currentTimeMillis());
		for (int i = 0; i < 5; i++){   
            executorService.execute(new TestRunnable());   
            System.out.println("************* a" + i + " *************");   
        }   
        executorService.shutdown(); 
        System.out.println("结束:"+System.currentTimeMillis());
	}
	

}
