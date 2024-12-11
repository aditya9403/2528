<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Action</th>
</tr>

<c:forEach var="e" items="${ee}">
<tr>
<td>${e.sid}</td>
<td>${e.sname}</td>
<td>${e.semail}</td>
<td>
<a href="del?sid=${e.sid}">DELETE</a>
<a href="">EDIT</a>
</td>
</tr>
</c:forEach>
</table>