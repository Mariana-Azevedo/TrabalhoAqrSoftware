<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="public/css/final.css">
    <link rel="stylesheet" href="public/js/script.js"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <div class="content first-content">
            <div class="first-column">
                <h2 class="title title-primary">welcome back!</h2>
                <p class="description description-primary">Termine de preencher seu form!</p>

            </div>
            <div class="second-column">
                <h2 class="title title-second">Etapa 3</h2>
                <p class="description description-second">Informe seus dados:</p>
                <form class="form">
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="text" placeholder="Seu nome">
                    </label>
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="text" placeholder="Matricula">
                    </label>
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="number" placeholder="IRA">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="number" placeholder=" Carga horaria semanal">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="texto" placeholder="Seu endereco">
                    </label>
                    <label class="label-input">E o primeiro estagio?
                        <div class="radio-group">
                            <label>
                                <input type="radio" name="primeiro_estagio" value="true" required> Sim
                            </label>
                            <label>
                                <input type="radio" name="primeiro_estagio" value="false" required> Nao
                            </label>
                        </div>
                    </label>

                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="text" placeholder="Nome da empresa">
                    </label>

                    <label class="label-input" for="">
                        <i class="far fa-envelope icon-modify"></i>
                        <input type="text" placeholder="Endereco da empresa">
                    </label>

                    <label class="label-input" for="modalidade">
                        <i class="fas fa-lock icon-modify"></i>
                        <select id="modalidade" name="modalidade">
                            <option value="" disabled selected>Selecione a modalidade</option>
                            <option value="hibrido">Hibrido</option>
                            <option value="presencial">Presencial</option>
                            <option value="remoto">Remoto</option>
                        </select>
                    </label>


                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="number" placeholder="Valor da bolsa">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="text" placeholder="Resumo das atividades">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="text" placeholder="Relacao dos conteudos">
                    </label>
                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="text" placeholder="Motivo do estagio">
                    </label>

                    <div class="botoes">
                        <button href="home.jsp" class="btn btn-second">Voltar</button>
                        <button class="btn btn-second">Proximo</button>
                    </div>
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
    </div>
    <script src="js/app.js"></script>
</body>

</html>