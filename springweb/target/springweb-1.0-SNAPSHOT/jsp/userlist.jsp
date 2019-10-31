<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table align="center" border="0" width="80%">
    <tr>
        <td align="left">
            用户列表&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" name="btnAdd" value="添加" onclick="useradd()"/>
        </td>
    </tr>
    <tr>
        <td>
            <table border="1" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td align="center" width="5%">序号</td>
                    <td align="left" width="20%">姓名</td>
                    <td align="center" width="10%">性别</td>
                    <td align="center" width="25%">学号</td>
                    <td align="center" width="20%">班级</td>
                    <td align="center">操作</td>
                </tr>
                <c:forEach items="${userlist}" var="user">
                    <tr>
                        <td align="center" width="5%">${user.userId}</td>
                        <td align="left" width="20%">${user.userName}</td>
                        <td align="center" width="10%">${user.sex}</td>
                        <td align="center" width="25%">${user.userNo}</td>
                        <td align="center" >${user.clazz}</td>
                        <td align="center">
                            <input type="button" name="btnEdit" value="修改" onclick="useredit(${user.userId})"/>
                            &nbsp;&nbsp;
                            <input type="button" name="btnDel" value="删除" onclick="userdel(${user.userId})"/>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
<script language="JavaScript">

    function useradd() {
        //跳转到添加页面
        window.location.replace("${pageContext.request.contextPath}/touseradd");
    }
    function useredit(userId) {
        window.location.replace("${pageContext.request.contextPath}/touseredit?userId="+userId);
    }
    function userdel(userId) {
        if(confirm("确认删除吗")){
            window.location.replace("${pageContext.request.contextPath}/userdel?userId="+userId);
        }
    }
</script>
</body>
</html>
