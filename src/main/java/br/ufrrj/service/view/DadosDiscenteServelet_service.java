package br.ufrrj.service.view;

import java.io.IOException;

import br.ufrrj.service.domain.CamadaServico;
import br.ufrrj.serviceless.domain.CargaHorariaInsuficienteEX;
import br.ufrrj.serviceless.domain.CriaPedidoEstagioRT;
import br.ufrrj.serviceless.domain.EnderecoInvalidoEX;
import br.ufrrj.serviceless.domain.IRAInsuficienteEX;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/service/home")
public class DadosDiscenteServelet_service extends HttpServlet{
    
    private final CamadaServico service = new CamadaServico();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Exibe a tela de login
        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os dados enviados pelo formulário
        float ira = Float.parseFloat(request.getParameter("ira"));
        int cargaHoraria = Integer.parseInt(request.getParameter("cargaHoraria"));
        String endereco = request.getParameter("endereco");

        try{
            service.verificaDadosDiscente(ira, cargaHoraria, endereco);
            response.sendRedirect("/arquitetura-software/service/final");
        }catch(CargaHorariaInsuficienteEX e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
            dispatcher.forward(request, response);
        }catch(EnderecoInvalidoEX e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
            dispatcher.forward(request, response);
        }catch(IRAInsuficienteEX e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
            dispatcher.forward(request, response);
        }
    }
}
