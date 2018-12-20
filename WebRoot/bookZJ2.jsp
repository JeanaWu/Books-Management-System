<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书增加</title>
</head>
 <body>
    <div align="center">
    <s:form action="add.action" method="post">
    <table border="1">
    <tr><td>书号</td><td><s:textfield name="tbook.bid"/>
   </td></tr>
    <tr><td>书名</td><td><s:textfield name="tbook.bname"/></td></tr>
     </table>
    <br>
    <input name="submit" type="submit" value="确定"/>
    <input name="reset"  type="reset"  value="重置"/>
</s:form>
    </div>

    </body>
</html>