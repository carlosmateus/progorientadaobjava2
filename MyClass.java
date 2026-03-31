public class MyClass {
    public static void main(String args[]) {
       Funcionario funcionario = new Funcionario ("Bruno", 6000);
       Gerente gerente = new Gerente ("Mariana", 8000, 1000);
       Desenvolvedor dev= new Desenvolvedor ("Rafael", 10000, "Java");
        
System.out.println("**Funcionarios**");
funcionario.exibirDados();

System.out.println("**Gerente**");
gerente.exibirDados();
       
System.out.println("**Desenvolvedor**");
dev.exibirDados();

    }
}
