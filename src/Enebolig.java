
public class Enebolig extends Eiendom {
	private int type;
	public static final int FRITTSTAAENDE = 1;
	public static final int REKKE = 2;
	public static final int TOMANNS = 3;
	
	public Enebolig(String adresse, String eier, double takst, int antKvm, int gnr, int bnr, int type){
		super(adresse, eier, takst, antKvm, gnr,bnr);
		this.type = type;
	}
	public String getTypeAsString(){
		String[] typer = {"Frittstående","Rekke", "Tomanns"};
		return typer[type - 1];
	}
	public void skrivAlleBud(){
		System.out.printf("Bud Gitt for ENEBOLIG %s, takst = %.0f, gnr = %d, bnr = %d, type = %s\n",
				getAdresse(), gettakst(), getgnr(), getbnr(), getTypeAsString());
		System.out.println("Bud Gitt:\t\t\tBudfrist:\t\t\tNavn:\t\t\tTlf:\t\t\tBeløp:");
		for(int i = 0; i < getBud().size(); i++){
			System.out.println(getBud().get(i).toString());
		}
	}
}
