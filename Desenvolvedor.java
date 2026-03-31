class Desenvolvedor extends Funcionario 
{
    private String linguagem;
    
    Desenvolvedor(String nome, double salario, String linguagem)
    {
        super(nome, salario);
        this.linguagem=linguagem;
    }
    
    void setLinguagem(String linguagem)
    {
        this.linguagem=linguagem;
    }
    
    String getLinguagem()
    {
        return linguagem;
    }
    
    @Override
    void exibirDados()
    {
        super.exibirDados();
       System.out.println("Linguagem: "+ linguagem);
    }
}
