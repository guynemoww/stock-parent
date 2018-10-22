package cn.tcht.stock.commons.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**   
* @Title: DateUtils.java 
* @Package cn.tcht.stock.commons.base.utils 
* @Description: 日期转化工具类
* @author teamsun_wangwei
* @date 2018年7月30日 下午2:35:29 
* @version V1.0.0  
*/
public class DateUtils {
	
	/**
	 * 获取当前日期(yyyy-MM-dd)
	 * @return
	 */
	public static String getNowDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	
	/**
	 * 将日期转化为字符串类型
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	/**
	 * 将字符串转化为日期类型
	 * @param strDate
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(strDate);
	}
	
}
