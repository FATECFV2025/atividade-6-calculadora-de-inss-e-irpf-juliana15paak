public class PrestadorServico extends Contribuinte{
  public PrestadorServico(String nome, String cpf, double salarioBruto){
    super(nome, cpf, salarioBruto);
  }
  @Override
  public double calcularINSS(){
    return getSalarioBruto() * 0.05;
  }
  public double calcularIRPF(){
    return getSalarioBruto() * 0.15;
  }
  public double calcularSalarioLiquido(){
    return getSalarioBruto() - calcularINSS() - calcularIRPF();
  }
}