<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
            font-family: sans-serif;
         }
      </style>
   </head>


   <body class="center">
      <h2>Successful login, <s:property value = "personBean.name"/></h2>
   </body>

</html>