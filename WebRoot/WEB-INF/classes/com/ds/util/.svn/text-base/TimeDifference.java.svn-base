package com.ds.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TimeDifference {  // 计算时间
	/**
	* 计算两个日期的时间差
	* @param formatTime1
	* @param formatTime2
	* @return
	*/
	public static String getTimeDifference(Timestamp formatTime1, Timestamp formatTime2) {
	SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
	long t1 = 0L;
	long t2 = 0L;
	try {
	t1 = timeformat.parse(getTimeStampNumberFormat(formatTime1)).getTime();
	} catch (ParseException e) {
	e.printStackTrace();
	}
	try {
	t2 = timeformat.parse(getTimeStampNumberFormat(formatTime2)).getTime();
	} catch (ParseException e) {
	e.printStackTrace();
	}
	//因为t1-t2得到的是毫秒级,所以要初3600000得出小时.算天数或秒同理
	int hours=(int) ((t1 - t2)/3600000);
	int minutes=(int) (((t1 - t2)/1000-hours*3600)/60);
	int second=(int) ((t1 - t2)/1000-hours*3600-minutes*60);
	return ""+hours+"小时"+minutes+"分"+second+"秒";
	}
	/**
	* 格式化时间
	* Locale是设置语言敏感操作
	* @param formatTime
	* @return
	*/
	public static String getTimeStampNumberFormat(Timestamp formatTime) {
	SimpleDateFormat m_format = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss", new Locale("zh", "cn"));
	return m_format.format(formatTime);
	}
}
