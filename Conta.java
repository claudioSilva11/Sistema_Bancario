public class Conta {
        private String nome;
        private String sobreNome;
        private int numero;
        private double saldo=0;
        private double limite=0;
        private int senha;
        private double sacar;
       
    
        public Conta(String nome,String sobreNome, int numero, double saldo, double limite,int senha,double sacar){
            this.nome=nome;
            this.sobreNome=sobreNome;
            this.numero=numero;
            this.saldo=saldo;
            this.limite=limite;
            this.senha=senha;
            this.sacar=sacar;
        }
        public Conta(double saldo,double limite, double sacar){

            this.saldo=saldo;
            this.limite=limite;
            this.sacar=sacar;
        }

    public void senha(){
        if(senha != senha){
            System.out.println("acesso permitido");
        }else{
            System.out.println("acesso negado");
        }
    }

        public void sacar(Double valor){
            if(valor>0 && this.getSaldo() >= valor){
                this.saldo-=valor;
                System.out.println("saque realizado");
            }else{
                System.out.println("valor indisponivel");
            }
        }

        public void depositar(Double valor){
            if(valor < 0){
                System.out.println("Valor negativo");
            }else{
                this.saldo += valor;
                System.out.println("valor positivo");
            }
        }
        public void transerir(Double valor, Conta conta1){
            this.saldo-=valor;
            conta1.saldo+=valor;
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
        public int getSenha(){
            return senha;
        }
        public void setSenha(int senha){
            this.senha=senha;
        }
        public double getSacar(){
            return sacar;
        }
        public void setSacar(double sacar){
            this.sacar=sacar;
        }
}
    
