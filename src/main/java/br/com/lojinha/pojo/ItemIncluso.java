package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int qtd;

    public ItemIncluso(String nomeInicial, int qtdInicial) {
        this.nome = nomeInicial;
        this.qtd = qtdInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
