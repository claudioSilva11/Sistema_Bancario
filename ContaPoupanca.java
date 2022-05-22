public class ContaPoupanca extends Conta{
    // private double cpmf;
    private double taxa;

    public ContaPoupanca(String nome,String sobreNome,String senha,boolean chequeEspecial){
        super(nome,sobreNome,senha,chequeEspecial);
        this.taxa=0.0017;
        
    }
    public void rendimento(){
        double saldo=getSaldo()+getSaldo()*taxa;
        this.setSaldo(saldo);
    }
    // public double getCpmf(){
    //     return cpmf;
    // }
    // public void setCpmf(double cpmf){
    //     this.cpmf=cpmf;
    // }

    
}
