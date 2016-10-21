/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double m=getMetros(); //varible con metodo que corresponde a cantidad en metros
        double p,y,mi; //variables con las equivalencias
        p=convPies(m); //metodo para convertir la cantidad dada a pies
        y=convYardas(m);//metodo para convertir la cantidad dada a yardas
        mi=convMillas(m); //metodo para convertir la cantidad dada a millas
        resultados(p,y,mi);
    }
    public static double getMetros(){ //obtenemos la cantidad requerida en metros 
        double metros;    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de metros a convertir");
        metros=teclado.nextDouble();
        return metros;
    }
    
    public static double convPies(double metros){ //convertimos a pies
        double pies;
        pies=(metros*3.28);
        return pies;
    }
    public static double convYardas(double metros){ //convertirmos a yardas
        double yardas;
        yardas=(metros/0.9144);
        return yardas;
    }
    
    public static double convMillas(double metros){ //convertimos a millas
        double millas;
        millas=(metros/1609.34);
        return millas;
    }
    
    public static void resultados(double pies, double yardas, double millas){ //recibimos las variables de conversiones y las mostramos en pantalla
        System.out.println("El equivalente en pies es "+pies+" ft, en yardas es "+yardas+" yd y en millas es "+millas+" mi." );
    }
}
