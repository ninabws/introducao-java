/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testepessoa;

/**
 *
 * @author lab-626588
 */
public class TestePessoa {
     public static void main(String[] args){ 
           Endereço endereco1 = new Endereço("apartamento", "rua 1", (int) 1079);
           Pessoa pessoa1 = new Pessoa("João", (int) 17, (double) 70.5, endereco1);
           
           pessoa1.verDados();
     }
}

