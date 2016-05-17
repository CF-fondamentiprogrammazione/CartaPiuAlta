package CartaPiùAlta;

import myLib.Input;
import myLib.MyMenu;

public class Main {
public static final String []voci={"SCOMMETTI","RIFIUTA"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giocatore player=new Giocatore(Input.leggiString("inserisci nome"),Input.leggiIntero(0,-3,"inserisci quanto vuoi giocare"));
		System.out.println("benvenuto "+ player.getNome());
		Mazzo mazzo=new Mazzo();
		
		boolean smetti=false;
		MyMenu menu=new MyMenu("menu",voci);
		do
		{
		//if(mazzo.mazzo.size()<=0)break;	
		Carta cartaGiocatore=mazzo.estrai();
		System.out.println("la carta del giocatore è "+ cartaGiocatore.getValore()+cartaGiocatore.getSegno());
		int scelta=menu.scegli();
		switch(scelta)
		{
		case 1:{
			//System.out.println("quanto scommetti?");
			int scommessa=Input.leggiIntero(0, player.getAmount()+1,"quanto scommetti?");
			//if(mazzo.mazzo.size()<=0)break;	
			Carta cartaBanco=mazzo.estrai();
			System.out.println("la carta del banco è "+ cartaBanco.getValore()+cartaBanco.getSegno());
			if(cartaGiocatore.getValore()>cartaBanco.getValore())
			{
				System.out.println("vince il giocatore ");
				player.setAmount(scommessa);
				System.out.println(player.getAmount());
			}
			else {
				System.out.println("vince il banco ");
				player.setAmount(-scommessa);
				if(!player.puòGiocare())
				{
					System.out.println("mi dispiace hai perso");
					System.exit(0);
					}
				else System.out.println(player.getAmount());
			};break;}
			case 2:break;
			case 0: smetti=true;break;
			
		}
		}	while((!smetti)&&mazzo.mazzo.size()>1);
		if(mazzo.mazzo.size()<=1)
		{
			System.out.println("mi dispiace sono finite le carte la partita è finita");
		}
		System.exit(0);
		}
		
			}

