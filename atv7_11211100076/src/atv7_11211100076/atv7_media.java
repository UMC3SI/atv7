package atv7_11211100076;

import java.util.Scanner;

/*
 * autor Leonardo Piascentini Bugmann 11211100076
 * co-autor Lucas da Silva Cardoso 11211102438
 */
public class atv7_media {
	
	 public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a M1: ");
	        String m1 = scanner.nextLine();
	        System.out.print("Digite a M2: ");
	        String m2 = scanner.nextLine();
	        Aluno aluno1 = new Aluno(m1, m2);
	        aluno1.calcularMedia();
	        System.out.println("A media do aluno é: "+ aluno1.getMedia());
	}
}
