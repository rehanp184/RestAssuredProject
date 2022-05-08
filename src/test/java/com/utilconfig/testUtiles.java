package com.utilconfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class testUtiles {
	
	public static String readConfigfile(String fileName , String key )
	{     File myFile = new File(System.getProperty("user.dir")+"\\config\\" + fileName);
	      FileReader fileReader = null;
	      Properties properties =new Properties();
		try {
			fileReader = new FileReader(myFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

}
