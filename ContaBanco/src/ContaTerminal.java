
//TODO: Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        // Obter pela Scanner os valores digitados no terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        scanner.useDelimiter("\\n");

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu Nome e Sobrenome !");
        String nomeCliente = scanner.next();

        scanner.useDelimiter("\\n");

        System.out.println("Por favor, digite o seu Saldo !");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque.");
    }
}
