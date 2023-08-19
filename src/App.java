import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao nosso banco\n");
        System.out.println("Vamos criar sua conta\n");

        System.out.println("Informe os dados de acordo com as solitações\n");
        System.out.println("Informe o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe a agencia: ");
        String agencia = scanner.nextLine();
        agencia = scanner.nextLine();

        System.out.println("Infome seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Informe um aldo inicial de até R$ 100,00: ");
        Double saldo = scanner.nextDouble();
        while(saldo < 0 || saldo > 100 ){
            System.out.println("Saldo invalido por favor informar novamente: ");
            saldo = scanner.nextDouble();
        }

        ContaTerminal contaCliente =  new ContaTerminal(numeroConta,agencia,nomeCliente,saldo);

        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, seus dados agencia: %s, conta: %d, saldo %.2f já está disponivel para saque.", contaCliente.getNomeCliente(), contaCliente.getAgencia(),
        contaCliente.getNumero(), contaCliente.getSaldo());

    }
}
