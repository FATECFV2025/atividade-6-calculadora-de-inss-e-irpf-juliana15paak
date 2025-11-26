public enum TipoContribuinte{
  FuncionarioCLT, Estagiario, PrestadorServico;
}

public abstract class Contribuinte implements CalculadoraTributo{
  private String nome;
  private String cpf;
  private double salarioBruto;

  public Contribuinte(String nome, String cpf, double salarioBruto){
    this.nome = nome;
    this.cpf = cpf;
    this.salarioBruto = salarioBruto;
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getCpf(){
    return this.cpf;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public double getSalarioBruto(){
    return this.salarioBruto;
  }
  public void setSalarioBruto(double salarioBruto){
    this.salarioBruto = salarioBruto;
  }

  public void exibirResumo(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Tipo do contribuinte: ");
    System.out.println("Salário bruto: "+this.salarioBruto);
    System.out.println("Valor do INSS: "+calcularINSS());
    System.out.println("Valor do IRPF: "+calcularIRPF());
    System.out.println("Salário líquido: "+calcularSalarioLiquido());
  }
}