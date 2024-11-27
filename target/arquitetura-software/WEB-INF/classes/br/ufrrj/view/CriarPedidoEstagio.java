package org.example.view;

import org.example.data.EstagioDTO;
import org.example.data.ModalidadeEstagio;
import org.example.domain.CargaHorariaInsuficienteEX;
import org.example.domain.CriaPedEstagRT;
import org.example.domain.EnderecoInvalidoEX;
import org.example.domain.IRAInsuficienteEX;

import java.util.Scanner;

public class CriarPedidoEstagio {

    public static void main(String[] args){

             CriaPedEstagRT roteiro = new CriaPedEstagRT();
        try{
             String reviewDiscente;
             Scanner sc = new Scanner(System.in);

            System.out.print("Digite o seu IRA (valor float): ");
            float IRA = sc.nextFloat();


            System.out.print("Digite a carga horária (valor inteiro): ");
            int cargaHoraria = sc.nextInt();

            sc.nextLine();

            System.out.print("Digite o seu endereço: ");
            String endereco = sc.nextLine();

            reviewDiscente = roteiro.verificaDadosDiscente(IRA,cargaHoraria,endereco);

            sc.close();
        } catch (IRAInsuficienteEX e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (CargaHorariaInsuficienteEX e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EnderecoInvalidoEX e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try{
            Scanner sc = new Scanner(System.in);
            EstagioDTO dadosEstag = new EstagioDTO();
            String reviewEstag;

            System.out.print("Digite o nome do discente: ");
            dadosEstag.setNome(sc.nextLine());

            System.out.print("Digite a matrícula: ");
            dadosEstag.setMatricula(sc.nextLine());

            System.out.print("Digite o IRA (float): ");
            dadosEstag.setIRA(sc.nextFloat());

            System.out.print("Digite a carga horária (int): ");
            dadosEstag.setCargaHoraria(sc.nextInt());
            sc.nextLine(); // Limpar o buffer

            System.out.print("Digite o endereço do discente: ");
            dadosEstag.setEnderecoDiscente(sc.nextLine());

            System.out.print("É o primeiro estágio? (true/false): ");
            dadosEstag.setPrimeiroEstagio(sc.nextBoolean());
            sc.nextLine(); // Limpar o buffer

            System.out.print("Digite o nome da empresa: ");
            dadosEstag.setNomeEmpresa(sc.nextLine());

            System.out.print("Digite o endereço da empresa: ");
            dadosEstag.setEnderecoEmpresa(sc.nextLine());

            System.out.print("Digite a modalidade do estágio (PRESENCIAL, REMOTO, HÍBRIDO): ");
            dadosEstag.setModalidadeEstagio(ModalidadeEstagio.valueOf(sc.nextLine().toUpperCase()));

            System.out.print("Digite a carga horária semanal (int): ");
            dadosEstag.setCargaHorariaSemanal(sc.nextInt());
            sc.nextLine(); // Limpar o buffer

            System.out.print("Digite o valor da bolsa: ");
            dadosEstag.setValorBolsa(sc.nextLine());

            System.out.print("Digite o resumo das atividades: ");
            dadosEstag.setResumoAtividades(sc.nextLine());

            System.out.print("Digite a relação dos conteúdos com o curso: ");
            dadosEstag.setRelacaoDosConteudos(sc.nextLine());

            System.out.print("Digite o motivo da intenção: ");
            dadosEstag.setMotivoDaIntencao(sc.nextLine());

            // Exibir informações coletadas
            System.out.println("\nDados cadastrados:");
            System.out.println(dadosEstag);

            reviewEstag = roteiro.verificaDadosEstag(dadosEstag);
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
