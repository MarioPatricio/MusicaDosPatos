package Musica;

import java.util.Scanner;

public class Patos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, x;
		System.out.print("Quantos patinhos foram passear? ");
		n = in.nextInt();
		x = n;
		while (n < 0) {
			System.out.print("Quantos patinhos foram passear? ");
			n = in.nextInt();
		}
		for (int i=0; i<=n+1; i++) {
			System.out.println(n + " patinhos foram passear, além das montanhas para brincar...");
			n--;
		}if (n==0) {
			while (n <= x){
			System.out.println("A mamãe gritou: Quá, Quá, Quá... Mas só " + n +"patinhos voltaram de lá...");
			n++;
			}
		}

	}

}

