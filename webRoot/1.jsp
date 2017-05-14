<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/itcast" prefix="itcast"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Tag自定义标签</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  你的ip地址为：
  <itcast:ViewIP/>
  <br>
  <itcast:demo1>
  	abcd
  </itcast:demo1>
  <itcast:demo2>
  看不到我
  </itcast:demo2>
  
  <itcast:dem03 out="false">
  haha, 看不到我
  </itcast:dem03>
  <br>
  <itcast:dem03 out="true">哎呦，居然被你看到了</itcast:dem03><br>
  <itcast:demo4 name=""></itcast:demo4>
  
  <itcast:demo5>nihoao</itcast:demo5><br>
  
  <!-- 重复输出 标签体内容 -->
  <itcast:demo6 num="8">中国必胜！</itcast:demo6>
  
  <!-- 改变标签体内容 -->
  <itcast:demo7>wojiushiwo!@</itcast:demo7>
  
  </body>
</html>
