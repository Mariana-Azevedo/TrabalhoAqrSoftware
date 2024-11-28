package br.ufrrj.serviceless.view;

import java.io.IOException;

import br.ufrrj.data.ModalidadeEstagio;
import br.ufrrj.data.PedidoEstagioDTO;
import br.ufrrj.serviceless.domain.CargaHorariaExcedenteEX;
import br.ufrrj.serviceless.domain.CriaPedidoEstagioRT;
import br.ufrrj.serviceless.domain.EnderecoInvalidoEX;
import br.ufrrj.serviceless.domain.IRAInsuficienteEX;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/serviceless/final")
public class DadosEstagServelet extends HttpServlet{
    
    private final CriaPedidoEstagioRT roteiroPed = new CriaPedidoEstagioRT();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Exibe a tela de login
        RequestDispatcher dispatcher = request.getRequestDispatcher("/final.jsp");
        dispatcher.forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os dados enviados pelo formulário

        boolean primeiroEstagio = Boolean.parseBoolean(request.getParameter("primeiroEstagio"));
        String nomeEmpresa = request.getParameter("nomeEmpresa");
        String enderecoEmpresa = request.getParameter("enderecoEmpresa");
        ModalidadeEstagio modalidadeEstagio = ModalidadeEstagio.valueOf(request.getParameter("modalidadeEstagio"));
        int cargaHorariaSemanal = Integer.parseInt(request.getParameter("cargaHorariaSemanal"));
        float valorBolsa = Float.parseFloat(request.getParameter("valorBolsa"));
        String resumoAtividades = request.getParameter("resumoAtividades");
        String relacaoDosConteudos = request.getParameter("relacaoDosConteudos");
        String motivoDaIntencao = request.getParameter("motivoDaIntencao");
    
        PedidoEstagioDTO dadosEstag = new PedidoEstagioDTO(primeiroEstagio, nomeEmpresa,  enderecoEmpresa,
     modalidadeEstagio,  cargaHorariaSemanal,  valorBolsa,
         resumoAtividades,  relacaoDosConteudos,  motivoDaIntencao);

        try{
            roteiroPed.verificaDadosEstag(dadosEstag);
            response.sendRedirect("/arquitetura-software/serviceless/pedido-estagio");
        }catch(CargaHorariaExcedenteEX e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/final.jsp");
            dispatcher.forward(request, response);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/final.jsp");
            dispatcher.forward(request, response);
        }
    }
}
