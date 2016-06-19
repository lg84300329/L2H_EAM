<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-06-15
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>L2H_EAM系统登陆页面</title>



    <style type="text/css">
        /* Reset css*/
        * {
            font-size: 12px;
        }

        html {
            margin: 0;
            padding: 0;
        }

        body {
            background-color: #ededed;
            color: #b5b5b5;
            font-family: "宋体",arial;
            font-size: 12px;
            font-style: normal;
            margin: 0;
            padding: 0;
        }
        /*普通连接*/
        a {
            color: #b5b5b5;
            cursor: pointer;
            text-decoration: none;
        }

        a:hover {
            color: #c1272d;
        }

        h1, h2, h3, h4, h5, h6, form, div, p, i, img, ul, li, ol, table, tr, td, dl, dt, dd, fieldset, label, legend {
            margin: 0;
            padding: 0;
        }

        ul li {
            list-style: none;
        }

        fieldset, img, table {
            border: none;
        }

        td {
            font-size: 12px;
            line-height: 180%;
        }

        form {
            margin: 0px;
            padding: 0px;
        }

        *:focus {
            outline: none;
        }

        .clear {
            clear: both;
        }

        .hide {
            display: block;
            overflow: hidden;
            text-indent: -900px;
        }
        /*主体部分*/
        .main {
            background: url("../../../images/header_bg.png") top repeat-x;
            min-width: 1000px;
            overflow: hidden;
            width: 100%;
            height: auto;
        }

        .header {
            background: url("../../../images/logo_icosy2.png") no-repeat top center;
            margin: 123px auto 0;
            width: 350px;
            height: 41px;
        }
        /*中部内容部分*/
        .content {
            background: url("../../../images/login_bg.png") no-repeat top center;
            margin: 69px auto 0;
            width: 423px;
            height: 366px;
            border: 1px solid #ededed;
        }

        .title {
            background: url("../../../images/member_title.png") no-repeat top left;
            margin: 37px auto 20px;
            width: 229px;
            height: 36px;
        }

        .input {
            margin: 0 auto 11px;
            width: 237px;
        }

        .input_all {
            border: none;
            color: #555;
            font-size: 14px;
            line-height: 30px;
            padding: 10px 0 10px 46px;
            vertical-align: middle;
            width: 237px;
            height: 30px;
        }

        .name {
            background: url("../../../images/input_name.png") no-repeat top left;
        }

        .name_now {
            background: url("../../../images/input_name_hover.png") no-repeat top left;
        }

        .password {
            background: url("../../../images/input_password.png") no-repeat top left;
        }

        .password_now {
            background: url("../../../images/input_password_hover.png") no-repeat top left;
        }

        .enter {
            margin-top: 15px;
        }

        .button {
            background: url("../../../images/button.png") no-repeat center;
            border: none;
            cursor: pointer;
            margin: 0 auto;
            width: 150px;
            height: 55px;
        }

        .checkbox {
            font-size: 12px;
            margin: 0 auto;
            width: 237px;
            height: 30px;
        }

        .checkbox input {
            display: block;
            float: left;
            margin-right: 4px;
        }

        .checkbox span {
            display: block;
            float: left;
            xheight: 20px;
            line-height: 20px;
            *line-height: 22px;
        }
    </style>
    <script type="text/javascript" >

           function submit_form(){

                if(checkMsg()==true){
                   $("#login_form").attr("action","login.do");
                    $("#login_form").attr("method","post");
                    $("#login_form").submit();
                }
            };

        //校验提交的数据是否合法
        function checkMsg(){


            if($.trim($("#account").val())=="") {

                $("#account_warn").css("display","block");
                $("#account").focus();

                  return false;

            }
            else
            {
                $("#account_warn").css("display","none");
            }

            if($.trim($("#password").val())=="")
            {
              //  $("#password_warn").visibility="visible";
                $("#password_warn").css("display","block");
                $("#password").focus();
                return false;
            }
            else
            {
                $("#password_warn").css("display","none");
            }


            return true;

        }

    </script>
</head>

<body>
<div class="main">

    <div class="header "></div>
    <div class="content">

        <div class="title hide">管理登录</div>
        <form id="login_form" >

            <div class="input">
                <input class="input_all name" name="account" id="account" placeholder="用户名" type="text" onfocus="this.className='input_all name_now';" onblur="this.className='input_all name'" maxlength="24" />
                <label  id="account_warn"   style="display: none; color:red">用户名不能为空 </label>
            </div>
            <div class="input">
                <input class="input_all password" name="password" id="password" type="password" placeholder="密码" onfocus="this.className='input_all password_now';" onblur="this.className='input_all password'" maxlength="24" />
                <label  id="password_warn" style="display: none; color:red " >密码不能为空 </label>
            </div>

            <label  id="tips" style= "color:red ;margin-left: auto"> ${errorMsg} </label>

            <div class="enter">
                <input class="button hide" id="login_btn" value="登录" type="button" onclick="submit_form()" />
            </div>

        </form>

    </div>


</div>

<div style="height:32px; line-height:32px; text-align:center; margin-top:250px">
    Copyright © 2015 柳钢热轧厂版权所有
</div>
<script type="text/javascript" src="../../js/jquery-1.5.2.min.js"/>
<script type="text/javascript" src="../../js/placeholder.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="../../js/belatedpng.js" ></script>
<script type="text/javascript">
    DD_belatedPNG.fix("*");
</script>
<![endif]-->
</body>
</html>

