package xyz.carara.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.msemail.models.EmailModel;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
