import javax.swing.JOptionPane;
import java.lang.String;
public class AppBanco {
	  private static int operacao;
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Seja bem-vindo ao nosso Banco!");

		int opcao_menu;
        // Conta conta;
        Conta conta = new Conta("claudio", "silva", "123", true);//construtor para teste

        do 
        {
            String menu = JOptionPane.showInputDialog("MENU PRINCIPAL"+"\n\nMENU"+"\n1.entrar"+"\n2.sair"+"\n\n"); 
            opcao_menu = Integer.parseInt(menu);

            switch(opcao_menu)
            {
                case 1:
                    do

                    {
					// 	        Object[] options={"Cadastrar", "Saque","Deposito","Consultar saldo","Sair", };
                    //   JOptionPane.showOptionDialog(null, "selecione", "Selecione a operação desejada.",
                    //   JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);

                        String select = JOptionPane.showInputDialog("SAIR \n"+"\nPRECIONE 9 PARA SAIR"+"\n\n"+"\n ESCOLHA A OPERAÇÂO DESEJADA: \n\n "+"1. CADASTRA CONTA \n"+"2. LOGIN \n"+"3. DEPOSITO \n"+"4. SALDO \n"+"5. SAQUE \n"+"6. EXTRATO \n"+"7. LIMITE \n" );
                        int operacao = Integer.parseInt(select);

                       if (operacao == 9)
                       {
                           JOptionPane.showMessageDialog(null,"Voltar ao MENU principal!");
                           break;
                       }

                       switch(operacao)
                       {


                           case 1:
                           {
                                JOptionPane.showMessageDialog(null,"cadastra Conta");
                                // String tipoConta;
                                // do{
                                //     tipoConta = JOptionPane.showInputDialog("Digite 1 para conta corrente \nDigite 2 para conta poupança: \n");
                                // }while(tipoConta != "1" || tipoConta != "2");
                                String tipoConta = JOptionPane.showInputDialog("Digite 1 para conta corrente \nDigite 2 para conta poupança: \n");

                                String nome=JOptionPane.showInputDialog("digite seu nome");
                                String sobreNome=JOptionPane.showInputDialog("digite seu sobrenome");
                                String senha = JOptionPane.showInputDialog("Digite sua senha para acesso");
                               	
                                // String chequeEspecial;
                                // do{
                                //    chequeEspecial = JOptionPane.showInputDialog("Digite 1 se deseja cheque especial \nDigite 2 se não deseja cheque especial");
                                // }
                                // while(chequeEspecial != "1" || chequeEspecial != "2");
                                String chequeEspecial = JOptionPane.showInputDialog("Digite 1 se deseja cheque especial \nDigite 2 se não deseja cheque especial");
                                
                                boolean sentencaChequeEspecial;
                                if(chequeEspecial=="1" ){
                                   sentencaChequeEspecial=true;
                                }else{
                                    sentencaChequeEspecial=false;
                                }
                                if(tipoConta=="1"){
                                    conta = new ContaCorrente(nome, sobreNome, senha, sentencaChequeEspecial);
                                }else{
                                    conta = new ContaPoupanca(nome, sobreNome, senha, sentencaChequeEspecial);
                                }
                                
                               break;
                           }   
                           case 2:
                           {
							   String nome="silva";
							   int senha= 123;
                               JOptionPane.showMessageDialog(null,"Login 2");
                               String id = JOptionPane.showInputDialog("Digite seu nome de usúario");
		                       String teste2 = JOptionPane.showInputDialog("Digite sua senha");

	                           int senha1 = Integer.parseInt(teste2);
                               if ((id.equals(nome)) && (teste2.equals(senha))){
	                           JOptionPane.showMessageDialog(null, "seja bem vindo");
	                        }
	                           else
	                            {
                                    JOptionPane.showMessageDialog(null, "Dados Inválidos");
                                }
                               break;
                           } 
                           case 3:
                           {
                               JOptionPane.showMessageDialog(null,"deposito 3");
                               String deposito = JOptionPane.showInputDialog("Faça um deposito na conta ");
	
	                           double valor = Double.parseDouble(deposito);
		
	                        if (conta.depositar(valor))
	                        {
	                        JOptionPane.showMessageDialog(null, "Obrigado por realizar um deposito");
	                        }
	                        else {
	                        JOptionPane.showMessageDialog(null, "De acordo com o contrato valor inválido para deposito");

                            }

                               break;
                           }   
                           case 4:
                           {
                               JOptionPane.showMessageDialog(null,"saldo 4");
                               if (conta.getSaldo()>0)
                               {
                               JOptionPane.showMessageDialog(null, "Seu saldo é: R$ ");
                               }
                               else {
                               JOptionPane.showMessageDialog(null, "Seu Saldo é negativo: R$");
   
                               }
                               break;
                           }  
                           case 5:
                           {
                                JOptionPane.showMessageDialog(null," sacar 5");
							    String sacar = JOptionPane.showInputDialog("Realize um saque ");
							    double sacar1 = Double.parseDouble(sacar);
                                if (sacar1 < 0) {
                                JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Saque realizado ");
                                  }
                                  break;
                             }
                           case 6:
                           {
                                JOptionPane.showMessageDialog(null," Imprimir extrato 6");
                                String nome= "silva"; //somente para teste do extrato 
                                int saldo=1200;
                                int conta1=67543;
                                //  //gera um extrato da operação realizada
                                String extrato = String.format("Número da Conta: %s\nNome: %s \nSaldo: %s \nSistema Desenvolvido por Claudio Silva Version 1.1", conta1,nome,saldo);

		                        JOptionPane.showMessageDialog(null, extrato);	
                               
                               break;
                           }  
						   case 7:
                           {
                                JOptionPane.showMessageDialog(null," limite ");
                                Double limite=1200.00;

                                String avisolimite = String.format("Seu limite para emprestimos é: R$ %.2f", limite);

                                JOptionPane.showMessageDialog(null, avisolimite);
                               break;
                           }  

                           default:
                           {
                                JOptionPane.showMessageDialog(null,"Essa opção não é valida!");
                                break;
                           }


                       }
                    }

                    while (operacao !=7);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null," Obrigado por acessar nosso banco!");
                           System.exit(0);
                default:
                     JOptionPane.showMessageDialog(null,"Programa vai voltar");
                    break;


            }
        }
        while (opcao_menu !=2);
    }
	

}