<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="public/css/style.css">
    <link rel="stylesheet" href="public/js/script.js"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="content first-content">
            <div class="first-column">
                <h2 class="title title-primary">welcome back!</h2>
                <p class="description description-primary">To keep connected with us</p>
                <p class="description description-primary">please login with your personal info</p>
                <button id="signin" class="btn btn-primary">sign in</button>
            </div>    
            <div class="second-column">
                <h2 class="title title-second">Etapa 3</h2>
                <p class="description description-second">Informe seus dados:</p>
                <form class="form">
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="text" placeholder="Nome da empresa">
                    </label>
                    
                    <label class="label-input" for="">
                        <i class="far fa-envelope icon-modify"></i>
                        <input type="text" placeholder="Endereco da empresa">
                    </label>
                   
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="text" placeholder="Modalidade de estagio">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="number" placeholder=" Carga horaria semanal">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="number" placeholder="Valor da bolsa">
                    </label>
                    
                    
                    
                    <button class="btn btn-second">Proximo</button>        
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
        <div class="content second-content">
            <div class="first-column">
                <h2 class="title title-primary">hello, friend!</h2>
                <p class="description description-primary">Enter your personal details</p>
                <p class="description description-primary">and start journey with us</p>
                <button id="signup" class="btn btn-primary">sign up</button>
        </div><!-- second-content -->
    </div>
    <script src="js/app.js"></script>
</body>
</html>