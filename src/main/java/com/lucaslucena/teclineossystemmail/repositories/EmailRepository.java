package com.lucaslucena.teclineossystemmail.repositories;

import com.lucaslucena.teclineossystemmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
