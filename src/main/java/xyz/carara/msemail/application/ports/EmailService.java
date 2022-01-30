package xyz.carara.msemail.application.ports;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xyz.carara.msemail.application.entities.EmailModel;

import java.util.Optional;
import java.util.UUID;

public interface EmailService {

    EmailModel sendEmail(EmailModel emailModel);
    Page<EmailModel> findAll(Pageable pageable);
    Optional<EmailModel> findById(UUID emailId);
}
