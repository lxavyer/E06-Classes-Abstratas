import java.util.Date;



public abstract class Operacao {


    private Date data;


    private char tipo;

    private double valor;
    private static int totalOperacoes = 0;

    public void imprimirExtrato() {
        System.out.println(data + "\t" + tipo + "\t" + valor);
    }

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        totalOperacoes++;
    }

    public Date getData(){
        return this.data;
    }

    public char getTipo(){
        return this.tipo;
    }

    public void setTipo(char tipo){

        if(tipo == 'd' || tipo == 's'){
            this.tipo = tipo;
        }
        else{
            System.out.println("erro ao fazer a operacao");
        }
    }

    public double getValor(){
        return this.valor;
    }
    public double setValor(){
        return this.valor;
    }

    public static int getTotalOperacoes() {
        return totalOperacoes;
    }

}