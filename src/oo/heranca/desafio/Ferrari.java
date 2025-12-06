package oo.heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
    }

    @Override
    public  void acelear() {
        super.acelear();
        super.acelear();
        super.acelear();
    }
}
