package xyz.carara.msemail.adapters.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import xyz.carara.msemail.MsEmailApplication;
import xyz.carara.msemail.application.ports.EmailRepository;
import xyz.carara.msemail.application.services.EmailServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = MsEmailApplication.class)
public class BeanConfiguration {

    @Bean
    EmailServiceImpl emailServiceImpl(EmailRepository repository, JavaMailSender emailSender) {
        return new EmailServiceImpl(repository, emailSender);
    }
}
