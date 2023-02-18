/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps;

/**
 *
 * @author lab-626588
 */
public class ps {
    public static void main(String[] args) {
        String primeiro = new String("Nome1"); 
        String segundo = new String("Nome2"); 
        String nome = primeiro.concat(segundo);
    
        System.out.println("Meu nome é: "+nome);
        System.out.println("O número de caracteres é"+nome.length());
        
        String primeiro2= nome.substring(0, 6);
        String segundo2 = nome.substring(6, nome.length());
        System.out.println("primeiro2: "+primeiro2);
        System.out.println("segundo2: "+segundo2);
        
        
                
                }
           
    
}
