package candidatura;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			e = new ParametrosInvalidosException("O segundo parâmetro deve ser maio que o primeiro");

		}
		input.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i < contagem + 1; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super();
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
		System.out.println(mensagem);
    }
}
