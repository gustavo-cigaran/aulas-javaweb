package cigaran.gustavo.exemploinjecaodpendencia;

import cigaran.gustavo.exemploinjecaodpendencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {
//  Numero 3 - A Annotation @Autowired faz a injeção de dependencia automaticamente, sem precisarmos declarar construtor.
    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

//  Numero 2 - baixo acoplamento. A aplicacao envia a classe que deve ser instanciada por construtor
//    public Bicho(IAnimal iAnimal) {
//        this.iAnimal = iAnimal;
//    }

    public void execute() {
        iAnimal.comunicar();
    }

//  Numero 1 - Classe Bicho fortemente acoplada com a classe Gato e Cachorro. Precisamos entrar no
//  código e modificar a instanciação informando qual classe queremos.
//    public void execute() {
//        iAnimal = new Gato();
//        iAnimal.comunicar();
//    }
}
