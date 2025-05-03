package Contacorrente;
public class ContaCorrente {
    int numero;
    String titular;
    float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public float sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return 0;
        } else if(valor <= 10000 && valor > 0) {
            saldo -= valor;
            return valor;
        }
        else{
            System.out.println("Valor inválido.");
            return 0;
        }
    }
    public void depositar(float valor) {
        if (valor > 0 && valor <= 10000) {
            System.out.println("Valor depositado: R$" + valor);
            saldo += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
