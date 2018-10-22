package cn.tcht.stock.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**   
* @Title: Producer.java 
* @Package cn.tcht.stock.mq 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月20日 下午5:13:24 
* @version V1.0.0  
*/
public class QueueProducer {
	
	
	
	
	public static void main(String[] args) throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Queue queue = session.createQueue("select stockInfo");
        //6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(queue);
        //7、使用会话对象创建一个消息对象
//        TextMessage textMessage = session.createTextMessage("hello!test-queue");
        //8、发送消息
        for(int i=0;i<100;i++) {
        	TextMessage textMessage = session.createTextMessage("消息"+ i +": test-queue");
        	producer.send(textMessage);
        }
        
        //9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }

}
