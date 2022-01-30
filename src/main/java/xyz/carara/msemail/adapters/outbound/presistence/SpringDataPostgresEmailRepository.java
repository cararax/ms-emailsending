package xyz.carara.msemail.adapters.outbound.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.carara.msemail.application.entities.EmailModel;


import java.util.UUID;

@Repository
public interface SpringDataPostgresEmailRepository extends JpaRepository<EmailModel, UUID> {
}
