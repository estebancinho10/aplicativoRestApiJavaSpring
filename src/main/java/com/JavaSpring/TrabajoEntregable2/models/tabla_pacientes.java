package com.JavaSpring.TrabajoEntregable2.models;

import javax.persistence.*;

@Entity
@Table(name = "pacientes")
public class tabla_pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String Nombre;
    private String Apellido;
    private String Especialidad;
    private Integer Consultorio;
    private String Email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public void setPrioridad(Integer Consultorio) {
        this.Consultorio = Consultorio;
    }

    public Integer getPrioridad() {
        return Consultorio;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
