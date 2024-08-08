package userdeptapi.userdeptapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import userdeptapi.userdeptapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
