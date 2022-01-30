package xyz.carara.msemail.adapters.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xyz.carara.msemail.MsEmailApplication;
import xyz.carara.msemail.application.ports.EmailRepositoryPort;
import xyz.carara.msemail.application.ports.SendEmailServicePort;
import xyz.carara.msemail.application.services.EmailServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = MsEmailApplication.class)
public class BeanConfiguration {

    @Bean
    EmailServiceImpl emailServiceImpl(EmailRepositoryPort repository, SendEmailServicePort sendEmailServicePort) {
        return new EmailServiceImpl(repository, sendEmailServicePort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
