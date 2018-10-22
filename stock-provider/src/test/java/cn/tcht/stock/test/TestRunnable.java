package cn.tcht.stock.test;

/**   
* @Title: TestRunnable.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月6日 下午5:44:13 
* @version V1.0.0  
*/
public class TestRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "线程被调用了");
	}
	
}
