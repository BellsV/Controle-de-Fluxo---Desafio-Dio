import java.util.Scanner;

public class Contador {
	public Contador() {
	}

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int primeiroParametro = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int segundoParametro = terminal.nextInt();

		try {
			contar(primeiroParametro, segundoParametro);
		} catch (ParametroInvalido var5) {
			System.out.println(var5.getMessage());
		}

	}

	public static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalido {
		if (primeiroParametro >= segundoParametro) {
			throw new ParametroInvalido("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int valorContavel = segundoParametro - primeiroParametro;

			for(int i = 1; i <= valorContavel; ++i) {
				System.out.println(i);
			}

		}
	}
}