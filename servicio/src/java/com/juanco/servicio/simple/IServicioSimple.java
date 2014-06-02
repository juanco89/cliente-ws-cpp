
package com.juanco.servicio.simple;

import com.juanco.servicio.simple.dto.RespuestaAleatorios;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * Interfaz del servicio web simple.
 * 
 * Contiene operaciones básicas para el uso del cliente gsoap.
 * 
 * @author Juan C. Orozco <juanco89@gmail.com>
 */
@WebService
public interface IServicioSimple {

    /**
     * Retorna un saludo con el nombre recibido.
     * 
     * @param nombre - Nombre recibido.
     * @return String - Saludo creado.
     */
    @WebMethod(operationName = "saludar")
    public String saludar(@WebParam(name = "nombre") String nombre);
    
    /**
     * Recibe dos cantidades y retorna su suma.
     * 
     * @param a - int - Cantidad 1.
     * @param b - int - Cantidad 2.
     * @return long - Suma de las cantidades recibidas.
     */
    @WebMethod(operationName = "sumar")
    public long sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
    
    /**
     * Genera una lista de números aleatorios.
     * Las lista es de longitud cantidad y los números serán entregados en string.
     * 
     * @param cantidad - int -  Cantidad de números aleatorios a generar.
     * @return RespuestaAleatorios - Dto con la lista generada de aleatorios.
     */
    @WebMethod(operationName = "generarAleatorios")
    public RespuestaAleatorios generarAleatorios(@WebParam(name = "cantidad") int cantidad);
}
