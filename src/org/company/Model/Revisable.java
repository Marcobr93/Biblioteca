package org.company.Model;


/**
 * Interfaz que define el comportamiento de las obras que se solo se pueden revisar en las salas del
 * Castillo de Hogwarts.k
 */
public interface Revisable {

    void solicitudRevision(String sala, String profesor);
    void finRevision();
}
