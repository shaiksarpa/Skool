<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>School Management</title>
<meta charset="utf-8">
<sj:head jqueryui="true" jquerytheme="start" />
<link rel="shortcut icon" href="images/school.ico" type="image/x-icon">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Molengo_400.font.js"></script>
<script type="text/javascript" src="js/Expletus_Sans_400.font.js"></script>

</head>

<body id="page1">
    <div class="body1">
        <div class="main">
<!-- header -->
            <header>
                <div class="wrapper">
                <nav>&nbsp;</nav>
                <div class="right">
                    <s:form action="login" id="loginForm" method="post">
                        <label for="username" id="label">Username: </label>
                            <input type="text" name="username" id="username" size="20" value="">&nbsp;&nbsp; 
                        <label for="password" style="font-weight: bold;" class="menu-item" id="label">Password:</label>
                            <input type="password" name="password" size="20" value="">&nbsp;&nbsp;
                                            <s:hidden name="LOGIN_ATTEMPT" value="LOGIN_ATTEMPT" />
                            
                           <input type="submit" value="Login">
                        </s:form>  
                      </div>              
                </div>

                <div id="slogan">
                    Sai Sree
                    <br/><span>Educational Center</span>
                </div>

            </header>
<!-- / header -->
        </div>
    </div>
    <div class="body2">
        <div class="main">
<!-- content -->
            <section id="content">
                <div class="wrapper">
                    <div class="pad1 pad_top1">
                        <article class="cols marg_right1">
                            <figure><a href="#"><img src="images/page1_img1.jpg" alt=""></a></figure>
                            <span class="font1">Our Mission Statement</span>
                        </article>
                        <article class="cols marg_right1">
                            <figure><a href="#"><img src="images/page1_img2.jpg" alt=""></a></figure>
                            <span class="font1">Performance Report</span>
                        </article>
                        <article class="cols">
                            <figure><a href="#"><img src="images/page1_img3.jpg" alt=""></a></figure>
                            <span class="font1">Prospective Parents</span>
                        </article>
                    </div>
                </div>

            </section>
<!-- content -->

        </div>
    </div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
</body>
</html>