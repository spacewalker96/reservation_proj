<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <!-- Custom styles-path -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/log/css/style.css">

    <!-- Font Awesome kit script -->
    <script src="https://kit.fontawesome.com/a81368914c.js"></script>

    <!-- Google Fonts Open Sans-->
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">

    <!-- Favicon -->
    <link rel="icon" href="${pageContext.request.contextPath}/resources/log/img/html-5.png">
</head>

<body>
    <img class="wave" src="${pageContext.request.contextPath}/resources/log/img/wave.svg">
    <div class="container">
        <div class="img">
            <img src="${pageContext.request.contextPath}/resources/log/img/login-mobile.svg">
        </div>
        <div class="login-container">
            <form:form action="saveUser" modelAttribute="user" method="POST">
                <h2>Register</h2>
                <p>Register with :</p>
                <div class="social">
                    <div class="social-icons facebook">
                        <a href="#"><img src="${pageContext.request.contextPath}/resources/log/img/facebook.png">Facebook</a>
                    </div>
                    <div class="social-icons google">
                        <a href="#"><img src="${pageContext.request.contextPath}/resources/log/img/google.png">Google</a>
                    </div>
                </div>
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div>
                        <h5>first name</h5>
                        <form:input class="input" type="text" path="prenom"/>
                    </div>
                </div>
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div>
                        <h5>last name</h5>
                        <form:input class="input" type="text"  path="nom"/>
                    </div>
                </div>
                <div class="input-div two">
                    <div class="i">
                        <i class="fas fa-envelope"></i>
                    </div>
                    <div>
                        <h5>E-mail</h5>
                        <form:input class="input" type="email" path="email"/>
                    </div>
                </div>
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-key"></i>
                    </div>
                    <div>
                        <h5>Password</h5>
                        <form:input class="input" type="password"  path="password"/>
                    </div>
                </div>
                
                <div class="btn-container">
                    <!-- <a href="sucess.html" class="btn-action">Save</a> -->
                     <input type="submit"  class="btn-action"" value="Register"/>
                </div>
                <div class="account">
                    <p>Already have acount ?</p>
                    <a href="${pageContext.request.contextPath}/login">Login</a>
                </div>
       
            </form:form>
        </div>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/log/js/main.js"></script>
</body>

</html>