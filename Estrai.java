package CartaPiùAlta;

import java.util.Random;

public class Estrai {
	
private static Random estr=new Random();
	public static int estrai(int nMax)
	{
		nMax++;
		int numero;
		numero=estr.nextInt(nMax);
		numero=Math.abs(numero);
		return numero;
	}
}
