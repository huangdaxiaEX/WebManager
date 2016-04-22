<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>test</title>
  </head>
  
  <body>
    <form action="crowdFundingController/addNew.do" method="post">
  	  标题<input type="text" name = "entrytitle"></br>
  	  类型<input type="text" name = "entrytype"></br>
  	  目标价格<input type="text" name = "entryprice"></br>
  	  内容<input type="text" name = "entrycontent"></br>
    	<input type="submit" value="发布众筹">
    </form>
  </body>
</html>
