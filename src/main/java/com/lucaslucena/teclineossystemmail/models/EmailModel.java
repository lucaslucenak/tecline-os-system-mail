package com.lucaslucena.teclineossystemmail.models;

import com.lucaslucena.teclineossystemmail.enums.EmailStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Getter
@Setter
@Table(name = "tb_email")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String owner_reference;

    @Column
    private String email_from;

    @Column
    private String email_to;

    @Column
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column
    private LocalDateTime local_date_time = LocalDateTime.now();

    @Column
    private LocalDate local_date = LocalDate.now();

    @Column
    private LocalTime local_time = LocalTime.now();

    @Column
    @Enumerated(value = EnumType.STRING)
    private EmailStatus emailStatus;
}
