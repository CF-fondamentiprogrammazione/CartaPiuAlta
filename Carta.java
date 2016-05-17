package CartaPiùAlta;

/**
 * 
 * 
 **/
public class Carta {
	private char segno;
	private int valore;
	
public Carta(char _segno,int _valore)
{
	segno=_segno;
	valore=_valore;
}
public int getValore()
{
	return valore;
}
public char getSegno()
{
	return segno;
}
}
