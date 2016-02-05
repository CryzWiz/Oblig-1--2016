import java.util.ArrayList;


public class Eiendom {
	
	private String adresse;
	private String eiersNavn;
	private double takst;
	private int antKvm;
	private int gnr;
	private int bnr;
	private ArrayList<Bud> budOversikt = new ArrayList<Bud>();
	
	public Eiendom(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr){
		this.adresse = adresse;
		this.eiersNavn = eiersNavn;
		this.takst = takst;
		this.antKvm = antKvm;
		this.gnr = gnr;
		this.bnr = bnr;
	}
	public String getAdresse(){
		return adresse;
	}
	public String geteiersNavn(){
		return eiersNavn;
	}
	public double gettakst(){
		return takst;
	}
	public int getantKvm(){
		return antKvm;
	}
	public int getgnr(){
		return gnr;
	}
	public int getbnr(){
		return bnr;
	}
	public ArrayList<Bud> getBud(){
		return budOversikt;
	}
	public void nyttBud(String navn, float belop, String telefon, int frist){
		budOversikt.add(new Bud(navn, belop, telefon, frist));
	}
	public String getSisteBud(){
		return budOversikt.get(budOversikt.size()-1).toString();
	}
	public void skrivAlleBud(){
		System.out.printf("Bud Gitt for EIENDOM %s, takst = %.2f, gnr = %d, bnr = %d\n",
				adresse, takst, gnr, bnr);
		System.out.println("Bud Gitt:\t\t\tBudfrist:\t\t\tNavn:\t\t\tTlf:\t\t\tBeløp:");
		for(int i = 0; i < budOversikt.size(); i++){
			System.out.println(budOversikt.get(i).toString());
		}
	}
}
