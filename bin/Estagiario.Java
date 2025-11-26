public class Estagiario extends Contribuinte{
  public Estagiario(String nome, String cpf, double salarioBruto, TipoContribuinte tipo){
    super(nome, cpf, salarioBruto, TipoContribuinte.Estagiario);
  }
  @Override
  public double calcularINSS(){
    return 0.0;
  }
  @Override
  public double calcularIRPF(){
    return 0.0;
  } 
  @Override
  public double calcularSalarioLiquido(){
    return getSalarioBruto();
  }
}