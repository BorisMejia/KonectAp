package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad = new Utilidad();
    public ValidacionAfiliado() {
    }
    public boolean valiadarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("Error en el id care chimba porque es negativo");
        }

        return true;
    }
    public boolean validarNombre(String nombre) throws Exception{
        if (nombre.length() < 3 || nombre.length() > 40){
            throw new Exception("El numero de caracteres no es correcto debe estar entre 3 y 40");
            }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("El nombre no cumple los parametros");
        }
        return true;
    }
    public Boolean validarApellidos(String apellidos)throws Exception {
        if (apellidos.length() < 10 || apellidos.length() > 50) {
            throw new Exception("El nombre ingresados no cumplen con el min o max de caracteres");
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, apellidos)){
            throw new Exception("Los apellidos ingresados no cumplen los parametros");
        }
        return true;
    }
    public Boolean validarDocumento(String documento)throws Exception{
        if(documento.length()<7 || documento.length()>10){
            throw new Exception("Documento con longitud invalida");
        }
        String expresionRegular = "^[0-9]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("Revise el formato ingresado");
        }
        return true;
    }
}
