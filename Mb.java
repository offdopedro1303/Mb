package pct;
import java.util.*;
import java.lang.Math;
public class Mb {
	    private static Scanner input = new Scanner(System.in);

	    public static void main(String[] args) {
	        int mb, valor;
	        
	        System.out.println("Informe MBs");
	        mb = input.nextInt();
	        if (mb > 100) {
	            valor = (mb - 100) * 2 + 40;
	            System.out.println("Valor a ser pago R$" + valor);
	        } else {
	            System.out.println("Valor pago:R$100");
	        }
	    }
	}


