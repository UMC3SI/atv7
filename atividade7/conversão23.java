/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class conversão23 {
    public static void main (String args[]){
        String st, st2;
        float real, real2;
        int int1, int2;
        
        //String para Real
        st = "12";
        real = (float) (new Float(st).floatValue());
        System.out.println("Sting para real: " + real);
        
        //Real para String
        real2 = 10;
        st2 = new Float(real2).toString();
        System.out.println("Real para String: " + st2);
        
        //String para Inteiro 
        st2 = "13";
        Produto.int1 = Integer.parseInt(st2);
        System.out.println("String para Inteiro: " + Produto.int1);
        
        //Inteiro para String
        Produto.int2 = 5;
        st2 = Integer.toString(Produto.int2);
        System.out.println("Inteiro para String: " + st2);
    }    
}
