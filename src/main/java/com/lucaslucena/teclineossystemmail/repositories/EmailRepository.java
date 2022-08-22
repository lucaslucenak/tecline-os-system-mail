package com.lucaslucena.teclineossystemmail.repositories;

import com.lucaslucena.teclineossystemmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
