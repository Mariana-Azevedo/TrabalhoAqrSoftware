package br.ufrrj.data;


import java.util.List;

public class PedidoEstagMapper {

    public void criaPedido(PedidoEstagioDTO dadosEstag) {
        // Obtém a instância única da CamadaDados
        CamadaDados camadaDados = CamadaDados.getInstance();

        // Adiciona o dado à lista de estágios
        List<PedidoEstagioDTO> listaDeEstagios = camadaDados.getListaDeEstagios();
        listaDeEstagios.add(dadosEstag);

        System.out.println("Carga Horária Semanal: " + dadosEstag.getCargaHorariaSemanal());
        System.out.println("Endereço da Empresa: " + dadosEstag.getEnderecoEmpresa());
        System.out.println("Valor da Bolsa: " + dadosEstag.getValorBolsa());
        System.out.println("Resumo das Atividades: " + dadosEstag.getResumoAtividades());
        System.out.println("Modalidade de Estágio: " + dadosEstag.getModalidadeEstagio());
        System.out.println("Motivo da Intenção: " + dadosEstag.getMotivoDaIntencao());
    }

}

