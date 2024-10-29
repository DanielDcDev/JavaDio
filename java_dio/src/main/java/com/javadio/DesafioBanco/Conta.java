package com.javadio.DesafioBanco;

public abstract class Conta implements Banco{ 

private static int SEQUENCIAL = 1;
private static int AGENCIA_PADRAO = 1;

public class Conta {

    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super. numero = SEQUENCIAL++;
    }
    protected int agencia;
    protected int numero ;
    protected double saldo;

    public void sacar(double valor){

    }
    public void depositar(double valor){

    }
    public void transferir(double valor, Conta contaDestino){

    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    

}
}