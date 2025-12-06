package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {

    public static void main(String[] args) {

        Carro ferrari = new Ferrari(140);
        ferrari.acelear();
        ferrari.acelear();
        ferrari.frear();

        Carro fusca = new Fusca();
        fusca.acelear();
        fusca.acelear();

        System.out.println(ferrari.velocidade_atual);
        System.out.println(fusca.velocidade_atual);

    }
}
