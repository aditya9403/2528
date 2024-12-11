<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Passwords</th>
</tr>

<c:forEach var="e" items="${ee}">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>
<td>${e.passwords}</td>
<td>
<a href="del?id=${e.id}">DELETE</a>
<a href="">EDIT</a>
</td>
</tr>
</c:forEach>
</table>