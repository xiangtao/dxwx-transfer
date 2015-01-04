package com.axj.apiw.util;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
* <p>Title: AdsendConfig</p>
* <p>Description: </p>
 * @author zhangfei
 * @date 2014-2-19 11:30:50
 */
public class AdsendConfig implements Serializable
{
	private static final long serialVersionUID = 2245629929042648598L;
	public static AdsendConfig adsendConfig;
	public static PropertiesHelper helper;
	public static Logger logger = LoggerFactory.getLogger( AdsendConfig.class );
	
	//图片上传路径
	private String img_upload_path;
	
	private String site_upload_path;
	
	//txt上传路径
	private String txt_upload_path;
	
	//txtx下载路径
	private String txt_download_path;
	//默认下载文件  针对不存在文件使用
	private String txt_download_path_default;
	
	//默认图片路径
	private String img_default_path;
	//图片读取路径
	private String img_path;
	//上传edm素材路径
	private String edm_material_path;
	//上传edm邮箱路径
	private String edm_email_path;
	//站点访问目录
	private String site_access_path;
	//站点域名根
	private String site_root_domain;
	//站点相册默认封面图片
	private String site_album_default;
	//
	private boolean dev_test;
	//全景相册 上传路径
	private String site_p3d_upload_path;
	//全景相册 访问路径
	private String site_p3d_access_path;
	
	private String wechat_get_token;
	
	private String wechat_menu_create_url;
	
	private String wechat_menu_get;
	
	private String wechat_menu_delete;
	
	private String wechatt_domain;
	
	public static AdsendConfig getInstance()
	{
		// 本方法中不能使用SysTrace,否则会形成循环调用

		if ( adsendConfig != null )
			return adsendConfig;

		System.out.println( "AdsendConfig init()" );

		String filename = "/adsend-config.xml";
		System.out.println( filename );

		try
		{
			Properties p = readPropertiesFromXML( filename );
			// Properties p = MUtil.loadProperties(filename,AdsendConfig.class);
			adsendConfig = new AdsendConfig( p );
			return adsendConfig;
		}
		catch ( Exception ex )
		{
			logger.error( ex.getMessage() );
			return null;
		}
	}
	
	public AdsendConfig( Properties p )
	{
		helper = new PropertiesHelper( p );
		img_default_path=helper.get("img_default_path");
		img_path=helper.get("img_path");
		img_upload_path=helper.get("img_upload_path");
		site_upload_path=helper.get("site_upload_path");
		txt_upload_path = helper.get("txt_upload_path");
		txt_download_path = helper.get("txt_download_path");
		txt_download_path_default= helper.get("txt_download_path_default");
		edm_material_path=helper.get("edm_material_path");
		edm_email_path=helper.get("edm_email_path");
		site_access_path=helper.get("site_access_path");
		site_root_domain=helper.get("site_root_domain");
		site_album_default = helper.get( "site_album_default" );
		dev_test = helper.getBoolean("dev_test", false);
		site_p3d_access_path = helper.get( "site_p3d_access_path" );
		site_p3d_upload_path = helper.get( "site_p3d_upload_path" );
		
		wechat_get_token = helper.get("wechat_get_token");
		wechat_menu_create_url = helper.get("wechat_menu_create_url");
		wechat_menu_get = helper.get("wechat_menu_get");
		wechat_menu_delete = helper.get("wechat_menu_delete");
		
		wechatt_domain = helper.get("wechatt_domain");
		
	}
	
	
	public static Properties readPropertiesFromXML( String xmlPath ) throws Exception
	{
		Properties prop = new Properties();

		InputStream is;
		is = AdsendConfig.class.getResourceAsStream( xmlPath );

		prop.loadFromXML( is );
		is.close();
		return prop;
	}

	public String getImg_upload_path() {
		return img_upload_path;
	}

	public void setImg_upload_path(String img_upload_path) {
		this.img_upload_path = img_upload_path;
	}

	public String getSite_upload_path()
	{
		return site_upload_path;
	}

	public void setSite_upload_path(String site_upload_path)
	{
		this.site_upload_path = site_upload_path;
	}

	public String getImg_default_path() {
		return img_default_path;
	}

	public void setImg_default_path(String img_default_path) {
		this.img_default_path = img_default_path;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public String getTxt_upload_path() {
		return txt_upload_path;
	}

	public void setTxt_upload_path(String txt_upload_path) {
		this.txt_upload_path = txt_upload_path;
	}

	public String getTxt_download_path() {
		return txt_download_path;
	}

	public void setTxt_download_path(String txt_download_path) {
		this.txt_download_path = txt_download_path;
	}

	public String getTxt_download_path_default()
	{
		return txt_download_path_default;
	}

	public void setTxt_download_path_default(String txt_download_path_default)
	{
		this.txt_download_path_default = txt_download_path_default;
	}

	public String getEdm_material_path() {
		return edm_material_path;
	}

	public void setEdm_material_path(String edm_material_path) {
		this.edm_material_path = edm_material_path;
	}

	public String getEdm_email_path() {
		return edm_email_path;
	}

	public void setEdm_email_path(String edm_email_path) {
		this.edm_email_path = edm_email_path;
	}

	public String getSite_access_path()
	{
		return site_access_path;
	}

	public void setSite_access_path(String site_access_path)
	{
		this.site_access_path = site_access_path;
	}

	public String getSite_root_domain()
	{
		return site_root_domain;
	}

	public void setSite_root_domain(String site_root_domain)
	{
		this.site_root_domain = site_root_domain;
	}

	public String getSite_album_default()
	{
		return site_album_default;
	}

	public void setSite_album_default(String site_album_default)
	{
		this.site_album_default = site_album_default;
	}

	public boolean isDev_test()
	{
		return dev_test;
	}

	public void setDev_test(boolean dev_test)
	{
		this.dev_test = dev_test;
	}

	public String getSite_p3d_upload_path()
	{
		return site_p3d_upload_path;
	}

	public void setSite_p3d_upload_path(String site_p3d_upload_path)
	{
		this.site_p3d_upload_path = site_p3d_upload_path;
	}

	public String getSite_p3d_access_path()
	{
		return site_p3d_access_path;
	}

	public void setSite_p3d_access_path(String site_p3d_access_path)
	{
		this.site_p3d_access_path = site_p3d_access_path;
	}

	public String getWechat_get_token()
	{
		return wechat_get_token;
	}

	public void setWechat_get_token(String wechat_get_token)
	{
		this.wechat_get_token = wechat_get_token;
	}

	public String getWechat_menu_create_url()
	{
		return wechat_menu_create_url;
	}

	public void setWechat_menu_create_url(String wechat_menu_create_url)
	{
		this.wechat_menu_create_url = wechat_menu_create_url;
	}

	public String getWechat_menu_get()
	{
		return wechat_menu_get;
	}

	public void setWechat_menu_get(String wechat_menu_get)
	{
		this.wechat_menu_get = wechat_menu_get;
	}

	public String getWechat_menu_delete()
	{
		return wechat_menu_delete;
	}

	public void setWechat_menu_delete(String wechat_menu_delete)
	{
		this.wechat_menu_delete = wechat_menu_delete;
	}

	public String getWechatt_domain() {
	    return wechatt_domain;
	}

	public void setWechatt_domain(String wechatt_domain) {
	    this.wechatt_domain = wechatt_domain;
	}
	
}
