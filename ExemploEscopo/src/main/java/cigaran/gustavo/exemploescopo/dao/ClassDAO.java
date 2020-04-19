package cigaran.gustavo.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Opção 1
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Opção 2
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter @Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}
