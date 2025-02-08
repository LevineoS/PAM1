package projetobanco;

public class Conta {
    
    String nome;
    double saldo;
    
    public void depositar(double valor){
        //saldo = saldo + valor;
        saldo += valor;
        System.out.println("Operação de deposito no valor de R$: " + valor);
    }
    public void exibirSaldo(){
        System.out.println(nome + " seu saldo é R$: " + saldo);
    }
    public void sacar(double valor){

        if(saldo > valor){
           saldo -= valor;
           System.out.println("Operação de saque no valor de R$: " + saldo);
        }else{
            System.out.println("Operação de saque não realizada!");
        }
        
    }
}
