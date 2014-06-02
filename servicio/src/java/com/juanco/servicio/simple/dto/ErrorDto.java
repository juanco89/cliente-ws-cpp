
package com.juanco.servicio.simple.dto;

import java.io.Serializable;

/**
 * Dto que encapsula los mensajes de error.
 * 
 * @author Juan C. Orozco <juanco89@gmail.com>
 */
public class ErrorDto implements Serializable {
    
    /** Código del error. */
    private int codigo;
    
    /** Mensaje descriptivo del error. */
    private String descripcion;
    
    public ErrorDto() {
    }

    public ErrorDto(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
