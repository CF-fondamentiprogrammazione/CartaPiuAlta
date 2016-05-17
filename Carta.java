package CartaPiùAlta;

public class Carta {
	int indexSeme;
	int indexNumero;
	
	/**
	 * Costruttore del tipo Carta
	 * @param _indexSeme numero tra 1 e 4-> cuori, quadri, fiori, picche
	 * @param _indexNumero
	 */
	public Carta(int _indexSeme,int _indexNumero)
	{
		indexSeme=_indexSeme;
		indexNumero=_indexNumero;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getValore()
	{
		return TipoCarta.getValore(indexNumero);
				//////TipoCarta.VAL_CARTE[indexNumero];
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome()
	{
		return  TipoCarta.getNome(indexNumero)+" di "+TipoCarta.getSeme(indexSeme);
				//////TipoCarta.NOMECARTE[indexNumero]+" di "+TipoCarta.SEME[indexSeme];
	}
}
