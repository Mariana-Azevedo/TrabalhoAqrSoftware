package br.ufrrj.serviceless.view;


import br.ufrrj.data.ModalidadeEstagio;
import br.ufrrj.data.PedidoEstagioDTO;
import br.ufrrj.serviceless.domain.CriaPedidoEstagioRT;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/serviceless/pedido-estagio")
public class CamadaApresentacao extends HttpServlet {

    private final CriaPedidoEstagioRT roteiro = new CriaPedidoEstagioRT();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String etapa = request.getParameter("etapa");

        if (etapa == null || etapa.isEmpty() || etapa.equals("discente")) {
            // Tela para preencher os dados do discente
            request.getRequestDispatcher("/formDiscente.jsp").forward(request, response);
        } else if (etapa.equals("estagio")) {
            // Tela para preencher os dados do estágio
            request.getRequestDispatcher("/formEstagio.jsp").forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Etapa inválida.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String etapa = request.getParameter("etapa");

        try {
            if (etapa.equals("discente")) {
                // Coletar e validar dados do discente
                float ira = Float.parseFloat(request.getParameter("ira"));
                int cargaHoraria = Integer.parseInt(request.getParameter("cargaHoraria"));
                String endereco = request.getParameter("endereco");

                roteiro.verificaDadosDiscente(ira, cargaHoraria, endereco);

                // Redirecionar para a próxima etapa
                response.sendRedirect("verificaDados?etapa=estagio");
            } else if (etapa.equals("estagio")) {
                // Coletar e validar dados do estágio
                PedidoEstagioDTO dadosEstagio = new PedidoEstagioDTO();
                dadosEstagio.setNome(request.getParameter("nome"));
                dadosEstagio.setMatricula(request.getParameter("matricula"));
                dadosEstagio.setEnderecoDiscente(request.getParameter("enderecoDiscente"));
                dadosEstagio.setNomeEmpresa(request.getParameter("nomeEmpresa"));
                dadosEstagio.setEnderecoEmpresa(request.getParameter("enderecoEmpresa"));
                dadosEstagio.setResumoAtividades(request.getParameter("resumoAtividades"));
                dadosEstagio.setRelacaoDosConteudos(request.getParameter("relacaoDosConteudos"));
                dadosEstagio.setMotivoDaIntencao(request.getParameter("motivoDaIntencao"));
                dadosEstagio.setCargaHorariaSemanal(Integer.parseInt(request.getParameter("cargaHorariaSemanal")));
                dadosEstagio.setModalidadeEstagio(ModalidadeEstagio.valueOf(request.getParameter("modalidadeEstagio").toUpperCase()));

                roteiro.verificaDadosEstag(dadosEstagio);

                // Sucesso - Redirecionar ou mostrar mensagem
                response.sendRedirect("sucesso.jsp");
            } else {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Etapa inválida.");
            }
        } catch (Exception e) {
            // Redirecionar para a mesma etapa com mensagem de erro
            request.setAttribute("erro", e.getMessage());
            if (etapa.equals("discente")) {
                request.getRequestDispatcher("/formDiscente.jsp").forward(request, response);
            } else if (etapa.equals("estagio")) {
                request.getRequestDispatcher("/formEstagio.jsp").forward(request, response);
            }
        }
    }
}
