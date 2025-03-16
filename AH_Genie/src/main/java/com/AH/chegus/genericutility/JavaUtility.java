package com.AH.chegus.genericutility;

import java.time.LocalDateTime;

/**
 * This class we have the common method to get the current date and time.
 */
public class JavaUtility {

	/**
	 * @author Gunz
	 * @return Current date and time
	 * This method is used to return the current date and time
	 */
	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		return timeStamp;		
	}
}
