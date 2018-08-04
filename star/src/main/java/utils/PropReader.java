package utils;

import java.io.InputStream;
import java.util.Properties;

public class PropReader {

	public static Properties properties = null;
	public static String getProperty(String propertyName) {

		String propertyValue = "";
		try {
			if (properties == null)
			{
				properties = new Properties();
				InputStream in = PropReader.class.getResourceAsStream("/starLogger.properties");
				properties.load(in);
				in.close();
			}
			propertyValue = properties.getProperty(propertyName);
			if (propertyValue != null)
				propertyValue = propertyValue.trim();
			else
				propertyValue = "";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occuer while reading property " + e);
		}
		return propertyValue;
	}
}
