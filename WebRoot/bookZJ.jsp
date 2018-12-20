<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书增加</title>
</head>
 <body>
    <div align="center">
    <form id="form1" name="from1" method="post" action="add" >
    <table border="1">
    <tr><td>书号</td><td><input name="tbook.bid" type="text" id="bid"/></td></tr>
    <tr><td>书名</td><td><input name="tbook.bname" type="text" id="bname"/></td></tr>
    <tr><td>作者</td><td><input name="tbook.bauther" type="text" id="bauther"/></td></tr>
    <tr><td>类型</td><td><input name="tbook.btype" type="text" id="btype"/></td></tr>
    <tr><td>价格</td><td><input name="tbook.bprice" type="text" id="bprice"/></td></tr>
    <tr><td>数量</td><td><input name="tbook.bamount" type="text" id="bamount"/></td></tr>
    <tr><td>出版日期</td><td><input name="tbook.bpubdate" type="text" id="bpubdate"/></td></tr>
    
  
    </table>
    <br>
    <input name="submit" type="submit" value="确定"/>
    <input name="reset"  type="reset"  value="重置"/>
    </form>
    </div>

    </body>
</html>