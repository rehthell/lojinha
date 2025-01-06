package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.GRANDE);//quem chamar o new Produto é obrigado a passar a marcaInicial

        meuProduto.setNome("PS4");
        meuProduto.setValor(10);
        meuProduto.setMarca("Mas é possível alterar o valor default chamando o setMarca()"); //o construtor vai dar um valor default pra marca e não é necessário declarar aqui

        //ENUM
        //meuProduto.setTamanho(Tamanho.PEQUENO);
        //LISTA
        //LISTA
        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 1);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        //System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        //System.out.println(meuProduto.getItensInclusos().get(0).getQtd());
        /*
        //LOOP
        System.out.println("Itens na lista");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQtd());
        }

        System.out.println("Sem itens na lista");
         /*itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        meuProduto.setItensInclusos(itensInclusos);
        */

        //System.out.println(meuProduto.getItensInclusos());
        //System.out.println(meuProduto.getTamanho());
        //System.out.println(meuProduto.getNome() + " " + meuProduto.getValor() + " " + meuProduto.getMarca() + " " + meuProduto.getItensInclusos().get(1));


        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.2);
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        meuProdutoNacional.setValor(30);

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-100);
        System.out.println(meuProdutoInternacional.getTaxaDeImportacao());







    }
}
