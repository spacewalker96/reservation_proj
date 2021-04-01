<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/home/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
    <title>Responsive Landing Page with Nav Menu</title>
</head>

<body>
    <header>
        <h1>Youcode</h1>

        <section class="menu">
            <ul class="menu-list">
               <!--   <li>Home</li>
                <li class="active">Products</li>-->
              
                 <a href="register">  <li>Register</li></a>
                  <li><a href="login"> Login</a></li>
            </ul>

            <button>
                <i class="fas fa-times"></i>
                <i class="fas fa-bars"></i>
            </button>
        </section>
    </header>

    <section class="main">

        <section class="left">
            <p class="title">L'ecole YouCode</p>
            <p class="msg">
	Le numerique et les nouvelles technologies sont partout autour de nous, mais
 	leurs codes et leurs langages ne sont pas toujours naturels et innes pour tous.
  	La fracture entre ceux qui parlent le numerique et le manipulent avec aisance et
   	les autres est souvent tres grande. C'est pourquoi YouCode veut mettre le code
    entre toutes les mains pour reduire les inegalites numeriques et donner sa chance
     a tout un chacun.</p>
           <a href="${pageContext.request.contextPath}/register"><button class="cta">Inscription</button></a> 
        </section>

        <section class="right">
            <img src="${pageContext.request.contextPath}/resources/home/images/img.svg" alt="Langing image">
        </section>

    </section>

    <script>
        var menu = document.querySelector('.menu');
        var menuBtn = document.querySelector('.menu button');
        menuBtn.addEventListener('click', () => {
            menu.classList.toggle('opened')
        })
    </script>


</body>

</html>