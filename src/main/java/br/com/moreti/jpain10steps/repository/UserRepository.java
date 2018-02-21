package br.com.moreti.jpain10steps.repository;

import br.com.moreti.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
