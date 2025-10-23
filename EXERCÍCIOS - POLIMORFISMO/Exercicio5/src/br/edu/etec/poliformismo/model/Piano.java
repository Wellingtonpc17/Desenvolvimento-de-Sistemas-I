package br.edu.etec.poliformismo.model;

public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("O piano esta tocando");
    }

}
