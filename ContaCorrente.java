public class ContaCorrente extends Conta {

        private double chequeEspecial;
    
        public ContaCorrente(String nome,String sobreNome,int numero,double saldo,double limite,int senha,double sacar,double cpmf,double chequeEspecial){
            super(nome,sobreNome,numero,saldo,limite,senha,sacar);
            this.chequeEspecial=chequeEspecial;
        }
        public double getChequeEspecial(){
            return chequeEspecial;
        }
        public void setChequeEspecial(double chequeEspecial){
            this.chequeEspecial=chequeEspecial;
        }
        
}
    
