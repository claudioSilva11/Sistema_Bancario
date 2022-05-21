import javax.swing.JOptionPane;
import java.lang.String;
import java.util.Random;
public class AppBanco {
	private static int AppBanco1;
    public static void main(String[] args) {
		

        JOptionPane.showMessageDialog(null,"Seja bem-vindo ao nosso Banco!");

		int menu1;

        do 
        {
            String menu = JOptionPane.showInputDialog("MENU PRINCIPAL"+"\n\nMENU"+"\n1.entrar"+"\n2.sair"+"\n\n"); 
            menu1 = Integer.parseInt(menu);

            switch(menu1)
            {
                case 1:
                    do

                    {
					// 	        Object[] options={"Cadastrar", "Saque","Deposito","Consultar saldo","Sair", };
                    //   JOptionPane.showOptionDialog(null, "selecione", "Selecione a operação desejada.",
                    //   JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);

                        String select = JOptionPane.showInputDialog("SAIR \n"+"\nPRECIONE 9 PARA SAIR"+"\n\n"+"\n ESCOLHA A OPERAÇÂO DESEJADA: \n\n "+"1. CADASTRA CONTA \n"+"2. LOGIN \n"+"3. DEPOSITO \n"+"4. SALDO \n"+"5. SAQUE \n"+"6. EXTRATO \n" );
                        int AppBanco1 = Integer.parseInt(select);


                        Random generator = new Random();

                       if (AppBanco1 == 9)
                       {
                           JOptionPane.showMessageDialog(null,"Voltar ao MENU principal!");
                           break;
                       }


                       int random = generator.nextInt(AppBanco1);

                       switch(AppBanco1)
                       {


                           case 1:
                           {
                               JOptionPane.showMessageDialog(null,"cadastra Conta"+random);
                               ContaPoupanca Objnome = new ContaPoupanca("joão","tadeu",45,234.34,3.000,123,3.0,2.3);
                                       ContaPoupanca ObjsobreNome = new ContaPoupanca("joão","tadeu",45,234.34,3.000,123,3.0,2.3);
                               		// ContaPoupanca Objnumero = new ContaPoupanca ("jose",23,0.23,0.20,234,4,4.3);
                                       ContaPoupanca Objsaldo = new ContaPoupanca("joão","silva",45,234.34,3.000,345,5,2);
                                       ContaPoupanca Objlimite = new ContaPoupanca ("jose","silva",23,0.23,0.20,321,5,2);
                                       ContaPoupanca Objsenha = new ContaPoupanca ("jose","silva",23,0.23,0.20,234,4,2);
                                       ContaPoupanca Objsacar = new ContaPoupanca ("jose","silva",23,0.23,0.20,234,3,2);
                               		// ContaPoupanca Objcpmf = new ContaPoupanca ("jose","silva",23,0.23,0.20,234,3,2);
                               
                               
                               
                                       String nome=JOptionPane.showInputDialog("digite seu nome");
                                       Objnome.setNome(nome);
                               		String sobreNome=JOptionPane.showInputDialog("digite seu sobrenome");
                                       Objnome.setSobreNome(sobreNome);
                                       String senha = JOptionPane.showInputDialog("Digite sua senha para acesso");
                               		int teste = Integer.parseInt(senha);
                               		Objsenha.setSenha(teste);
                               
                               
                                       String aviso=String.format("dados cadastrados %s",nome,sobreNome);
                                       String aviso2=String.format("nome %s \n senha %s",nome,senha);
                               
                                       JOptionPane.showMessageDialog(null, aviso);
                               	    JOptionPane.showMessageDialog(null, aviso2);
                                
                               break;
                           }   
                           case 2:
                           {
							   String nome="silva";
							   int senha= 123;
                               JOptionPane.showMessageDialog(null,"Login 2"+random);
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
                               JOptionPane.showMessageDialog(null,"deposito 3"+random);
                               String deposito = JOptionPane.showInputDialog("Faça um deposito na conta ");
	
	                           double depositar = Double.parseDouble(deposito);
		
	                        if (depositar < 20.00)
	                        {
	                        JOptionPane.showMessageDialog(null, "De acordo com o contrato valor inválido para deposito");
	                        }
	                        else {
	                        JOptionPane.showMessageDialog(null, "Obrigado por realizar um deposito");

                            }

                               break;
                           }   
                           case 4:
                           {
                               JOptionPane.showMessageDialog(null,"saldo 4"+random);
							
                            
                               break;
                           }  
                           case 5:
                           {
                               JOptionPane.showMessageDialog(null," sacar 5"+random);
							      String sacar = JOptionPane.showInputDialog("Realize um saque ");
							   double sacar1 = Double.parseDouble(sacar);
							//    if (sacar1 > saldoAtual) {
							// 	JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
							// }
							// else {

							// 	sacar1 = sacar1;
							// 	Objsacar.setSacar(sacar1);
                               break;
                           }  
                           case 6:
                           {
                               JOptionPane.showMessageDialog(null," Imprimir extrato 6"+random);
                               int conta1=67543;
                                    //    //gera um extrato da operação realizada
                                    //     String extrato = String.format("Número da Conta %s\nSaldo R$%.2f\nSaque realizado R$ %.2f\nLimite para emprestimo R$%.2f\nValor de CPMF R$%.2f\nSistema Desenvolvido por Claudio Silva Version 1.1", conta1, saldo.getSaldo(), Objsacar.getSacar(), Objlimite.getLimite(), Objcpmf.getCpmf());

		                            //     JOptionPane.showMessageDialog(null, extrato);	
                               
                               break;
                           }  
						   case 7:
                           {
                               JOptionPane.showMessageDialog(null," limite 7"+random);
							       double limite;
		                    // limite = depositar * (2);
	                    	// Objlimite.setLimite(limite);

							// String avisolimite = String.format("Seu limite para emprestimos é: R$ %.2f", Objlimite.getLimite() );

							// JOptionPane.showMessageDialog(null, avisolimite);
                               
                               break;
                           }  

                           default:
                           {
                           JOptionPane.showMessageDialog(null,"Essa opção não é valida!");
                           break;
                           }


                       }
                    }

                    while (AppBanco1 !=7);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null," Obrigado por acessar nosso banco!");
                           System.exit(0);
                default:
                     JOptionPane.showMessageDialog(null,"Programa vai voltar");
                    break;


            }
        }
        while (menu1 !=2);
    }
	

}