package org.company.Model;

/**
 * Created by marco on 27/4/17.
 */
public class Articulo {
    private String codigo;
    private String titulo;
    private String año;

    // Constructores

    public Articulo() {
    }

    public Articulo(String codigo, String titulo, String año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    // Accesores


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.equals("")){
            this.codigo= "Sin código";
        }
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.equals("")){
            this.titulo = "Sin título";
        }
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        if (año.equals("")){
            this.titulo = "Sin año";
        }
        this.año = año;
    }
}
