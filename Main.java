import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoProduto, dinheiroRecebido, troco;
		int quantidade;

		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Preço unitário do produto: ");
		dinheiroRecebido = sc.nextDouble();

		troco = dinheiroRecebido - (precoProduto * quantidade) ;

		System.out.printf("Obrigado por comprar conosco! O seu troco é de %.2f", troco);

		sc.close();
	}

}
