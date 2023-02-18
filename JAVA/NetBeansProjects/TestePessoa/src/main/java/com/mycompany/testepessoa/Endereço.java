/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepessoa;

/**
 *
 * @author lab-626588
 */
public class Endereço {
    String tipoLogradouro;
    String logradouro;
    int numero;

    public Endereço(String tipoLogradouro, String logradouro, int numero) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
    }
    public void Endereço() {
        System.out.println(tipoLogradouro);
        System.out.println(logradouro);
        System.out.println(numero);
    }
}
