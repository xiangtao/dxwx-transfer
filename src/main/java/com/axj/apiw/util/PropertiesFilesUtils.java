package com.axj.apiw.util;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Description 加载属性配置文件工具类
 * @Package com.viathink.utils.PropertiesFilesUtils.java
 * @author quliu
 * @date 2012-11-16 下午3:18:19
 * @version V1.0
 */
public class PropertiesFilesUtils {
	private static final PropertiesFilesUtils propertiesFiles = new PropertiesFilesUtils();

	/**
	 * 存放所有的属性配置文件对象
	 */
	private Map<String, Properties> propertiesMap = new HashMap<String, Properties>();

	private PropertiesFilesUtils() {
	}

	/**
	 * 获得属性配置文件工具类的实例对象
	 * 
	 * @return PropertiesFilesUtils 对象
	 */
	public static PropertiesFilesUtils getInstance() {
		return propertiesFiles;
	}

	/**
	 * 获取Properties文件对象
	 * 
	 * @param PropertiesFileName
	 * @return
	 * @throws IOException
	 */
	public synchronized Properties getProperties(String propertiesFileName) throws IOException {
		if (propertiesFileName == null || "".equals(propertiesFileName)) {
			throw new IllegalArgumentException("The propertiesFileName is illegal argument!");
		}
		Properties prop = propertiesMap.get(propertiesFileName);
		if (prop == null) {
			prop = new Properties();
			InputStream is = this.getClass().getResourceAsStream(propertiesFileName);
			if (is == null)
				throw new FileNotFoundException("The file \"" + propertiesFileName + "\" is  not found!");
			prop.load(is);
			propertiesMap.put(propertiesFileName, prop);
		}
		return prop;
	}

	/**
	 * 将properties文件写到磁盘上
	 * 
	 * @param properties
	 *            属性文件
	 * @param propertiesFilePath
	 *            要保存的路径
	 * @throws IOException
	 */
	public void writePropertiesFile(Properties properties, String propertiesFilePath) throws IOException {
		if (properties == null || propertiesFilePath == null || "".equals(propertiesFilePath))
			throw new IllegalArgumentException("The props or propertiesFilePath  is illegal argument!");
		FileWriter fw = new FileWriter(propertiesFilePath);
		properties.store(fw, null);
		fw.flush();
		fw.close();
	}

	/**
	 * 更新属性文件的某个属性,并保存到磁盘上
	 * 
	 * @param properties
	 *            要更新的属性文件
	 * @param propertyName
	 *            属性名称
	 * @param propertyValue
	 *            属性值
	 * @param filePath
	 *            保存的文件路径
	 * @throws IOException
	 */
	public void updatePropertiesFile(Properties properties, String propertyName, String propertyValue, String filePath)
			throws IOException {
		if (properties == null || propertyName == null || "".equals(propertyName) || propertyValue == null
				|| "".equals(propertyValue) || filePath == null || "".equals(filePath))
			throw new IllegalArgumentException("The parameters  is illegal argument!");
		properties.setProperty(propertyName, propertyValue);
		writePropertiesFile(properties, filePath);
	}

	/**
	 * 根据属性配置文件名称和属性名称获取属性配置值
	 * 
	 * @param propertiesFileName
	 *            属性配置文件名称
	 * @param propertyName
	 *            属性名称
	 * @return 属性值
	 * @throws IOException
	 */
	public String getProperty(String propertiesFileName, String propertyName) throws IOException {
		Properties prop = getProperties(propertiesFileName);
		return prop.getProperty(propertyName);
	}

	/**
	 * 获得Properties对象列表
	 * 
	 * @return
	 */
	public List<Properties> getProperties() {
		if (propertiesMap.isEmpty())
			return null;
		return new LinkedList<Properties>(propertiesMap.values());
	}

	/**
	 * 获得属性对象Map
	 * 
	 * @return
	 */
	public Map<String, Properties> getPropertiesMap() {
		return propertiesMap;
	}

	public static void main(String[] args) throws IOException {
		PropertiesFilesUtils pfu = PropertiesFilesUtils.getInstance();
		Properties pro = pfu.getProperties("/url.properties");
		pro.list(System.out);
//		Properties pro1 = pfu.getProperties("/msswms_message.properties");
//		Properties pro2 = pfu.getProperties("/msswms_message.properties");
//		Properties pro3 = pfu.getProperties("/msswms_message.properties");
//		System.out.println(pro == pro1);
//		System.out.println(pro == pro2);
//		System.out.println(pro == pro3);
//		System.out.println(pfu.getProperties().size());
//		System.out.println(pfu.getPropertiesMap().size());
		System.out.println(pro.getProperty("imageDomain"));
//		pfu.updatePropertiesFile(pro, "messge.type", "image", "d:/a.text");
//		System.out.println(pro.getProperty("messge.type"));
	}
}
