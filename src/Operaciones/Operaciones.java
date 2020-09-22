/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Victor
 */
public class Operaciones {

    private int vUno;
    private int vDos;
    private int resultadoSuma;
    private int resultadoMultiplicacion;
    private int resultadoResta;
    private int resultadoDivision;

    public Operaciones(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;

    }

    public void Suma() {
        resultadoSuma = vUno + vDos;
    }

    public void Multiplicacion() {
        resultadoMultiplicacion = vUno * vDos;

    }

    public void Resta() {
        resultadoResta = vUno - vDos;

    }

    public void Division() {
        resultadoDivision = (vUno/vDos);
    }

    public void ImprimeResultado() {
        Suma();
        System.out.println("el resultado de la suma es "+ resultadoSuma);
        System.out.println("");
        Resta();
        System.out.println("el Resultado de la resta es "+resultadoResta);
        System.out.println("");
        Multiplicacion();
        System.out.println("El resultado de la multiplicacion es "+resultadoMultiplicacion);
        System.out.println("");
        Division();
        System.out.println("el resultado de la division es " + resultadoDivision);
        System.out.println("");
        
    }
}
