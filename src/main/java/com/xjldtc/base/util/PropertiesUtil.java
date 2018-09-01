package com.xjldtc.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties readProp(String fileName) throws IOException{
		File file = new File(fileName);
		InputStream in = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(in);
		return prop;
	}
}
