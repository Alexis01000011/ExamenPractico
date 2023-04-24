package mx.edu.uaz.ingsoft.omt.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Nivel implements Serializable, IEntidad {
    @Id
    private Long id;
    @Column
    private String nombre;

    public Nivel(){

    }




    public Nivel(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nivel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
