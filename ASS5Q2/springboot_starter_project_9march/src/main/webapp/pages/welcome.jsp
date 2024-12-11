<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Address</th>

<th>Action</th>
</tr>
<c:forEach var="e" items="${sr}">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>
<td>
<a href="del?id=${e.id}">DELETE</a>
<a href="edit?id=${e.id}">EDIT</a>
</td>
</tr>
</c:forEach>
</table>