package cn.tcht.stock.commons.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:/META-INF/spring/dubbo-consumer.xml",
		"classpath*:/META-INF/spring/applicationContext.xml",
		"classpath*:/META-INF/spring/spring-mybatis.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests{

}
