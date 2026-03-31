class Gerente extends Funcionario 
{
    private double bonus;
    
    Gerente(String nome, double salario, double bonus)
    {
        super(nome, salario);
        this.bonus=bonus;
    }
    
    void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    double getBonus()
    {
        return bonus;
    }
    
    @Override
    void exibirDados()
    {
        super.exibirDados();
       System.out.println("Bonus: "+ bonus);
    }
}
