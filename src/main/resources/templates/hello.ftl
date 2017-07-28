<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <#--<p th:text="'Hello, ' + ${name} + '!'" />-->
<div>
    <#if name??>
   <span style="color: red;font-size: 20px">it is the page used by ftl:<span>
   <span style="color: blue;font-size: 50px"> ${name}<span>
    </#if>
</div>
</body>
</html>
