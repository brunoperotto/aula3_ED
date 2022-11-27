/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author bperotto
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n;
        //Exercício 11
            /*System.out.println("Aprendendo Algoritmo");
            System.out.println("--------------------");
        //Exercício 12
            System.out.println("Aprendendo Algoritmo\nCom Anita e Guto");
            System.out.println("--------------------");
        //Exercício 16
            int x;
            x = 10;
            System.out.println("Valor de x é: "+x);
            System.out.println("--------------------");
        //Exercício 18
            int y;
            y = 10;
            System.out.println("Valor de x é: "+(y+1));
            System.out.println("--------------------");
        //Exercício 23
            String a;
            int d;
            a = JOptionPane.showInputDialog("Informe um valor de 3 dígitos: ");
            d = Integer.parseInt(a);
            d = (d%100)/10;
            System.out.println("Valor de a é: "+d);
            System.out.println("--------------------");
        //Exercício 25
            int data,dia,mes,ano;
            n = JOptionPane.showInputDialog("Digite data no formato ddmmaa: ");
            data = Integer.parseInt(n);
            dia = data/10000;
            mes = (data%10000)/100;
            ano = data%100;
            System.out.println("Dia: "+dia+"\nMês: "+mes+"\nAno: "+ano);
            System.out.println("--------------------");
        //Exercício 27
            int r,s;
            r=2;
            s=5;
            System.out.println("x: "+r+"\ny: "+s);
            r++;
            s--;
            System.out.println("Novo x: "+r+"\nNovo y: "+s);
            System.out.println("--------------------");
        //Exercício 31
            int ma;
            ma=(8+9+7)/3;
            System.out.println("Média Aritmética de 8, 9 e 7: "+ma);
            System.out.println("--------------------");
        //Exercício 40
            int dividendo,divisor,quoc,resto;
            n = JOptionPane.showInputDialog("Insira o valor do dividendo: ");
            dividendo = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("Insira o valor do divisor: ");
            divisor = Integer.parseInt(n);
            quoc = dividendo/divisor;
            resto = dividendo%divisor;
            System.out.println("Dividendo: "+dividendo);
            System.out.println("Divisor: "+divisor);
            System.out.println("Quociente: "+quoc);
            System.out.println("Resto: "+resto);
            System.out.println("--------------------");
        //Exercício 41
            int n1,n2,n3,n4;
            float mp;
            n = JOptionPane.showInputDialog("Insira o valor 1: ");
            n1 = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("Insira o valor 2: ");
            n2 = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("Insira o valor 3: ");
            n3 = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("Insira o valor 4: ");
            n4 = Integer.parseInt(n);
            mp = (n1*1 + n2*2 + n3*3 + n4*4)/10;
            System.out.println("Média Ponderada: "+mp);
            System.out.println("--------------------");
        //Exercício 42
            double angulo, rang;
            n = JOptionPane.showInputDialog("Insira um angulo em graus: ");
            angulo = Float.parseFloat(n);
            rang = (angulo*3.14)/180;
            System.out.println("seno: "+Math.sin(rang));
            System.out.println("Cosseno: "+Math.cos(rang));
            System.out.println("Tangente: "+Math.tan(rang));
            System.out.println("Co-secante: "+(1/Math.sin(rang)));
            System.out.println("Secante: "+(1/Math.cos(rang)));
            System.out.println("Cotangente: "+(1/Math.tan(rang)));
        //Exercício 43
            double num, lg;
            n = JOptionPane.showInputDialog("Insira o logaritmando: ");
            num = Float.parseFloat(n);
            lg = Math.log(num)/Math.log(10);
            System.out.println("Logaritmo: "+lg);
        //Exercício 44
            double m, base, logaritmo;
            n = JOptionPane.showInputDialog("Insira o logaritmando: ");
            m = Float.parseFloat(n);
            n = JOptionPane.showInputDialog("Insira a base: ");
            base = Float.parseFloat(n);
            logaritmo = Math.log(m)/Math.log(base);
            System.out.println("Logaritmo: "+logaritmo);
        //Exercício 46
            double saldo, nsaldo;
            n = JOptionPane.showInputDialog("Insira o saldo: ");
            saldo = Float.parseFloat(n);
            nsaldo = saldo*1.01;
            System.out.println("Novo Saldo: "+nsaldo);*/
        //Exercício 48
            double sm, qtdade, preco, vp, vd;
            n = JOptionPane.showInputDialog("Insira o salário mínimo: ");
            sm = Float.parseFloat(n);
            n = JOptionPane.showInputDialog("Insira a quantidade de Quilowatts: ");
            qtdade = Float.parseFloat(n);
            preco = sm/700;
            vp = preco*qtdade;
            vd = vp*0.9;
            System.out.println("Preço do quilowatt: "+preco+"\nValor a ser pago: "+vp+"\nValor com desconto: "+vd);
    }
    
}
