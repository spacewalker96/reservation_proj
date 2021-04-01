<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>

<body>


  	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Admin page</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="${pageContext.request.contextPath}/admin-user">User list <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="${pageContext.request.contextPath}/admin-reservation">Reservation</a>
	 <a href="${pageContext.request.contextPath}/logout" ><button class ="btn btn-danger float-right">Logout</button></a>
		
    </div>
  </div>
</nav>
<div class="container">
 
 
 <h2>Users list</h2>

 <table class="table table-hover table-light">
  <thead>
    <tr>
      <th class="table-primary" scope="col">Id User</th>
      <th class="table-primary" scope="col">First Name</th>
      <th class="table-primary" scope="col">Last Name</th>
      <th class="table-primary" scope="col">Email</th>
      <th class="table-primary" scope="col">Role</th>
    </tr>
  </thead>
   <c:forEach var="user" items="${users}">
  <tbody>
    <tr>
      <th scope="row"> ${user.idUser}</th>
      <td>${user.nom}</td>
      <td>${user.prenom}</td>
      <td>${user.email} </td>
      <td> <span class="badge badge-pill badge-warning">${user.role.roleName} </span> </td>
    </tr>

  </tbody>
   </c:forEach>
</table>
 
</div>

</body>
</html>
