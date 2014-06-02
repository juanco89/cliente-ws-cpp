
package com.juanco.servicio.simple;

import com.juanco.servicio.simple.dto.ErrorDto;
import com.juanco.servicio.simple.dto.RespuestaAleatorios;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.jws.WebService;

/**
 * Implementación del servicio simple.
 * 
 * @author Juan C. Orozco <juanco89@gmail.com>
 */
@WebService(
        serviceName = "ServicioSimple",
        endpointInterface = "com.juanco.servicio.simple.IServicioSimple"
    )
public class ServicioSimple implements IServicioSimple {

    @Override
    public String saludar(String nombre) {
        return "¡Hola " + nombre + "!";
    }

    @Override
    public long sumar(int a, int b) {
        return a + b;
    }

    @Override
    public RespuestaAleatorios generarAleatorios(int cantidad) {
        
        RespuestaAleatorios respuesta = new RespuestaAleatorios();
        
        if(cantidad <= 0) {
            respuesta.setExitosa(false);
            respuesta.setError(new ErrorDto(1, "Parámetros incorrectos"));
            return respuesta;
        }
        
        Random rnd = new Random(System.currentTimeMillis());
        
        List<String> aleatorios = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            aleatorios.add( String.valueOf(rnd.nextInt() * 100) );
        }
        respuesta.setExitosa(true);
        respuesta.setAleatorios(aleatorios);
        
        return respuesta;
    }
    
}
