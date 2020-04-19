package cigaran.gustavo.exemplopostconstructpredestroy;

import cigaran.gustavo.exemplopostconstructpredestroy.dao.ClientDAO;
import cigaran.gustavo.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExPostConstructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExPostConstructPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Gustavo Cigaran"));

		System.out.println("objeto ClienteDAO: " + clientDAO);
		System.out.println("objeto Cliente: " + clientDAO.getClient());

	}
}
