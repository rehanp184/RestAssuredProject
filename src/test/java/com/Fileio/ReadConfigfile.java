package com.Fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ReadConfigfile {

	public static void main(String[] args) throws IOException {

      File myFile = new File(System.getProperty("user.dir")+"\\config\\dev.properties");
      FileReader fileReader = new FileReader(myFile);
      Properties properties =new Properties();
      properties.load(fileReader);
      System.out.println(properties.getProperty("BASE_URL"));
      
      
	}

}
