package cigaran.gustavo.exemploinjecaodpendencia.model;

import cigaran.gustavo.exemploinjecaodpendencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("au auuuu");
    }
}
