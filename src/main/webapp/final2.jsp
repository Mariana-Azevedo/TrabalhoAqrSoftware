<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro de Est&aacute;gio</title>
    <link rel="stylesheet" href="/arquitetura-software/public/css/style.css">
    <script src="/arquitetura-software/public/js/script.js" defer></script>
    <style>
        /* Esconde todas as etapas inicialmente */
        .step {
            display: none;
        }

        /* Exibe apenas a etapa ativa */
        .step.active {
            display: block;
        }
    </style>
</head>
<body>
    <!-- Etapa 1 -->
    <div id="step1" class="step active">
        <div class="container">
            <div class="content first-content">
                <div class="first-column">
                    <h2 class="title title-primary">Dados do Estagio</h2>
                    <p class="description description-primary">Preencha o fomulario com os dados do seu estagio</p>
                    <p class="description description-primary">Seu pedido de estagio estara pronto em breve!</p>
                </div>
                <div class="second-column">
                    <h2 class="title title-second">Etapa 1</h2>
                    <p class="description description-second">Informe seus dados:</p>
                    <form id="form1" class="form">
                        <!-- Primeiro Estágio -->
                        <p> Primeiro Estagio?</p>
                        <label class="label-input" for="primeiroEstagio">
                            <i class="fas fa-question icon-modify"></i>
                            <select id="primeiroEstagio" name="primeiroEstagio" required>
                                <option value="true">Sim</option>
                                <option value="false">N&atilde;o</option>
                            </select>
                        </label>

                        <!-- Nome da Empresa -->
                        <label class="label-input" for="nomeEmpresa">
                            <i class="fas fa-building icon-modify"></i>
                            <input type="text" id="nomeEmpresa" name="nomeEmpresa" placeholder="Nome da Empresa" required>
                        </label>

                        <!-- Endereço da Empresa -->
                        <label class="label-input" for="enderecoEmpresa">
                            <i class="fas fa-map-marker-alt icon-modify"></i>
                            <input type="text" id="enderecoEmpresa" name="enderecoEmpresa" placeholder="Endere&ccedil;o da Empresa" required>
                        </label>

                        <button type="button" class="btn btn-second" onclick="goToStep2()">Pr&oacute;ximo</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Etapa 2 -->
    <div id="step2" class="step">
        <div class="container">
            <div class="content first-content">
                <div class="first-column">
                    <h2 class="title title-primary">Bem-vindo de volta!</h2>
                    <p class="description description-primary">Para continuar conectado conosco,</p>
                    <p class="description description-primary">fa&ccedil;a login com suas informa&ccedil;&otilde;es pessoais</p>
                    <button id="signin" class="btn btn-primary">Entrar</button>
                </div>
                <div class="second-column">
                    <h2 class="title title-second">Etapa 2</h2>
                    <p class="description description-second">Informe seus dados:</p>
                    <form id="form2" action="final" method="post" class="form">
                        <!-- Dados da Etapa 1 como campos ocultos -->
                        <input type="hidden" id="hiddenPrimeiroEstagio" name="primeiroEstagio">
                        <input type="hidden" id="hiddenNomeEmpresa" name="nomeEmpresa">
                        <input type="hidden" id="hiddenEnderecoEmpresa" name="enderecoEmpresa">

                        <!-- Modalidade de Estágio -->
                        <label class="label-input" for="modalidadeEstagio">
                            <i class="fas fa-briefcase icon-modify"></i>
                            <input type="text" id="modalidadeEstagio" name="modalidadeEstagio" placeholder="Modalidade de Est&aacute;gio" required>
                        </label>

                        <!-- Carga Horária Semanal -->
                        <label class="label-input" for="cargaHorariaSemanal">
                            <i class="fas fa-calendar-alt icon-modify"></i>
                            <input type="number" id="cargaHorariaSemanal" name="cargaHorariaSemanal" placeholder="Carga Hor&aacute;ria Semanal" required>
                        </label>

                        <!-- Valor da Bolsa -->
                        <label class="label-input" for="valorBolsa">
                            <i class="fas fa-dollar-sign icon-modify"></i>
                            <input type="number" id="valorBolsa" name="valorBolsa" placeholder="Valor da Bolsa" required>
                        </label>

                        <!-- Resumo das Atividades -->
                        <label class="label-input" for="resumoAtividades">
                            <i class="fas fa-tasks icon-modify"></i>
                            <textarea id="resumoAtividades" name="resumoAtividades" placeholder="Resumo das Atividades" required></textarea>
                        </label>

                        <!-- Relação dos Conteúdos -->
                        <label class="label-input" for="relacaoDosConteudos">
                            <i class="fas fa-book-open icon-modify"></i>
                            <textarea id="relacaoDosConteudos" name="relacaoDosConteudos" placeholder="Rela&ccedil;&atilde;o dos Conte&uacute;dos" required></textarea>
                        </label>

                        <!-- Motivo da Intenção -->
                        <label class="label-input" for="motivoDaIntencao">
                            <i class="fas fa-lightbulb icon-modify"></i>
                            <textarea id="motivoDaIntencao" name="motivoDaIntencao" placeholder="Motivo da Inten&ccedil;&atilde;o" required></textarea>
                        </label>

                        <button type="submit" class="btn btn-second">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
        function goToStep2() {
            // Obtenha os valores preenchidos na Etapa 1
            const primeiroEstagio = document.getElementById('primeiroEstagio').value;
            const nomeEmpresa = document.getElementById('nomeEmpresa').value;
            const enderecoEmpresa = document.getElementById('enderecoEmpresa').value;

            // Preencha os campos ocultos na Etapa 2
            document.getElementById('hiddenPrimeiroEstagio').value = primeiroEstagio;
            document.getElementById('hiddenNomeEmpresa').value = nomeEmpresa;
            document.getElementById('hiddenEnderecoEmpresa').value = enderecoEmpresa;

            // Alterne para a Etapa 2
            document.getElementById('step1').classList.remove('active');
            document.getElementById('step2').classList.add('active');
        }
    </script>
</body>
</html>
