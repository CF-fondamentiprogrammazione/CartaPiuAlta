package CartaPiùAlta;

public class TipoCarta {
	private static final String NOME="Francesi";
	private static final String[] NOMECARTE={"asso", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "jack", "donna", "re"};
	private static final String[] SEME={"cuori", "quadri", "fiori", "picche"};
	private static final int[] VAL_CARTE={14,2,3,4,5,6,7,8,9,10,11,12,13};
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public static int getValore (int index)
	{
		return VAL_CARTE[index];
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public static String getNome (int index)
	{
		return NOMECARTE[index];
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public static String getSeme (int index)
	{
		return SEME[index];
	}
}
