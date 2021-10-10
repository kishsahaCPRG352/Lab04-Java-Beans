<%-- 
    Document   : editnote
    Created on : 4-Oct-2021, 10:51:04 PM
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
            <h2>Edit Note</h2>
        </div>
        
        <form method="POST" action="note">
            <div>
                <label>
                    Title:
                </label>
                <input type="text" name="title" value="${note.title}">                
            </div>
             <div>
                <label>
                    Contents:
                </label>
                 <textarea name="contents"> ${note.contents} </textarea>                
            </div>
            
            <div> 
                <input type="submit" value="Save">
        </form>
    </body>
</html>
