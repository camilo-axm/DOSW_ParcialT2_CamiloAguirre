package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Solicitantes")
public class Solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitante")
    private Long id_solicitante;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = true, length = 20)
    private String correo;

    public Solicitante() {
    }

    public Solicitante(String correo) {
        this.correo = correo;
    }

    public Long getId_Solicitante() {
        return id_solicitante;
    }

    public void setId_solicitante(Long id_solicitante) {
        this.id_solicitante= id_solicitante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}