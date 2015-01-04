import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;


public class TestClient {

	public static void main(String[] args) throws HttpException, IOException {
		   HttpClient client = new HttpClient();
		      // 设置代理服务器地址和端口      

		      //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port); 
		      // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
  		      //HttpMethod method = new GetMethod("http://localhost:8080/userStr?signature=1&timestamp=2&nonce=3&echostr=4");
		      //使用POST方法
		      PostMethod method = new PostMethod("http://localhost:8080/DDDDBBB123");
		      File file = new File("D:\\sample.xml");
		      InputStream in = new FileInputStream(file);
		      method.setRequestBody(in);
		      client.executeMethod(method);

		      //打印服务器返回的状态
		      System.out.println(method.getStatusLine());
		      //打印返回的信息
		      System.out.println(method.getResponseBodyAsString());

		      //释放连接
		      method.releaseConnection();
		      

	}
	
}
