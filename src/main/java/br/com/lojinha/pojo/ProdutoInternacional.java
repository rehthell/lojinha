package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends ProdutoNacional implements Favorito {
    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }
    //POLIMORFISMO
    public void setValor(double novoValor) {
        //CONDICIONAIS
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100.");
        }

    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
