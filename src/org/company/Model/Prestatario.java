package org.company.Model;

import java.util.Date;

/**
 * Created by marco on 27/4/17.
 */
public class Prestatario {
    private Date fecha;
    private int duracionPrestamo;
    private Alumno prestatario;

    // Constructores

    public Prestatario() {
    }

    public Prestatario(Date fecha, int duracionPrestamo, Alumno prestatario) {
        this.fecha = fecha;
        this.duracionPrestamo = duracionPrestamo;
        this.prestatario = prestatario;
    }

    // Accesores


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracionPrestamo() {
        return duracionPrestamo;
    }

    public void setDuracionPrestamo(int duracionPrestamo) {
        this.duracionPrestamo = duracionPrestamo;
    }

    public Alumno getPrestatario() {
        return prestatario;
    }

    public void setPrestatario(Alumno prestatario) {
        this.prestatario = prestatario;
    }
}
