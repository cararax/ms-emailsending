package xyz.carara.msemail.application.ports;

import xyz.carara.msemail.application.domain.Email;
import xyz.carara.msemail.application.domain.PageInfo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface EmailRepositoryPort {

    Email save(Email email);
    List<Email> findAll(PageInfo pageInfo);
    Optional<Email> findById(UUID emailId);
}
