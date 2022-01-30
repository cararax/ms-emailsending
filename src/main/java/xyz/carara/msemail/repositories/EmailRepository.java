package xyz.carara.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
