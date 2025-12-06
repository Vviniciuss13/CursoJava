package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public double velocidade_atual;
    private final int delta = 10;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelear(){
        if(velocidade_atual + delta <= VELOCIDADE_MAXIMA){
            velocidade_atual += delta;
        }else{
            velocidade_atual = VELOCIDADE_MAXIMA;
        }
    }

    public void frear(){
        if(velocidade_atual >= delta){
            velocidade_atual -= delta;
        }else{
            velocidade_atual = 0;
        }
    }
}
