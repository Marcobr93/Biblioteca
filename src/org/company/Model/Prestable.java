package org.company.Model;

/**
 * Interfaz que define el comportamiento de las obras que se pueden ceder en préstamo.
 */
public interface Prestable {

    void solicitarPrestamo(int duracionPrestamo);
    void devolucionPrestamo();

}