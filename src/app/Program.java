package app;

import java.util.Scanner;
import entites.Information;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String emailTest = "User1";
		
		try {
			System.out.println("[1] - Cadastro\n[2] - Login");
			System.out.print("Escolha uma opção: ");
			int op = sc.nextInt();
			switch (op) {
				case 1: {	
					System.out.print("Digite seu email: ");
					sc.nextLine();
					String email = sc.nextLine();
					
					System.out.print("Digite sua senha: ");
					String password = sc.nextLine();
					
					System.out.print("Comfirme sua senha: ");
					String comfirmedPassword = sc.nextLine();
					
					Information inf = new Information(email, password, comfirmedPassword);
					
					if(!email.equals(emailTest)) {
						if (password.equals(comfirmedPassword)) {
							System.out.println("Cadrastro feito com sucesso");
						}
						else {
							System.out.println("Email ou senha incorretos");
						}
					}
					else {
						System.out.println("Email já cadastrado!");
					}
					break;
				}
				case 2: {
					//Login
					break;
				}
				default: 
			}
			
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
