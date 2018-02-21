package br.com.moreti.jpain10steps;

import br.com.moreti.jpain10steps.entity.User;
import br.com.moreti.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserDAOService userDAOService;

    Logger logger = LoggerFactory.getLogger(JpaIn10StepsApplication.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack","Admin");
        long id = userDAOService.insert(user);
        logger.info("New user is created. id: {}, user: {}",id,user);
    }
}
