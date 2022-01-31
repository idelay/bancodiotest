
//Banco digital, classe Cliente
public class Cliente
{   
    String cpf;
    String nome;
    ContaCorrente corrente = new ContaCorrente();
    ContaPoupanca poupanca = new ContaPoupanca();
}


class Conta
{
    float saldo;
}


class ContaCorrente extends Conta implements Extrato
{
    
    public void liberarExtrato(){
        System.out.println("Executado!\nSaldo: " + saldo);
    }
}

class ContaPoupanca extends Conta implements Extrato
{
    
    public void liberarExtrato(){
        System.out.println("Executado!\nSaldo: " + saldo);
    }
}

interface Extrato
{
    public void liberarExtrato();
}