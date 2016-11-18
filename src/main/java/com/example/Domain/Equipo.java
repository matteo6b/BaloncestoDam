package com.example.Domain;

/**
 * Created by Mateo on 17/11/16.
 */

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreequipo;
    private String localidad;
    private LocalDate fechacreacion;



    public Equipo() {
    }

    public Equipo(String nombreequipo, String localidad, LocalDate fechacreacion) {
        this.nombreequipo = nombreequipo;
        this.localidad = localidad;
        this.fechacreacion = fechacreacion;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }



    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", NombreEquipo='" + nombreequipo + '\'' +
                ", Localidad='" + localidad + '\'' +
                ", FechaCreación=" + fechacreacion +
                '}' + System.lineSeparator();
    }
}
