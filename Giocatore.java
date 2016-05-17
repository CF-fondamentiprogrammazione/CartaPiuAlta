package CartaPiùAlta;

public class Giocatore {
	private int amount;
	private String nome;
	
	/**
	 * costruttore di tipo Giocatore
	 * @param _nome nome del giocatore
	 * @param _amount quanti&agrave di soldi disponibili da giocare
	 */
	public Giocatore( String _nome,int _amount)
	{
		nome=_nome;
		amount=_amount;
	}
	
	/**
	 * dopo un round aggiorna il saldo disponibile
	 * @param vincita quanto il giocatore ha puntato positivo se ha vinto negativo se ha perso
	 */
	public void setAmount(int vincita)
	{
		amount+=vincita;
	}
	
	/**
	 * verifica se il giocatore ha ancora un saldo positivo
	 * @return true se il saldo &egrave positivo
	 * @return false se il saldo &egrave negativo o nullo
	 */
	public boolean puòGiocare()
	{
		if(amount>0)return true; 
		else return false;
	}
	
	/**
	 * restituisce il saldo del giocatore
	 * @return il saldo del giocatore
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
