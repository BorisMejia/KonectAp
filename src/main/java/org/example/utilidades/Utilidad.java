package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public Boolean buscarCoincidencia(String expresionRegular, String cadenaTexto){
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher coincidencia=pattern.matcher(cadenaTexto);
        if(coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
}
