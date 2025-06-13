import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner
        //TODO: Exigir as mensagens para o nosso usuário
        //TODO: Obter pela classe Scanner os valores digitados pelo terminal
        //TODO: Exibir a mensagem final com a mensagem da conta criada
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor digite o seu Nome!");
        var nome = scan.nextLine();

        System.out.println(nome + ", digite o número da sua Conta!");
        var numeroConta = Integer.parseInt(scan.nextLine());

        System.out.println(nome + ", digite a sua Agência!");
        var agencia = scan.nextLine();


        System.out.println(nome + ", favor digite o seu saldo");
        var saldo = Double.parseDouble(scan.nextLine());

        var contaCriada = new ContaTerminal(numeroConta, agencia, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque.\n", nome, agencia, numeroConta, saldo);
    }
}
