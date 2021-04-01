<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>access denied</title>
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
            <img src="${pageContext.request.contextPath}/resources/log/img/sad_face.svg">
        </div>
        <div class="confirm-container">
            <div class="content">
                <h2>Password or email incorrect</h2>
                <i class="fas fa-exclamation-circle"></i>
                <div class="btn-container">
                    <a href="${pageContext.request.contextPath}/register" class="btn-action">Register now!!!</a>
                </div>
            </div>
        </div>
    </div>
</body>

</html>