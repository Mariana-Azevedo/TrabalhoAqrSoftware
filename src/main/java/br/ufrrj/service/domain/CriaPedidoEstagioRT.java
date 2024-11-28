package br.ufrrj.service.domain;

import br.ufrrj.data.PedidoEstagMapper;
import br.ufrrj.data.PedidoEstagioDTO;

public class CriaPedidoEstagioRT {

    public void criarPedidoEstagio(PedidoEstagioDTO dadosEstag){

        PedidoEstagMapper mapper = new PedidoEstagMapper();
        mapper.criaPedido(dadosEstag);
    }
}
