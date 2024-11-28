package br.ufrrj.serviceless.view;


import java.io.IOException;

import br.ufrrj.serviceless.domain.CriaPedidoEstagioRT;
import br.ufrrj.serviceless.domain.IndentificarUserRT;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/serviceless/pedido-estagio")
public class UserLoginServelet extends HttpServlet {

    private final CriaPedidoEstagioRT roteiroPed = new CriaPedidoEstagioRT();
    private final IndentificarUserRT roteiroUser = new IndentificarUserRT();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Exibe a tela de login
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os dados do formulário
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try{

            roteiroUser.verificarUsuario(email, password);

            response.sendRedirect("/arquitetura-software/serviceless/home");

        }catch(Exception e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }
        
    }
}
