package xyz.carara.msemail.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import xyz.carara.msemail.dtos.EmailDTO;
import xyz.carara.msemail.models.EmailModel;
import xyz.carara.msemail.services.EmailService;

@Component
public class EmailConstumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDTO emailDTO) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDTO, emailModel);
        emailService.sendEmail(emailModel);
        System.out.println("Email status: "+emailModel.getStatusEmail().toString());
    }
}
