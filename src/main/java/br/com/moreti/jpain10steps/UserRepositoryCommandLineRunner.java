package br.com.moreti.jpain10steps;

import br.com.moreti.jpain10steps.entity.User;
import br.com.moreti.jpain10steps.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(JpaIn10StepsApplication.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill","Admin");
        userRepository.save(user);
        logger.info("New user is created. id: {}, user: {}",user.getId(),user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        logger.info("User is retrieved: {}", userWithIdOne.get());

        List<User> users = userRepository.findAll();

        logger.info("All users: {}", users);
    }

}
