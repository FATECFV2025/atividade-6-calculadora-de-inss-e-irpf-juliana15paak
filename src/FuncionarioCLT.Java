public class FuncionarioCLT extends Contribuinte{
  public FuncionarioCLT(String nome, String cpf, double salarioBruto){
    super(nome, cpf, salarioBruto);
  }
  @Override
  public double calcularINSS(){
    return getSalarioBruto() * 0.11;
  }
  public double calcularIRPF(){
    return getSalarioBruto() * 0.075;
  }
  public double calcularSalarioLiquido(){
    return getSalarioBruto() - calcularINSS() - calcularIRPF();
  }
}