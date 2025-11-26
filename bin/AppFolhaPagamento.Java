import java.util.Scanner;

public class AppFolhaPagamento {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = in.nextLine();
        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = in.nextDouble();
        System.out.println("Digite 1 para CLT, 2 para Estagiário e 3 para Prestador de Serviço (PJ): ");
        int tipoContribuinte = in.nextInt();

        Contribuinte c = null;
        switch(tipoContribuinte){
            case 1: 
                c = new FuncionarioCLT(nome, cpf, salarioBruto);
                break;            
            case 2:
                c = new Estagiario(nome, cpf, salarioBruto);
                break;
            case 3:
                c = new PrestadorServico(nome, cpf, salarioBruto);
                break;
            default:
                System.out.println("Tipo de contribuinte inválido");
                break;
        }

        if c != null{
            c.exibirResumo()
        }
    }
}
