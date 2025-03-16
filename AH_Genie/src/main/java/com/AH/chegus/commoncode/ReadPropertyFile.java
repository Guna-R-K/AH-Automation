package com.AH.chegus.commoncode;

import com.AH.chegus.genericutility.FileUtility;

public class ReadPropertyFile {

	public FileUtility fileUtility = new FileUtility();
	
	public String ReadAHCommon(String key) throws Exception {
		String value = fileUtility.readDataFromProertyFiles("C:\\Users\\gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\AHcommondata.txt", key);
		return value;
	}
}
