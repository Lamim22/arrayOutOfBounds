/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayoutofbounds;
import java.util.Scanner;

/**
 *
 * @author devsys-a
 */
public class ArrayOutOfbounds {
    
    public static void main(String[] args){
        
        Scanner t = new Scanner(System.in);
       
        int[] vetor = new int [5];
       
       try { 
            System.out.println("Qual indice quer acessar: ");            
            int vet = t.nextInt();
            
            System.out.println(vetor[vet]);
            System.out.printf("Indíce acesado!" ,vet);
           
       }catch(ArrayIndexOutOfBoundsException e){
           
           System.out.printf("Seu indice esta fora dos limites!!" ,e);
     
       }
    
    }
}
