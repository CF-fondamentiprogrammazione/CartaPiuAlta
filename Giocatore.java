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
	 * verifica se il giocatore ha ancora un saldo positivo
	 * @return true se il saldo è positivo
	 * @return false se il saldo è negativo o nullo
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
	 * restituisce il nome del giocatore
	 * @return il nome del giocatore
	 */
	public String getNome()
	{
		return nome;
	}
}
