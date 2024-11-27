package org.example.domain;

import org.example.data.EstagioDTO;
import org.example.data.PedidoEstagMapper;

public class CriaPedEstagRT {

    public String verificaDadosDiscente(float ira, int cargaHoraria, String endereco) {
        // Validação RN1: Carga Horária deve ser pelo menos 80 créditos
        if (cargaHoraria < 80) {
            throw new CargaHorariaInsuficienteEX();
        }

        // Validação RN2: IRA deve ser >= 6.0 ou os dois últimos IRAs >= 7.0
        if (ira < 6.0) {
            throw new IRAInsuficienteEX();
        }

        // Validação do endereço
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new EnderecoInvalidoEX();
        }

        // Se todas as condições forem satisfeitas
        return "Dados validados com sucesso. O discente está apto.";
    }

    public String verificaDadosEstag(EstagioDTO dadosEstag) {
        // Verificar se algum campo obrigatório está vazio ou nulo
        if (dadosEstag.getNome() == null || dadosEstag.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do discente não foi preenchido.");
        }
        if (dadosEstag.getMatricula() == null || dadosEstag.getMatricula().isEmpty()) {
            throw new IllegalArgumentException("A matrícula do discente não foi preenchida.");
        }
        if (dadosEstag.getEnderecoDiscente() == null || dadosEstag.getEnderecoDiscente().isEmpty()) {
            throw new IllegalArgumentException("O endereço do discente não foi preenchido.");
        }
        if (dadosEstag.getNomeEmpresa() == null || dadosEstag.getNomeEmpresa().isEmpty()) {
            throw new IllegalArgumentException("O nome da empresa não foi preenchido.");
        }
        if (dadosEstag.getEnderecoEmpresa() == null || dadosEstag.getEnderecoEmpresa().isEmpty()) {
            throw new IllegalArgumentException("O endereço da empresa não foi preenchido.");
        }
        if (dadosEstag.getResumoAtividades() == null || dadosEstag.getResumoAtividades().isEmpty()) {
            throw new IllegalArgumentException("O resumo das atividades não foi preenchido.");
        }
        if (dadosEstag.getRelacaoDosConteudos() == null || dadosEstag.getRelacaoDosConteudos().isEmpty()) {
            throw new IllegalArgumentException("A relação dos conteúdos com o curso não foi preenchida.");
        }
        if (dadosEstag.getMotivoDaIntencao() == null || dadosEstag.getMotivoDaIntencao().isEmpty()) {
            throw new IllegalArgumentException("O motivo da intenção não foi preenchido.");
        }
        if (dadosEstag.getModalidadeEstagio() == null) {
            throw new IllegalArgumentException("A modalidade do estágio não foi selecionada.");
        }

        // Verificar a regra de negócio da carga horária semanal
        if (dadosEstag.getCargaHorariaSemanal() > 30) {
            throw new CargaHorariaExcedenteEX("A carga horária semanal excede o limite máximo de 30 horas.");
        }

        PedidoEstagMapper mapper = new PedidoEstagMapper();
        mapper.create(dadosEstag);
        return "Todos os dados foram preenchidos corretamente e a regra de negócio foi atendida.";

    }
}
