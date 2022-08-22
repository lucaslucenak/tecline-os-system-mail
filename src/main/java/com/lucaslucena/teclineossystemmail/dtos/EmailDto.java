package com.lucaslucena.teclineossystemmail.dtos;

import com.lucaslucena.teclineossystemmail.enums.EmailType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @Column
    private Long os_id;

    @Column
    @Enumerated(value = EnumType.STRING)
    private EmailType email_type;

    @Column
    @NotBlank
    private String owner_reference;

    @Email
    @Column
    @NotBlank
    private String email_from;

    @Email
    @Column
    @NotBlank
    private String email_to;

    @Column
    @NotBlank
    private String subject;

    @Column
    @NotBlank
    private String text;
}
