<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Entrar</title>
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
            <img src="${pageContext.request.contextPath}/resources/log/img/authentication.svg">
        </div>
        <div class="login-container">
            <form:form action="login" modelAttribute="user1" method="POST">
                <h2>Login</h2>
                <p>Enter you information !</p>
                <div class="input-div one">
                    <div class="i">
                        <i class="fas fa-user"></i>
                    </div>
                    <div>
                        <h5>Email</h5>
                        <form:input class="input" type="email" path="email"/>
                    </div>
                </div>
                <div class="input-div two">
                    <div class="i">
                        <i class="fas fa-key"></i>
                    </div>
                    <div>
                        <h5>Pasword</h5>
                        <form:input class="input" type="password" path="password"/>
                    </div>
                </div>
                <input type="submit" class="btn" value="Login">
                <!-- <a class="forgot" href="forgotPassword.html">Forget password</a> -->
                <div class="others">
                    <hr>
                    <p>OU</p>
                    <hr>
                </div>
                <div class="social">
                    <div class="social-icons facebook">
                        <a href="#"><img src="${pageContext.request.contextPath}/resources/log/img/facebook.png">Login with Facebook</a>
                    </div>
                    <div class="social-icons google">
                        <a href="#"><img src="${pageContext.request.contextPath}/resources/log/img/google.png">Login with Google</a>
                    </div>
                </div>
                <div class="account">
                    <p>You don't have acount ?</p>
                    <a href="${pageContext.request.contextPath}/register">Register</a>
                </div>
            </form:form>
        </div>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/log/js/main.js"></script>
</body>

</html>