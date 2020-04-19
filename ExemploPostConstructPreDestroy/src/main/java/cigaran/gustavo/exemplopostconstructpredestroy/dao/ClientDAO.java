package cigaran.gustavo.exemplopostconstructpredestroy.dao;

import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import cigaran.gustavo.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado");
    }
}
