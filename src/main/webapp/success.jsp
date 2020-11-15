<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<html>
   <head>
      <title>Successful Login</title>
      <style>
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


   <body class="center">
      <h3>Successful login, <s:property value = "name"/></h3>
   </body>

</html>