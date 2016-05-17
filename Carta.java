package CartaPiùAlta;

public class Carta {
	int indexSeme;
	int indexNumero;
	
	/**
	 * Costruttore del tipo Carta
	 * @param _indexSeme numero tra 0 e 3-> cuori, quadri, fiori, picche
	 * @param _indexNumero valore della carta-> da 0 a 12
	 */
	public Carta(int _indexSeme,int _indexNumero)
	{
		indexSeme=_indexSeme;
		indexNumero=_indexNumero;
	}
	
	/**
	 * Restituisce il valore della carta
	 * @return un numero_> 14=asse,2,3,4,5,6,7,8,9,10,11=jack,12=donna,13=re
	 */
	public int getValore()
	{
		return TipoCarta.getValore(indexNumero);
				//////TipoCarta.VAL_CARTE[indexNumero];
	}
	
	/**
	 * Restituisce il nome della carta
	 * @return stringa "asso", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "jack", "donna", "re"
	 */
	public String getNome()
	{
		return  TipoCarta.getNome(indexNumero)+" di "+TipoCarta.getSeme(indexSeme);
				//////TipoCarta.NOMECARTE[indexNumero]+" di "+TipoCarta.SEME[indexSeme];
	}
}
