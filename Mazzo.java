package CartaPiùAlta;
import java.util.ArrayList;
public class Mazzo {
public ArrayList<Carta> mazzo=new ArrayList<Carta>();
	
	/**
	 * 
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
	 * 
	 * @return
	 */
	public Carta estrai()
	{
		int indice=Estrai.estrai(mazzo.size()-1);
		Carta carta =mazzo.get(indice);
		mazzo.remove(indice);	
	return carta;
	
	}
}
