package com.axj.apiw.constant;

public class QueryHandlerConstant {
	//代表系统级别功能 如：天气，股票，人品，快递    等等 查询返回的回复内容
    public static final String CATEGORY_BASE = "base";
    //特定模块需要用户设置的回复 如微网站里面用户设计 输入"首页"回复相关内容 输入“我的文章” 回复某一篇文章的内容
    public static final String CATEGORY_FUNC = "func";
    //首次关注回复，关键词回复 里面用户设置的回复内容
    public static final String CATEGORY_DEF = "def";
    
    //如果不需要配 uniqueIndentitity的话，就配它吧
    public static final String UNIQUE_IDENTITY_NOTHING = "nothing";
    
    //多个标识
    public static final String UNIQUE_IDENTITY_MULTIPLE = "multiple";
    
    
    //------功能唯一编码----------------
    
    public class FuncCode{
	    //天气
	    public static final String FUNC_WEATHER_CODE = "func_1";
	    
	    //快递查询
	    public static final String FUNC_EXPRESS_CODE = "func_2";
	    
	    //手机归属地查询
	    public static final String FUNC_PHONE_CODE = "func_3";
	    
	    //身份证查询
	    public static final String FUNC_IDCARD_CODE = "func_4";
	    
	    //彩票查询
	    public static final String FUNC_LOTTERY_CODE = "func_10";
	    
	    //股票查询
	    public static final String FUNC_STOCK_CODE = "func_9";
	    
	    
	    //人品计算
	    public static final String FUNC_MANCHARACTER_CODE = "func_24";
	    
	    //糗事查询
	    public static final String FUNC_DIRTY_CODE = "func_25";
	    
	    
	  //优惠券
	    public static final String FUNC_YFJ_CODE = "func_40";
	    
	    
	  //大转盘
	    public static final String FUNC_DZP_CODE = "func_41";
	    
	    
	  //刮刮卡
	    public static final String FUNC_GGK_CODE = "func_42";
	    
	    
	  //投票活动
	    public static final String FUNC_TPHD_CODE = "func_43";
	    
	    
	  //有奖调研
	    public static final String FUNC_YJDY_CODE = "func_44";
	    
	  //砸金蛋
	    public static final String FUNC_ZJD_CODE = "func_45";
	    
	  //幸运机
	    public static final String FUNC_XYJ_CODE = "func_75";
	    
	    //会员卡
	    public static final String FUNC_HYK_CODE = "func_68";
	    
	   //360全景
	    public static final String FUNC_360QJ_CODE = "func_73";
	    
	    
    }
    
    
}
