<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="/arquitetura-software/public/css/style.css">
    <link rel="stylesheet" href="public/js/script.js"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="content first-content">
            <div class="first-column">
                <h2 class="title title-primary">Bem-vindo de volta!</h2>
                <p class="description description-primary">Para continuar conectado conosco,</p>
                <p class="description description-primary">preencha com seus dados pessoais</p>
            </div>    
            <div class="second-column">
                <h2 class="title title-second">Login</h2>
                <p class="description description-second">or use your email for registration:</p>
                <form action="pedido-estagio" method="post" class="form">
                    <!-- Adicionando campos de email e senha -->
                    <label class="label-input">
                        <i class="far fa-envelope icon-modify"></i>
                        <input type="email" name="email" placeholder="Email" required>
                    </label>
                    
                    <label class="label-input">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="password" name="password" placeholder="Password" required>
                    </label>
                    
                    <!-- Botão de login -->
                    <button type="submit" class="btn btn-second">Sign In</button>        
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
        
        <div class="content second-content">
            <div class="first-column">
                <h2 class="title title-primary">Hello, Friend!</h2>
                <p class="description description-primary">Enter your personal details</p>
                <p class="description description-primary">and start your journey with us</p>
                <button id="signup" class="btn btn-primary">Sign up</button>
            </div>
            <div class="second-column">
                <h2 class="title title-second">Sign in to Developer</h2>
                <div class="social-media">
                    <ul class="list-social-media">
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-facebook-f"></i>
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-google-plus-g"></i>
                            </li>
                        </a>
                        <a class="link-social-media" href="#">
                            <li class="item-social-media">
                                <i class="fab fa-linkedin-in"></i>
                            </li>
                        </a>
                    </ul>
                </div><!-- social media -->
                <p class="description description-second">or use your email account:</p>
                <form action="UserLoginServelet" method="post" class="form">
                    <label class="label-input">
                        <i class="far fa-envelope icon-modify"></i>
                        <input type="email" placeholder="Email" required>
                    </label>
                    
                    <label class="label-input">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="password" name="password" placeholder="Password" required>
                    </label>
                
                    <a class="password" href="#">Forgot your password?</a>
                    <button type="submit" class="btn btn-second">Sign In</button>
                </form>
            </div><!-- second column -->
        </div><!-- second-content -->
    </div>
    <script src="js/app.js"></script>
</body>
</html>
