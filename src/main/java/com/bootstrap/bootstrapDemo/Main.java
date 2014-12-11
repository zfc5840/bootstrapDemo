package com.bootstrap.bootstrapDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.PrivateKey;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *com.MySql.Main.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-5-6</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
@Controller
public class Main {
	
	


   @RequestMapping("/index.do")
	public String queryForInt(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
	   
		return "success";
	}
   
  
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */