<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.midnightnoon.learn2code.app.model.dto.FilmDto" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Vyber žáner pre zobrazenie filmov:</h2>
<form method='post' action='filmycont'>
    <select name='zaner'>
        <option value='akcne'>Akčné</option>
        <option value='scifi'>Sci-fi</option>
    </select>
<input type='submit' name='Vyber'/>
</form>

<h4>Filmy:</h4>
<ul>
<%
List<FilmDto> films = (List<FilmDto>) request.getAttribute("filmy");
if(films != null){
    for(FilmDto film : films){
        out.print("<li>" + film.getNazov() + "</li>");
    }
}
%>
</ul>

<ul>
<c:forEach items="${filmy}" var="film">
    <li>${film.nazov} - ${film.zaner}</li>
</c:forEach>
</ul>

<c:out value="${film.nazov}"/>

<c:set var="meno" scope="application" value="Jaro"/>
<br>
meno > <c:out value="${applicationScope.meno}"/>
<c:remove var="meno"/>
<br>

<c:if test="${vek < 18}">
    <p>Vek je menej ako 18 a je to presne: <c:out value="${vek}"/></p>
</c:if>

<br>
<c:choose>
    <c:when test="${vek > 18}">
        <c:out value="Vek ${vek} je viac ako 18"/>
    </c:when>
    <c:when test="${vek < 18}">
        <c:out value="Vek ${vek} je menej ako 18"/>
    </c:when>
    <c:otherwise>
        <c:out value="Vek ${vek} je 18 rokov"/>
    </c:otherwise>
</c:choose>


</body>
</html>