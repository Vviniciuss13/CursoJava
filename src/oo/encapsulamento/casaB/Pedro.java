package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos(){
        // Ana amiga = new Ana(); // assim não funciona, pois para acessar protected é por herança e não instancia

        //System.out.println(amiga.segredo); private
        //System.out.println(amiga.facoDentroDeCasa); pacote
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }

}
