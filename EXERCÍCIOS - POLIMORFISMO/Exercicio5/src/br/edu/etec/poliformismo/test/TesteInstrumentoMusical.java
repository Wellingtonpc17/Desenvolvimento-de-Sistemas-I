package br.edu.etec.poliformismo.test;

import br.edu.etec.poliformismo.model.*;

public class TesteInstrumentoMusical {

    public static void main(String[] args) {

        Guitarra guitarra = new Guitarra();
        guitarra.tocar();

        Piano piano = new Piano();
        piano.tocar();
    }

}
