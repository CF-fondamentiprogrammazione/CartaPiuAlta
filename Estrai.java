package CartaPiùAlta;

import java.util.Random;

public class Estrai {
	
private static Random estr=new Random();
/**
 * estrae un numerpo random da 0 al numero mandato in input-1
 * @param nMax  numero massimo da estrarre (escluso) 
 * @return il numero estratto
 */
	public static int estrai(int nMax)
	{
		nMax++;
		int numero;
		numero=estr.nextInt(nMax);
		numero=Math.abs(numero);
		return numero;
	}
}
