package com.lucaslucena.teclineossystemmail.services;

import com.lucaslucena.teclineossystemmail.models.EmailModel;
import com.lucaslucena.teclineossystemmail.repositories.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public void sendEmail(EmailModel emailModel) {

    }
}
