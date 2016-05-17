package CartaPiùAlta;

public class Giocatore {
	private int amount;
	private String nome;
	
	/**
	 * 
	 * @param _nome
	 * @param _amount
	 */
	public Giocatore( String _nome,int _amount)
	{
		nome=_nome;
		amount=_amount;
	}
	
	/**
	 * 
	 * @param vincita
	 */
	public void setAmount(int vincita)
	{
		amount+=vincita;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean puòGiocare()
	{
		if(amount>0)return true; 
		else return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAmount()
	{
		return amount;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome()
	{
		return nome;
	}
}
