<%-- 
    Document   : viewnote
    Created on : 4-Oct-2021, 10:50:50 PM
    Author     : kisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Simple Note Keeper</h1>
        </div>
        
        <div>
            <h2>View Note</h2>
        </div>
        
        <div>
            <h3>Title: ${note.title}</h3> 
        </div>
        
        <div>
            <h3>Contents: ${note.contents}</h3> 
        </div>
        
        <p> <a href="note?edit">Edit</a></p>
    </body>
</html>
