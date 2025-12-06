package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos");

        Compra compra1 = new Compra(1);
        Compra compra2 = new Compra(2);

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        Produto produto1 = new Produto("Chá", 10);
        Produto produto2 = new Produto("Café", 30);
        Produto produto3 = new Produto("Suco", 15);
        Produto produto4 = new Produto("Coca", 12);

        item1.produto = produto1;
        item1.quantidade = 1;
        item2.produto = produto2;
        item2.quantidade = 2;

        item3.produto = produto3;
        item3.quantidade = 3;
        item4.produto = produto4;
        item4.quantidade = 4;

        compra1.itens.add(item1);
        compra1.itens.add(item2);

        compra2.itens.add(item3);
        compra2.itens.add(item4);

        cliente1.compras.add(compra1);
        cliente1.compras.add(compra2);

        System.out.println("O Cliente " + cliente1.nome + " gastou: R$" + cliente1.obterValorTotal());

    }
}
