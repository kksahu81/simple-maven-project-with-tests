<html>
<body>
<h2>Hello World! and Today is 8th Nov</h2>
</body>
</html>
<%@ page import = "java.util.ResourceBundle" %> 
<% ResourceBundle resource = ResourceBundle.getBundle("test");

String version=resource.getString("version");%>

<%=version %>
