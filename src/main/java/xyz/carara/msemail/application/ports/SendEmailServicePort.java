package xyz.carara.msemail.application.ports;


import xyz.carara.msemail.application.domain.Email;

public interface SendEmailServicePort {

    void sendEmailSmtp(Email email);
}
