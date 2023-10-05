package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.Examenesgenerales;
import org.example.entidades.Signovital;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);
        Afiliado afiliado= new Afiliado();

        System.out.println("Digite el id del Usuario: ");
        afiliado.setId(entradaTeclado.nextInt());

        System.out.println("Digite el nombre del usuario: ");
        afiliado.setNombres(entradaTeclado.nextLine());

        System.out.println("Digite el documento del usuario: ");
        afiliado.setDocumento(entradaTeclado.nextLine());

    }
}