package com.AH.chegus.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	//AH common
	//public String browser, url, username, pwd, agent;
	//AH Dental
	//public String memberid, claimclosedate, claimreceiveddate, sp, icd, grosscharge, ahfoz, treamentdate, benefotgroup, servfee1, servfee2, servfee3, servfee4, quantity;
	
	//Read data from property file by sending file name
	
	/**
	 * This method for read the data from property files.
	 * 
	 * @param fileName
	 * @param key
	 * @return value
	 * @throws IOException
	 *  
	 */
	public String readDataFromProertyFiles(String fileName, String key) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read AH Common Data File
	
	/**
	 * This method for read the data from AH Common Data property files.
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readAHCommon(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\AHcommondata.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read AH Dental Claim File
	
	/**
	 * This method for read the data from AH Dental Claim property files
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readAHDental(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\ahdentalclaim.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read AH Short Fall C & D
	
	/**
	 * This method for read the data from claimsdetails property files.
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String claimsdetails(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\claimsdetails.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read ICD code
	
	/**
	 * This method for read the data from ICD property files
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readICD(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\ICD.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read Service Provider code
	
	/**
	 * This method for read the data from Service Provider property files
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readSP(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\serviceprovider.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	//Read Service Provider code
	
	
	/**
	 * This method for read the data from Service Provider property files
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readAHFoZ(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\ahfoz.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
