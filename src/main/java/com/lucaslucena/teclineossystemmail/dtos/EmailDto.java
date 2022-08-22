package com.lucaslucena.teclineossystemmail.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @Column
    @NotBlank
    private String ownerReference;

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