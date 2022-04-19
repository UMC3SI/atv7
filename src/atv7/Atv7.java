/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

import java.util.Scanner;

/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Gustavo Monteiro - 11211100223@alunos.umc.br
 */
public class Atv7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a M1: ");
        String m1 = sc.nextLine();
        System.out.print("Insira a M2: ");
        String m2 = sc.nextLine();
        Aluno a1 = new Aluno(m1, m2);
        a1.calcularMedia();
        System.out.println("A media do aluno é: "+ a1.getMedia());
    }
    
}
