/*9.c	Build a Session Management using JSP program for getting session expiry time and your name through text box and press submit to display the message by greeting Hello your name!.
press the following link to check it within the set session time or wait there for the minutes set to see the session expiry.

*/
<%@ page language="java" %>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Go Back</a>
<%
    } else {
%>
        <h2>Hello again <%= user %>!</h2>
        <p>Session is still active.</p>
<%
    }
%>

</body>
</html>
