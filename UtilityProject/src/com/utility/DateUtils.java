/**
 * 
 */
package com.utility;

import java.sql.Date;

/**
 * @author Abhishek
 *
 */
public class DateUtils {
	 
	
	public static boolean equal(Date date1,Date date2) {
		return date1.compareTo(date2) ==0;
	}

}
