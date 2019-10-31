<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息</title>
</head>
<body>
<form id="frmuser" name="frmuser" method="post">
    <!--使用一个隐藏域保存用户Id-->
    <input type="hidden" name="userId" value="${user.userId}">
    <table align="center" border="0" width="60%">
        <tr>
            <td align="left">
                修改用户信息&nbsp;&nbsp;&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <table border="1" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td align="right" width="30%">姓名</td>
                        <td><input type="text" name="userName" value="${user.userName}"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">性别</td>
                        <td><input type="text" name="sex" value="${user.sex}"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">学号</td>
                        <td><input type="text" name="userNo" value="${user.userNo}"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">班级</td>
                        <td><input type="text" name="clazz" value="${user.clazz}"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">出生地</td>
                        <td><input type="text" name="birthPlace" value="${user.birthPlace}"></td>
                    </tr>
                    <tr>
                        <td align="right" width="30%">住址</td>
                        <td><input type="text" size="70" name="address" value="${user.address}"></td>
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
        document.frmuser.action="${pageContext.request.contextPath}/useredit";
        document.frmuser.submit();

    }
    function usercancel() {
        window.location.replace("${pageContext.request.contextPath}/touserlist");
    }
</script>

</body>
</html>
