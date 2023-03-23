package br.com.pontoacai;

import javax.swing.*;

public class PontoAcai {

    public static void main(String[] args) {


        double valor;
        Acai a = new Acai();

        JOptionPane.showMessageDialog(null, "Bem vindo a Sorverteria PontoNewton !!", "PONTO NEWTON", JOptionPane.INFORMATION_MESSAGE);
        int pedido = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu pedido: \n1.300ml \n2.500ml \n3.700ml\n4.Sair"));

        switch (pedido) {
            case 1:
                valor = 8.00;
                JOptionPane.showMessageDialog(null, "o valor é:" + valor);
                String acressimo = (JOptionPane.showInputDialog(null, "Seu Açai tera Acréssimo? \n1.sim \n2.não"));
                boolean acressimoCalculo;
                if (acressimo.equals("1")) {
                    acressimoCalculo = true;
                } else {
                    acressimoCalculo = false;
                }
                a.valor = valor;
                Double valorTotal = a.calcular(acressimoCalculo);
                JOptionPane.showMessageDialog(null, "Valor Final " + valorTotal);

            case 2:
                valor = 10.00;
                JOptionPane.showMessageDialog(null, "O valor é: " + valor);
                acressimo = (JOptionPane.showInputDialog(null, "Seu Açai tera Acréssimo? \n1.Sim \n2.Não"));
                    if (acressimo.equals("1")) {
                        acressimoCalculo = true;
                } else {
                        acressimoCalculo = false;
                }
                a.valor = valor;
                valorTotal = a.calcular(acressimoCalculo);
                JOptionPane.showMessageDialog(null, "Valor Final " + valorTotal);
            case 3:
                valor = 12.00;
                JOptionPane.showMessageDialog(null, "o valor é: " + valor);
                acressimo = (JOptionPane.showInputDialog(null, "Seu Açai tera Acréssimo? \n1.sim \n2.não"));
                if (acressimo.equals("1")) {
                    acressimoCalculo = true;
                    } else {
                    acressimoCalculo = false;
                }
                a.valor = valor;
                valorTotal = a.calcular(acressimoCalculo);
                JOptionPane.showMessageDialog(null, "Valor Final" + valorTotal);

            default:
                JOptionPane.showMessageDialog(null, "Obrigado pela preferência !!");
        }
    }
}
