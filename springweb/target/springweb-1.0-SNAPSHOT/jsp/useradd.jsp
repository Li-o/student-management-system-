<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form id="frmuser" name="frmuser" action="" method="post">

    <table align="center" border="0" width="60%">
        <tr>
            <td align="left">
                添加用户&nbsp;&nbsp;&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <table border="1" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td align="right" width="30%">姓名</td>
                        <td><input type="text" name="userName"></td>
                         <%--跟model属性类大小写一样--%>
                    </tr>
                    <tr>
                        <td align="right" width="30%">性别</td>
                        <td><input type="text" name="sex"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">学号</td>
                        <td><input type="text" name="userNo"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">班级</td>
                        <td><input type="text" name="clazz"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">出生地</td>
                        <td><input type="text" name="birthPlace"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">住址</td>
                        <td><input type="text" size="70" name="address"></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td align="center">
                <input type="button" name="btnsave" value="保存" onclick="usersave()"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" name="btnReset" value="重置"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="button" name="btnCancel" value="取消" onclick="usercancel()"/>
            </td>
        </tr>
    </table>
</form>
<script language="JavaScript">
    function usersave() {
        document.frmuser.action="${pageContext.request.contextPath}/useradd";
        document.frmuser.submit();

    }
    function usercancel() {
        window.location.replace("${pageContext.request.contextPath}/touserlist");
    }
</script>
</body>
</html>
