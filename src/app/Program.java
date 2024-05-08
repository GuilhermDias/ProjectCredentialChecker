package app;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("[1] - Cadastro\n[2] - Login");
			System.out.print("Escolha uma opção: ");
			int op = sc.nextInt();
			switch (op) {
				case 1: {	
					System.out.println("OP 1");
					
					break;
				}
				case 2: {
					System.out.println("OP 2");
					
					
					break;
				}
				default: 
					throw new Exception("Opção Invalida");
			}
			
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
