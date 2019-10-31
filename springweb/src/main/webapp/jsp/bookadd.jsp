<%--
  Created by IntelliJ IDEA.
  User: lh
  Date: 2019/6/6
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<form name="frmbook" method="post"
      action="${pageContext.request.contextPath}/bookAdd">
    <table width="60%" border="1" align="center">
        <tr>
            <td width="20" align="right">图书名称</td>
            <td><input type="text" name="name" size="30"></td>
        </tr>
        <tr>
            <td align="right">出版社</td>
            <td><input type="text" name="publisher" size="30"></td>
        </tr>
        <tr>
            <td align="right">价格</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="保存">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
