<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<html>
<body>
<h2>Hello World! <%=new Date()%></h2>

<%
    int j = 0;
    int k = 1;
    int l = j + k;
%>

Hodnota l je <%=l%><br>

<%=l+4%><br>
<%=new String("jaro")%><br>
<%="jaro beno"%><br>

<%!
public int spocitaj(int a, int b){
    return a+b;
}
%>

<p>Spocitaj a + b =<%=spocitaj(10,5)%></p>

<%
    String sprava = request.getParameter("sprava");
%>
<h2><%= sprava %></h2>

<%@ include file="/footer.jsp"%>
</body>
</html>
