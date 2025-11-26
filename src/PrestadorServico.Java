public class PrestadorServico extends Contribuinte{
  public PrestadorServico(String nome, String cpf, double salarioBruto, TipoContribuinte tipo){
    super(nome, cpf, salarioBruto, TipoContribuinte.PrestadorServico);
  }
  @Override
  public double calcularINSS(){
    return getSalarioBruto() * 0.05;
  }
  @Override
  public double calcularIRPF(){
    return getSalarioBruto() * 0.15;
  }
  @Override
  public double calcularSalarioLiquido(){
    return getSalarioBruto() - calcularINSS() - calcularIRPF();
  }
}