package br.ufrrj.data;

import java.util.ArrayList;
import java.util.List;
public class CamadaDados {
    // Atributo estático para armazenar a única instância da classe
    private static CamadaDados instanciaUnica;

    // Lista de estágios
    private List<PedidoEstagioDTO> listaDeEstagios;
    private UserDTO admin = new UserDTO("admin","admin");
    // Construtor privado para impedir instanciamento externo
    private CamadaDados() {
        listaDeEstagios = new ArrayList<>();
    }

    // Método público e estático para obter a instância única
    public static synchronized CamadaDados getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new CamadaDados();
        }
        return instanciaUnica;
    }

    // Getter para a lista de estágios
    public List<PedidoEstagioDTO> getListaDeEstagios() {
        return listaDeEstagios;
    }


    public UserDTO getAdmin() {
        return admin;
    }
}
