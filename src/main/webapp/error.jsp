<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
   <title>Login</title>
   <style>
      *{
         margin: 0;
         padding: 0;
         box-sizing: border-box;
      }
      body{
         min-height: 100vh;
         background: #eee;
         display: flex;
         font-family: sans-serif;
      }
      .container{
         margin: auto;
         width: 500px;
         max-width: 90%;
      }
      .container form{
         width: 100%;
         height: 100%;
         padding: 20px;
         background: white;
         border-radius: 4px;
         box-shadow: 0 8px 16px rgba(0,0,0,.3);
         font-size: x-large;
      }
      .container form h2{
         text-align: center;
         margin-bottom: 24px;
         color: #222;
      }
      .container form p{
         text-align: center;
         margin-bottom: 20px;
         color: #e60000;
         margin-top: 10px;
         margin-top: 10px;
         margin-bottom: 5px;
      }
      label {
         float: left;
         text-align: right;
         margin: 1px 0 30px 0;
      }
      .container form .form-control{
         float: right;
         width: 70%;
         height: 40px;
         font-size: 16px;
         background: white;
         border-radius: 4px;
         border: 1px solid silver;
         margin: 1px 0 18px 0;
         padding: 0 10px;
      }
      .container form .btn{
         margin-left: 50%;
         transform: translateX(-50%);
         width: 120px;
         height: 34px;
         border: none;
         outline: none;
         font-size: 16px;
         text-transform: uppercase;
         border-radius: 4px;
         transition: .3s;
      }
   </style>
</head>

<body>
<div class="container">
   <s:form action="loginaction" >
      <h2>Login Here</h2>
      <div class = "form-group">
         <label for="user">User: </label>
         <s:textfield name="user" class = "form-control" />
         <label for="password">Password: </label>
         <s:password name="password" class = "form-control" />
         <s:submit value="submit" class = "btn" />
      </div>
      <p>Login failed, please try again</p>
   </s:form>
</div>
</body>
</html>
