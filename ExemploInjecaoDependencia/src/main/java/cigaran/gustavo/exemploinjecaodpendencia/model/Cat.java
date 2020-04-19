package cigaran.gustavo.exemploinjecaodpendencia.model;

import cigaran.gustavo.exemploinjecaodpendencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("miauuuu");
    }
}
