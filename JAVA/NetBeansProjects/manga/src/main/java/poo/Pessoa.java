/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author lab-626588
 */
public class Pessoa {
    String nome;
    int idade;
    double peso;
    endereço enderecopessoa;

    public Pessoa(String nome, int idade, double peso, endereço enderecopessoa) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.enderecopessoa = enderecopessoa;
    }
    
    
    
    public void verDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.peso);
        System.out.println(this.enderecopessoa);
    }  
}
