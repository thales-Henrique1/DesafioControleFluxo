
import java.util.Locale;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Aula18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        try {
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); 
        }
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        if (valor1 > valor2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int conatgem = valor2 - valor1; 
        for (int i = 1; i <= conatgem; i++) {
            System.out.println("Imprimindo: " + i);
        }
    }
}
