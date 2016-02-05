
public class Leilighet extends Eiendom{
	private double fellesGjeld;
	private double husleie;
	private int etg;
	
	public Leilighet(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, double fellesGjeld, double husleie, int etg){
		super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
		this.fellesGjeld = fellesGjeld;
		this.husleie = husleie;
		this.etg = etg;
	}
	
	@Override
	public void skrivAlleBud(){
		System.out.printf("Bud Gitt for LEILIGHET: %s, takst: %.0f, gnr:%d, bnr = %d, fellesgjeld: %.2f, husleie: %.2f, etasje: %d\n",
				getAdresse(), gettakst(), getgnr(), getbnr(), fellesGjeld, husleie, etg);
		System.out.println("Bud Gitt:\t\t\tBudfrist:\t\t\tNavn:\t\t\tTlf:\t\t\tBeløp:");
		for(int i = 0; i < getBud().size(); i++){
			System.out.println(getBud().get(i).toString());
		}
	}
}
