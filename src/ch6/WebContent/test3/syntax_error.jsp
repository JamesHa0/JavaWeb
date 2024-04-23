<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<%@ page errorPage="exception.jsp" %>
<% 
  Calendar rightNow = null;
  
  //下行代码将产生NullPointerException异常
  rightNow.getTime(); 
%>