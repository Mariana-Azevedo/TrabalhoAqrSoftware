package br.ufrrj.data;


public class PedidoEstagioDTO {


    private boolean primeiroEstagio;
    private String nomeEmpresa;
    private String enderecoEmpresa;
    private ModalidadeEstagio modalidadeEstagio;
    private int cargaHorariaSemanal;
    private float valorBolsa;
    private String resumoAtividades;
    private String relacaoDosConteudos;
    private String motivoDaIntencao;

    public PedidoEstagioDTO( boolean primeiroEstagio, String nomeEmpresa, String enderecoEmpresa,
                   ModalidadeEstagio modalidadeEstagio, int cargaHorariaSemanal, float valorBolsa,
                   String resumoAtividades, String relacaoDosConteudos, String motivoDaIntencao) {

        this.primeiroEstagio = primeiroEstagio;
        this.nomeEmpresa = nomeEmpresa;
        this.enderecoEmpresa = enderecoEmpresa;
        this.modalidadeEstagio = modalidadeEstagio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.valorBolsa = valorBolsa;
        this.resumoAtividades = resumoAtividades;
        this.relacaoDosConteudos = relacaoDosConteudos;
        this.motivoDaIntencao = motivoDaIntencao;
    }

    public boolean isPrimeiroEstagio() {
        return primeiroEstagio;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public ModalidadeEstagio getModalidadeEstagio() {
        return modalidadeEstagio;
    }


    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public float getValorBolsa() {
        return valorBolsa;
    }

    public String getResumoAtividades() {
        return resumoAtividades;
    }

    public String getRelacaoDosConteudos() {
        return relacaoDosConteudos;
    }

    public String getMotivoDaIntencao() {
        return motivoDaIntencao;
    }

}

