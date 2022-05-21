public class ContaPoupanca extends Conta{
    private double cpmf;

    public ContaPoupanca(String nome,String sobreNome, int numero, double saldo, double limite,int senha,double sacar, double cpmf) {
        super(nome,sobreNome,numero, saldo, limite,senha,sacar);
        this.cpmf=cpmf;
    }

    public double getCpmf(){
        return cpmf;
    }
    public void setCpmf(double cpmf){
        this.cpmf=cpmf;
    }

    
}
