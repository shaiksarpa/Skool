<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Payments</title>
    <link rel="shortcut icon" href="images/school.ico" type="image/x-icon">
    <link href="css/styles.css" rel="stylesheet" type="text/css" />
    <sj:head jqueryui="true" jquerytheme="start" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Content-Style-Type" content="text/css" />
</head>
<script language="text/javascript">
</script>
<body>
<div class="container">
<s:url id="remoteurl" action="populateClass"/>
<div class="header">
    <div class="main-menu">
        <a href="terminalManagerList" class="menu-item"> Home </a> |
        <a href="logout?LOGOUT_ATTEMPT=LOGOUT" class="menu-item">Logout</a>
    </div>
    <div class="logo">
    </div>
    <!-- end .header -->
</div>
<div class="main-nav">
        <div class="usernameHeader">
            Welcome
        </div>
</div>
    <s:actionerror />
    <s:actionmessage />
  <div class="content">
    <div id="sidebar">
    </div>
    <div id="main">
    <s:form id="paymentForm" name="paymentForm" action="payment" method="post" validate="true">
              <div>
                <s:url var="remoteurl" action="populateClass"/>
                <sj:select 
                    href="%{remoteurl}"
                    id="medium" 
                    name="medium" 
                    onChangeTopics="reloadsecondlist"
                    list="mediumList" 
                    listKey="code" 
                    listValue="description" 
                    value="medium"
                    headerKey="-1" 
                    headerValue="--Medium--" 
                    label="Medium"/>
                 </div>
               <div>
                    <sj:select 
                        id="selectedClass"
                        href="%{remoteurl}"
                        formIds="paymentForm" 
                        name="selectedClass"
                        reloadTopics="reloadsecondlist"
                        onChangeTopics="reloadthirdlist"
                        list="classList" 
                        headerKey="-1" 
                        headerValue="--Class--"
                        label="Class"/>
               </div>
               <div>
                    <sj:select 
                        id="student"
                        href="%{remoteurl}"
                        formIds="paymentForm" 
                        name="student"
                        reloadTopics="reloadthirdlist"
                        list="studentList" 
                        headerKey="-1" 
                        headerValue="--Student--"
                        label="Student"/>
               </div>
               
    </s:form>
    </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
  
 </div>
</body>
</html>