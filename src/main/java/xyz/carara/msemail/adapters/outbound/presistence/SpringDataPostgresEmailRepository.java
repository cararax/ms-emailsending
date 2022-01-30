package xyz.carara.msemail.adapters.outbound.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.carara.msemail.adapters.outbound.presistence.entities.EmailEntity;
import xyz.carara.msemail.application.domain.Email;


import java.util.UUID;

@Repository
public interface SpringDataPostgresEmailRepository extends JpaRepository<EmailEntity, UUID> {
}
