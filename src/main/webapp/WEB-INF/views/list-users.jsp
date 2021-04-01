<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!--  This file has been downloaded from bootdey.com    @bootdey on twitter -->
    <!--  All snippets are MIT license http://bootdey.com/license -->
    <title>List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <style type="text/css">
    	body{
    background:#eee;    
}
.main-box.no-header {
    padding-top: 20px;
}
.main-box {
    background: #FFFFFF;
    -webkit-box-shadow: 1px 1px 2px 0 #CCCCCC;
    -moz-box-shadow: 1px 1px 2px 0 #CCCCCC;
    -o-box-shadow: 1px 1px 2px 0 #CCCCCC;
    -ms-box-shadow: 1px 1px 2px 0 #CCCCCC;
    box-shadow: 1px 1px 2px 0 #CCCCCC;
    margin-bottom: 16px;
    -webikt-border-radius: 3px;
    -moz-border-radius: 3px;
    border-radius: 3px;
}
.table a.table-link.danger {
    color: #e74c3c;
}
.label {
    border-radius: 3px;
    font-size: 0.875em;
    font-weight: 600;
}
.user-list tbody td .user-subhead {
    font-size: 0.875em;
    font-style: italic;
}
.user-list tbody td .user-link {
    display: block;
    font-size: 1.25em;
    padding-top: 3px;
    margin-left: 60px;
}
a {
    color: #3498db;
    outline: none!important;
}
.user-list tbody td>img {
    position: relative;
    max-width: 50px;
    float: left;
    margin-right: 15px;
}

.table thead tr th {
    text-transform: uppercase;
    font-size: 0.875em;
}
.table thead tr th {
    border-bottom: 2px solid #e7ebee;
}
.table tbody tr td:first-child {
    font-size: 1.125em;
    font-weight: 300;
}
.table tbody tr td {
    font-size: 0.875em;
    vertical-align: middle;
    border-top: 1px solid #e7ebee;
    padding: 12px 8px;
}
a:hover{
text-decoration:none;
}
    </style>
</head>
<body>
<div class="container">

			<h2>Users list</h2>
			</div>

<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
<hr>
<div class="container bootstrap snippets bootdey">
    <div class="row">
        <div class="col-lg-12">
            <div class="main-box no-header clearfix">
                <div class="main-box-body clearfix">
                    <div class="table-responsive">
                        <table class="table user-list">
                            <thead>
                                <tr>
                                <th ><span>Id</span></th>
                                <th ><span>First Name</span></th>
                                <th class="text-center"><span>Last Name</span></th>
                                <th ><span>Email</span></th>
                                <th><span>Role</span></th>
                                <th>&nbsp;</th>
                                </tr>

                            </thead>
                             <c:forEach var="user" items="${users}">
                            <tbody>
                                <tr>
                      
                                <tr>
                                    <td>
                                     
                                        ${user.idUser}
                                    </td>
                                    <td>${user.nom}</td>
                                    <td class="text-center">
                                       ${user.prenom}
                                    </td>
                                    <td >
                                      ${user.email} 
                                    </td>
                                     <td>
                                     <span class="label label-success"> ${user.role.roleName}</span>
                                    </td>
                                    
                                </tr>
                                
                            </tbody>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>
</body>
</html>