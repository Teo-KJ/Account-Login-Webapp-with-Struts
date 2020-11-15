<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1"
   pageEncoding = "ISO-8859-1"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
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
         }
         .container form h2{
            text-align: center;
            margin-bottom: 24px;
            color: #222;
         }
         .container form .form-control{
            width: 100%;
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
         .center {
            margin: 0;
            position: absolute;
            top: 50%;
            left: 50%;
            -ms-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
         }
      </style>
   </head>
   
   <body>
      <div  class="container">
         <form action = "loginaction" method = "post">
            <h2>Login Here</h2>
            <div class = "form-group">
               <label for=""> User:</label>
               <input type = "text" name = "user" class = "form-control"><br/>
            </div>
            <div>
               <label for=""> Password:</label>
               <input type = "password" name = "password" class = "form-control"><br/>
            </div>
            <input type = "submit" class = "btn" value = "Login">
         </form>
      </div>
   </body>
</html>
