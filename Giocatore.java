package CartaPi�Alta;

public class Giocatore {
private int amount;
private String nome;
public void setAmount(int vincita)
{
	amount=amount+vincita;
}
public Giocatore( String _nome,int _amount)
{
	nome=_nome;
	amount=_amount;
}
public boolean pu�Giocare()
{
	if(amount>0)
		return true; else return false;
}
public int getAmount()
{
	return amount;
}
public String getNome()
{
	return nome;
}
}
