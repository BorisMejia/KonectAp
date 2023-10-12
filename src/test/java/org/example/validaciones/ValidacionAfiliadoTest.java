package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {


    private ValidacionAfiliado validacionAfiliado;
    @BeforeEach
    public void prepararPruebas(){
        this.validacionAfiliado= new ValidacionAfiliado();

    }
    @Test
    public void valiadarIdCorrecto(){
        //1 preparar
        Integer idPrueba=50;
        //2 ejecutar
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.valiadarId(idPrueba));
        //3 verificar
        Assertions.assertTrue(resultado);
    }
    @Test
    public void valiadarIdIncorrecto(){
        //1 preparar
        Integer idPrueba =-150;
        //2 ejecute
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.valiadarId(idPrueba));
        //3 validar
        Assertions.assertEquals("Error en el id care chimba porque es negativo", resultado.getMessage());
    }

}