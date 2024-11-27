package br.ufrrj.data;

public class UserDTO {
    private String email;
    private String senha;

    public UserDTO(String email, String admin1) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
