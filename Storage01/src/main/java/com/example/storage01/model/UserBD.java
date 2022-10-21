package com.example.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity // indica que esta classe será persistida no BD
@Table(name = "tb_user") // nome dado à tabela no BD (opcional)
public class UserBD {
    @Id // indica que o campo é PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera automaticamente os valores no BD
    private long cod;

    @Column(length = 150, nullable = false) // indica que o tamanho máximo é 150 e que não pode ser null
    private String name;

    @Column(name = "e_mail", length = 100, unique = true) // indica que o nome da tabela vai ser outro, o tamanho máximo será 100 e que deverá ser unico
    private String email;
}
