<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>价格查询</title>
    <body>
    <div align="center">
    <form id="form1" name="from1" method="post" action="fprice" >
    <table border="1">
    <tr><td>最低价格</td><td><input name="min" type="text" id="bprice1"/></td></tr>
    <tr><td>最高价格</td><td><input name="max" type="text" id="bprice2"/></td></tr>
  	</table>
    <br>
    <input name="submit" type="submit" value="确认¨"/>
    <input name="reset"  type="reset"  value="重置"/>
    </form>
    </div>

    </body>
</html>