import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numero = ler.nextInt();
        ler.nextLine();

        System.out.println("Por favor, digite o código da Agência !");
        String agencia = ler.nextLine();

        System.out.println("Por favor, digite o nome completo do cliente !");
        String cliente = ler.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        float saldo = ler.nextFloat();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        ler.close();
    }
}
