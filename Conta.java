import java.util.Random;
import java.lang.Math;
public class Conta {
        private String nome;
        private String sobreNome;
        private int numero;
        private double saldo;
        private double limite;
        private String senha;
        private double chequeEspecial;
       
    
        public Conta(String nome,String sobreNome,String senha,Boolean cheque){
            this.nome=nome;
            this.sobreNome=sobreNome;
            Random gerador = new Random();
            this.numero=Math.abs(gerador.nextInt());
            this.saldo=5;
            this.limite=1200.00;
            this.senha=senha;
           possueCheque(cheque);
        }

    // public void senha(){
    //     if(senha != senha){
    //         System.out.println("acesso permitido");
    //     }else{
    //         System.out.println("acesso negado");
    //     }
    // }

        public boolean sacar(Double valor){
            if(valor>0 && this.getSaldo() >= valor){
                this.saldo-=valor;
                System.out.println("saque realizado");
                return true;
            }else{
                System.out.println("valor indisponivel");
                return false;
            }

        }

        public boolean depositar(Double valor){
            if(valor < 0){
                System.out.println("Valor negativo");
                return false;
            }else{
                this.saldo += valor;
                System.out.println("valor positivo");
                return true;
            }
        }
        public void possueCheque(boolean cheque){
            if(cheque){
                this.chequeEspecial=2300.00;
            }
            else
            {
                this.chequeEspecial=0;
            }


        }

        @Override
        public String toString(){
            return String.format("Nome: %s, Número: %i,Saldo: %s, Limite: %s",this.nome, this.numero,this.saldo,this.limite,this.senha);
        }
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome=nome;
        }
        public String getSobreNome(){
            return sobreNome;
        }
        public void setSobreNome(String sobreNome){
            this.sobreNome=sobreNome;
        }
        public int getNumero(){
            return numero;
        }
        public void setNumero(int numero){
            this.numero=numero;
        }
        public double getSaldo(){
            return saldo;
        }
        public void setSaldo(double saldo){
            this.saldo=saldo;
        }
        public double getLimite(){
            return limite;
        }
        public void setLimite(double limite){
            this.limite=limite;
        }
        public String getSenha(){
            return senha;
        }
        public void setSenha(String senha){
            this.senha=senha;
        }
        public double getChequeEspecial(){
            return chequeEspecial;
        }
        public void setChequeEspecial(double chequeEspecial){
            this.chequeEspecial=chequeEspecial;
        }
}
    
