package br.ufrrj.service.domain;

import br.ufrrj.data.PedidoEstagioDTO;
import br.ufrrj.serviceless.domain.CargaHorariaExcedenteEX;
import br.ufrrj.serviceless.domain.CargaHorariaInsuficienteEX;
import br.ufrrj.service.domain.CriaPedidoEstagioRT;
import br.ufrrj.serviceless.domain.EnderecoInvalidoEX;
import br.ufrrj.serviceless.domain.IRAInsuficienteEX;

public class CamadaServico {

    CriaPedidoEstagioRT roteiro = new CriaPedidoEstagioRT();

    public void verificaDadosDiscente(float ira, int cargaHoraria, String endereco) {
        // Validação RN1: Carga Horária deve ser pelo menos 80 créditos
        if (cargaHoraria < 80) {
            throw new CargaHorariaInsuficienteEX("O discente não cumpriu a carga horária minima de 80 horas");
        }
        // Validação RN2: IRA deve ser >= 6.0 ou os dois últimos IRAs >= 7.0
        if (ira < 6.0) {
            throw new IRAInsuficienteEX("O discente não possui o IRA mínimo de 6.0");
        }
        // Validação do endereço
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new EnderecoInvalidoEX("Endereço envidado pelo discente é invalido ou nulo");
        }
        // Se todas as condições forem satisfeitas

    }

    public void verificaDadosEstag(PedidoEstagioDTO dadosEstag) {
        // Verificar se algum campo obrigatório está vazio ou nulo
        
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

        roteiro.criarPedidoEstagio(dadosEstag);
    }


}
