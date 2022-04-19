/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

import java.util.Scanner;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String m1 = sc.nextLine();
        String m2 = sc.nextLine();
        
        Aluno bruno = new Aluno(m1, m2);
        
        bruno.calculaMedia();
        
        System.out.println(bruno.getM1() + " " + bruno.getM2() + " " + bruno.getMedia());
        
        
    }
    
}
