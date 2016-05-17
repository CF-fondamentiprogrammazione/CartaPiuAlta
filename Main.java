package CartaPiùAlta;

import myLib.Input;
import myLib.MyMenu;

public class Main {
private static final String []VOCI={"SCOMMETTI","RIFIUTA"};
private static final MyMenu MENU=new MyMenu("menu",VOCI);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giocatore player=new Giocatore(Input.leggiString("inserisci nome"),Input.leggiIntero(0,-3,"inserisci quanto vuoi giocare"));
		System.out.println("benvenuto "+ player.getNome());
		Mazzo mazzo=new Mazzo();
		String msg="";
		boolean smetti=false;
		do
		{
		Carta cartaGiocatore=mazzo.estrai();
		msg=String.format("la carta del giocatore è "+ cartaGiocatore.getNome());
		System.out.println(msg);
		int scelta=MENU.scegli();
		switch(scelta)
		{
		case 1:{
			int scommessa=Input.leggiIntero(0, player.getAmount()+1,"quanto scommetti?");
			Carta cartaBanco=mazzo.estrai();
			msg=String.format("la carta del banco è "+ cartaBanco.getNome());
			System.out.println(msg);
			if(cartaGiocatore.getValore()>cartaBanco.getValore())
			{
				msg=String.format("vince il giocatore ");
				System.out.println(msg);
				player.setAmount(scommessa);
				System.out.println(player.getAmount());
			}
			else
			{
				if(cartaGiocatore.getValore()==cartaBanco.getValore())
				{
					msg=String.format("pareggio si procede ad un altro turno");
					System.out.println(msg);
				}
				else
				{
					msg=String.format("vince il banco ");
					System.out.println(msg);
					player.setAmount(-scommessa);
					if(!player.puòGiocare())
					{
						msg=String.format("mi dispiace hai perso");
						System.out.println(msg);
						System.exit(0);
					}
					else 
					{
						System.out.println(player.getAmount());
					}
				}
			}
			break;}
			case 2:break;
			case 0: {
					smetti=true; 
					System.out.println("Ciao");
					
					break;}
					
			}
			
		
		}	while((!smetti)&&mazzo.mazzo.size()>1);
		if(mazzo.mazzo.size()<=1)
		{
			msg=String.format("mi dispiace sono finite le carte la partita è finita");
			System.out.println(msg);
		}
		
		System.exit(0);
		}
		
			}

