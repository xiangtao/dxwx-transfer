package com.axj.apiw;

import java.io.File;
import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class TestClient {

	public static void main(String[] args) throws HttpException, IOException, DocumentException {
		      //HttpClient client = new HttpClient();
		      // 设置代理服务器地址和端口      

		      //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port); 
		      // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
  		      //HttpMethod method = new GetMethod("http://localhost:8080/userStr");
		      //使用POST方法
		      //PostMethod method = new PostMethod("http://localhost:8080/user");
		      File file = new File("D:\\sample.xml");
		      //FileReader reader2 =  new FileReader(file);
		      SAXReader reader = new SAXReader();
		      Document doc = reader.read(file);
		      Node nodeEventKey = doc.selectSingleNode("/xml/yes");
		      System.out.println(nodeEventKey.getText());
		      //InputStream in = new FileInputStream(file);
		      //method.setRequestBody(in);

		      //打印服务器返回的状态
		      //System.out.println(method.getStatusLine());
		      //打印返回的信息
		      //System.out.println(method.getResponseBodyAsString());

		      //释放连接
		      //method.releaseConnection();
		      

	}
	
}
