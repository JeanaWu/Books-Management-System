<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>�۸��ѯ</title>
    <body>
    <div align="center">
    <form id="form1" name="from1" method="post" action="fprice" >
    <table border="1">
    <tr><td>��ͼ۸�</td><td><input name="min" type="text" id="bprice1"/></td></tr>
    <tr><td>��߼۸�</td><td><input name="max" type="text" id="bprice2"/></td></tr>
  	</table>
    <br>
    <input name="submit" type="submit" value="ȷ�ϡ�"/>
    <input name="reset"  type="reset"  value="����"/>
    </form>
    </div>

    </body>
</html>