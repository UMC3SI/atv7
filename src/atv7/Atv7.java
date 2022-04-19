/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

/**
 *
 * @author Guilherme Antunes-RGM:11211102142 Matheus Meirielli-RGM:11211102089
 */
import java.util.Scanner;

public class Atv7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto:");
        String M1 = sc.nextLine();
        System.out.println("Valor da M1: " + M1);

        System.out.print("Digite um texto:");
        String M2 = sc.nextLine();
        System.out.println("Valor da M2: " + M2);

        Aluno guilherme = new Aluno(M1, M2);

        guilherme.CalculoMedia();

        System.out.println("media: " + guilherme.getMedia());
    }

}
