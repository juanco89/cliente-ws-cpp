
package com.juanco.servicio.simple.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Encapsula la respuesta para la operación generaraleatorios.
 * 
 * @author Juan C. Orozco <juanco89@gmail.com>
 */
public class RespuestaAleatorios implements Serializable {

    /**
     * Indica si la respuesta fue exitosa.
     * La respuesta es exitosa si la generación se realiza correctamente.
     */
    private boolean exitosa;
    
    /**
     * Lista de aleatorios generados.
     */
    private List<String> aleatorios;
    
    /**
     * Datos de error en caso de existir.
     */
    private ErrorDto error;
    
    public RespuestaAleatorios() {
    }

    public List<String> getAleatorios() {
        return aleatorios;
    }

    public void setAleatorios(List<String> aleatorios) {
        this.aleatorios = aleatorios;
    }

    public boolean isExitosa() {
        return exitosa;
    }

    public void setExitosa(boolean exitosa) {
        this.exitosa = exitosa;
    }

    public ErrorDto getError() {
        return error;
    }

    public void setError(ErrorDto error) {
        this.error = error;
    }
}
