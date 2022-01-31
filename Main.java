//Banco digital
import java.util.Scanner;

public class Main
{
  /*static Scanner scan = new Scanner(System.in);
     static Cliente cliente = new Cliente();
     static int acao;
     static String cpf; */
  //removing static variables from Main 
  //+ giving internal variables to the functions makes the program more secure?

  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    Cliente cliente = new Cliente ();
    int acao;
    String cpf;
    /*
       1. Pede informaC'C#o para entrar
       2. Checa se a informaC'C#o estC! correta (true/false)
       3. (false) Volta 1
       3. (true) Pergunta qual tipo de conta deseja acessar
       4. Pergunta o que deseja fazer
       5. Executa o desejo
     */
      cliente.cpf = "00000000000";
      cliente.poupanca.saldo = 10000;
      cliente.corrente.saldo = 0;
      cliente.nome = "Pedro Ide";


    do
      {
	System.out.println ("Entre com seu cpf: ");
	cpf = scan.nextLine ();
      }
    while (!cpf.equals (cliente.cpf));
    //while(cpf != cliente.cpf); does not work


    do
      {
	System.out.println ("\nOlC!, "
			    + cliente.nome
			    +
			    ", o que deseja acessar?\n\n1. Conta poupanca\n2. Conta corrente");
	acao = scan.nextInt ();
	if (acao == 1)
	  {
	    acao (cliente.poupanca);
	    break;
	  }

	else if (acao == 2)
	  {
	    acao (cliente.corrente);
	    break;
	  }

	else
	  System.out.println ("Invalido.");
      }
    while (acao != 1 && acao != 2);
  }

  static void acao (ContaCorrente i)
  {
    Scanner scan = new Scanner (System.in);
    int acao;
    System.out.
      println
      ("O que deseja fazer?\n\n1. Saque\n2. Deposito\n3. Transferencia\n4. Checar saldo disponivel");
    acao = scan.nextInt ();
    switch (acao)
      {
      case 1:
	System.out.println ("Quanto sacar?");
	float valor = scan.nextFloat ();
	i.saldo -= valor;
	i.liberarExtrato ();
	break;

      case 2:
	System.out.println ("Quanto depositar? ");
	valor = scan.nextFloat ();
	i.saldo += valor;
	i.liberarExtrato ();
	break;

      case 3:
	System.out.println ("Quanto transferir? ");
	valor = scan.nextFloat ();
	i.saldo -= valor;
	i.liberarExtrato ();
	break;

      case 4:
	i.liberarExtrato ();
	break;
      default:
	System.out.println ("Invalido");
      }
  }
  static void acao (ContaPoupanca i)
  {
    Scanner scan = new Scanner (System.in);
    int acao;
    System.out.
      println
      ("O que deseja fazer?\n\n1. Saque\n2. Deposito\n3. Transferencia\n4. Checar saldo disponivel");
    acao = scan.nextInt ();
    switch (acao)
      {
      case 1:
	System.out.println ("Quanto sacar?");
	float valor = scan.nextFloat ();
	i.saldo -= valor;
	i.liberarExtrato ();
	break;

      case 2:
	System.out.println ("Quanto depositar?");
	valor = scan.nextFloat ();
	i.saldo += valor;
	i.liberarExtrato ();
	break;

      case 3:
	System.out.println ("Quanto transferir?");
	valor = scan.nextFloat ();
	i.saldo -= valor;
	i.liberarExtrato ();
	break;

      case 4:
	i.liberarExtrato ();
	break;
      default:
	System.out.println ("Invalido");
      }
  }

}
