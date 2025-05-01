package ru.ilyasov.springBOOT.projectPP_311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyasov.springBOOT.projectPP_311.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
