<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<%@ page errorPage="exception.jsp" %>
<% 
  Calendar rightNow = null;
  
  //���д��뽫����NullPointerException�쳣
  rightNow.getTime(); 
%>