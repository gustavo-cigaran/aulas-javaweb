package cigaran.gustavo.exemploinjecaodpendencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExInjecaoDependenciaApplication {

	public static void main(String[] args) {
//		Numero 3 - Criamos uma variável ApplicationContext para ter o contexto da aplicação.
		ApplicationContext applicationContext = SpringApplication.run(ExInjecaoDependenciaApplication.class, args);
//		SpringApplication.run(ExInjecaoDependenciaApplication.class, args);

//		Primeira maneira. muda o objeto dentro do método execute diretamente na classe. Muito acoplado!
//		Pet pet = new Pet();
//		pet.execute();

//		Segunda maneira, reduzimos o acoplamento. Desta forma enviamos qual objeto gostariamos de trabalhar.
//		pet pet1 = new Pet(new Cat());
//		pet1.execute();

//		pet pet2 = new Pet(new Dog());
//		pet2.execute();
	}
}
