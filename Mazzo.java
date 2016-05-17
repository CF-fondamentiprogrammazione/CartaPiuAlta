package CartaPiùAlta;
import java.util.ArrayList;
public class Mazzo {
public ArrayList<Carta> mazzo=new ArrayList<Carta>();
	
	/**
	 * costruttore di tipo Mazzo
	 */
	public Mazzo()
	{
		for (int i=0;i<13;i++)
		{
			for (int j=0; j<4;j++)
			{
			Carta carta=new Carta(j,i);
				mazzo.add(carta);
			}
		}
	}
	
	/**
	 * Estrae una carta dal mazzo e la rimuove
	 * @return Carta
	 */
	public Carta estrai()
	{
		int indice=Estrai.estrai(mazzo.size()-1);
		Carta carta =mazzo.get(indice);
		mazzo.remove(indice);	
	return carta;
	
	}
}
