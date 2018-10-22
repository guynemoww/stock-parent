package cn.tcht.stock.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.tcht.stock.baseService.BaseService;
import cn.tcht.stock.dao.SinaStockTradeDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:/META-INF/spring/spring-mybatis.xml"})
public class DaoTest {
	@Autowired
	private BaseService baseService;
	
	@Test
	public void testDao() {
		SinaStockTradeDO sina =	baseService.getWriteSuperDAO().getObject("SinaStockTradeDOMapping.selectSinaStockTradeById", "1");
		System.out.println(sina.toString());
	}
	

}
