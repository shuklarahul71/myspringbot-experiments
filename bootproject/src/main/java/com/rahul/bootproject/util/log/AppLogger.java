/**
 * 
 */
package com.rahul.bootproject.util.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rahul.s.shukla
 *
 */

public class AppLogger {

	static Logger log = LoggerFactory.getLogger(AppLogger.class);
	
	public static void main(String[] args) {
		log.info("Testing Log");
	}
}
