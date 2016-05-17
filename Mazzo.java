package CartaPiùAlta;
import java.util.ArrayList;
public class Mazzo {
public ArrayList<Carta> mazzo=new ArrayList<Carta>();
public Mazzo()
{
	for (int i=1;i<14;i++)
	{
		if(i==1)
		{
			Carta cartaCuori=new Carta('c',14);
			mazzo.add(cartaCuori);
			Carta cartaQuadri=new Carta('q',14);
			mazzo.add(cartaQuadri);
			Carta cartaFiori=new Carta('f',14);
			mazzo.add(cartaFiori);
			Carta cartaPicche=new Carta('p',14);
			mazzo.add(cartaPicche);
		}
		else
		{
		Carta cartaCuori=new Carta('c',i);
		mazzo.add(cartaCuori);
		Carta cartaQuadri=new Carta('q',i);
		mazzo.add(cartaQuadri);
		Carta cartaFiori=new Carta('f',i);
		mazzo.add(cartaFiori);
		Carta cartaPicche=new Carta('p',i);
		mazzo.add(cartaPicche);
		}
	}
}
public Carta estrai()
{
	int indice=Estrai.estrai(mazzo.size()-1);
	Carta carta =mazzo.get(indice);
	mazzo.remove(indice);	
return carta;

}
}
