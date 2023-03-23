package br.com.pontoacai;

public class Acai {
    public int tamanho;
    public Double valor;
    public Boolean acressimo;

    public Double calcular(Boolean acressimo){
        if (acressimo) {
            return valor + 2.00;
        }
        return valor;
    }
    public Double getValor() {return valor;}
}
