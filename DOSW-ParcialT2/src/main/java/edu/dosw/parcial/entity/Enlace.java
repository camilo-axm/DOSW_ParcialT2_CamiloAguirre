package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Enlaces")
public class Enlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enlace")
    private Long id_enlace;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, unique = false, length = 100)
    private String nombre;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, unique = false, length = 20)
    private String programa;


    @NotNull
    @Column(nullable = false)
    private Boolean estado = true;

    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, unique = false, length = 10)
    private String rol;

    
    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, unique = false, length = 10)
    private String nivel;

    
    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, unique = false, length = 10)
    private String materias_inscritas;



    public Enlace() {
    }

    public Enlace(String nombre, String programa, Boolean estado, String rol, String nivel, String materias_inscritas) {
        this.nombre = nombre;
        this.programa = programa;
        this.estado= estado;
        this.rol= rol;
        this.nivel=nivel;
        this.materias_inscritas= materias_inscritas;
    }

    public Long getId_enlace() {
        return id_enlace;
    }

    public void setId_enlace(Long id_enlace) {
        this.id_enlace = id_enlace;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }
    
    public void setPrograma(String programa){
        this.programa= programa;
    }
    
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol){
        this.rol= rol;
    }

     public String getNivel() {
        return nivel;
    }
    
    public void setNivel(String nivel){
        this.nivel= nivel;
    }

     public String getMaterias_inscritas() {
        return materias_inscritas;
    }
    
    public void setMaterias_inscritas(String materias_inscritas){
        this.materias_inscritas= materias_inscritas;
    }



}