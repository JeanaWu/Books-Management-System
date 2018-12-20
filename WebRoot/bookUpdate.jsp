<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>



<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>图书更新</title>
    <body>
    <div align="center">
    <form id="form1" name="from1" method="post" action="update" >
    <table border="1">
	<tr><td>书号</td><td><input name="bid" type="text" id="bid"/></td></tr>

    <tr><td>数量</td><td><input name="bamount" type="text" id="bamount"/></td></tr>
    </table>
    <br>
    <input name="submit" type="submit" value="确定"/>
    <input name="reset"  type="reset"  value="重置"/>
    </form>
    </div>

    </body>
</html>