package com.lucaslucena.teclineossystemmail.services;

import com.lucaslucena.teclineossystemmail.enums.EmailStatus;
import com.lucaslucena.teclineossystemmail.models.EmailModel;
import com.lucaslucena.teclineossystemmail.repositories.EmailRepository;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    final EmailRepository emailRepository;
    final JavaMailSender javaMailSender;

    public EmailService(EmailRepository emailRepository, JavaMailSender javaMailSender) {
        this.emailRepository = emailRepository;
        this.javaMailSender = javaMailSender;
    }

    public EmailModel sendEmail(EmailModel emailModel) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmail_from());
            message.setTo(emailModel.getEmail_to());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            javaMailSender.send(message);

            emailModel.setEmailStatus(EmailStatus.SENT);
        } catch (MailException e) {
            System.out.println(e);
            emailModel.setEmailStatus(EmailStatus.ERROR);
        } finally {
            return emailRepository.save(emailModel);
        }
    }
}
