package br.ufrrj.data;

public class UserMapper {

    public static boolean search(String email, String senha){

        CamadaDados camadaDados = CamadaDados.getInstance();

        UserDTO user = camadaDados.getAdmin();

        if(!(user.getEmail() == email)){
            return false;
        }

        if(!(user.getSenha() == senha)){
            return false;
        }


        return true;
    }
}
