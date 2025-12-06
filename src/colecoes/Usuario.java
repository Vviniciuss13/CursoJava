package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Meu nome é " + nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
}
