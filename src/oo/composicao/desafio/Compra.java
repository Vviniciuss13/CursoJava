package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    int id;
    Cliente cliente;
    List<Item> itens = new ArrayList<>();

    Compra(int id){
        this.id = id;
    }

    double obterTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
