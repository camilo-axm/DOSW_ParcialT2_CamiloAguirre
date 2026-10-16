package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tutor")
    private Long id_tutor;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = false, length = 20)
    private String materia;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = true, length = 20)
    private String correo;

    public Tutor() {
    }

    public Tutor(String materia, String correo) {
        this.materia = materia;
        this.correo = correo;
    }

    public Long getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(Long id_tutor) {
        this.id_tutor= id_tutor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}