/*
Comentamos la clase ya que nos mostraba error por el tipo de dato de la fecha sin embargo las otras clases compilan normal

package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Disponibilidades")
public class Disponibilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disponibilidad")
    private Long id_disponibilidad;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, unique = true, length = 100)
    private String correo;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private DateTime fecha;

    @NotNull
    @Column(name = "hora_inicial", nullable = false)
    private DateTime hora_inicial;
    
    @NotNull
    @Column(name = "hora_final", nullable = false)
    private DateTime hora_final;


    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = false, length = 20)
    private String lugar;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = false, length = 20)
    private String modalidad;
    

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = false, length = 20)
    private String materia;

    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, unique = false, length = 10)
    private String estado;


    public Disponibilidad() {
    }

    public Disponibilidad(String correo, DateTime fecha, DateTime hora_inicial, DateTime hora_final, String lugar, String modalidad, String materia, String estado) {
        this.correo = correo;
        this.fecha = fecha;
        this.hora_inicial= hora_inicial;
        this.hora_final= hora_final;
        this.lugar= lugar;
        this.modalidad= modalidad;
        this.materia = materia;
        this.estado= estado;
    }

    public Long getId_Disponibilidad() {
        return id_disponibilidad;
    }

    public void setId_Disponibilidad(Long id_disponibilidad) {
        this.id_disponibilidad = id_disponibilidad;
    }


    public String getcorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public DateTime getfecha() {
        return fecha;
    }
    
    public void setfecha(DateTime fecha){
        this.fecha= fecha;
    }
    

    public DateTime gethoraFinal() {
        return hora_final;
    }

    public void sethoraFinal(DateTime hora_final_) {
        this.hora_final = hora_final;
    }

    

    public String getLugar() {
        return lugar;
    }
    
    public void setLugar(String rol){
        this.lugar= lugar;
    }

    public String getModalidad() {
        return modalidad;
    }
    
    public void setModalidad(String modalidad){
        this.modalidad= modalidad;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }



}

**/