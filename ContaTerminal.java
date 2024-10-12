import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
      
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite o número da Agência");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite o número da Conta");
            String conta = scanner.next();

            System.out.println("Por favor, digite seu Nome");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite seu Sobrenome");
            String sobrenomeCliente = scanner.next();

            System.out.println("Qual valor deseja depositar?");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente +", obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+ " e sua conta é "+conta + ". Seu saldo de " +saldo +" já está disponível para saque.");



    }
}
