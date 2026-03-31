public class Funcionario {
    private String nome;
    private double salario;
    
    
    Funcionario(String nome, double salario)
    {
        this.nome=nome;
        this.salario=salario;
    }
    
    Funcionario(){
        
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
   void setsalario(double salario){
        this.salario = salario;
    }
    
   String getnome(){
       return(nome);
   }
   
   double getsalario(){
       return(salario);
   }
   
   void exibirDados(){
       System.out.println("Nome: "+ nome);
       System.out.println("Salario: "+ salario);
       
   }
   
}
