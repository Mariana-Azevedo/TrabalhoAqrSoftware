package br.ufrrj.data;


import java.util.List;

public class PedidoEstagMapper {

    public void create(PedidoEstagioDTO dadosEstag) {
        // Obtém a instância única da CamadaDados
        CamadaDados camadaDados = CamadaDados.getInstance();

        // Adiciona o dado à lista de estágios
        List<PedidoEstagioDTO> listaDeEstagios = camadaDados.getListaDeEstagios();
        listaDeEstagios.add(dadosEstag);
    }

}

