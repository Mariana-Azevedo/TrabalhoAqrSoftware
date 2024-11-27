package br.ufrrj.serviceless.domain;

import br.ufrrj.data.CamadaDados;
import br.ufrrj.data.UserMapper;

public class IndentificarUserRT {
    public void verificarUsuario(String email, String senha, boolean supervisorJaAssociado) throws Exception {
        // Fluxo Alternativo 2: Informações incompletas
        if (email == null || email.isEmpty()) {
            throw new Exception("O sistema informa que o email não foi informado.");
        }
        if (senha == null || senha.isEmpty()) {
            throw new Exception("O sistema informa que a senha não foi informada.");
        }

        // Fluxo Alternativo 1: Usuário inválido
        if (!UserMapper.search(email,senha)) {
            throw new Exception("O sistema informa que o email ou senha é inválido.");
        }

    }

}
