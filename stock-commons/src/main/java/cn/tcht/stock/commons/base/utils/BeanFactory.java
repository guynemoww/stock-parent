package cn.tcht.stock.commons.base.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanFactory implements ApplicationContextAware{
	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
		return ctx;
	}
	
	public static Object getBean(String beanName) {
		return ctx.getBean(beanName);
	}
	
	public static <T> T getBean(String beanName, Class<T> requiredType) {
		return (T)ctx.getBean(beanName, requiredType);
	}
}
