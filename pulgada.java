import java.util.Scanner;

/**
 * Programa para convertir unidades a pulgadas
 * 
 * @author Carlos Alvarez 
 * @version 20190817
 */
public class pulgada
{
    public static void main(String[] args)
    {
        double puapi=12, puacm=0.393701, puale=190080.02, puaya=36;
        double p, c, l, y, piapu, cmapu, leapu, yaapu;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor, ingrese la cantidad pies (P)");
        p = Teclado.nextDouble();
        
        System.out.println("Por favor, ingrese la cantidad centimetros (C)");
        c = Teclado.nextDouble();
        
        System.out.println("Por favor, ingrese la cantidad de leguas (L)");
        l = Teclado.nextDouble();
        
        System.out.println("Por favor, ingrese la cantidad yardas (Y)");
        y = Teclado.nextDouble();
        
        piapu = p*puapi;
        cmapu = c*puacm;
        leapu = l*puale;
        yaapu = y*puaya;
        
        System.out.println(p + " pies, es igual a " + piapu + " pulgadas");
        System.out.println(c + " centimetros, es igual a " + cmapu + " pulgadas");
        System.out.println(l + " leguas, es igual a " + leapu + " pulgadas");
        System.out.println(y + " yardas, es igual a " + yaapu + " pulgadas");
    }
}
