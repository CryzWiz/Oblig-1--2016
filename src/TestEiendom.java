import java.util.ArrayList;
import java.util.Scanner;

public class TestEiendom {
	public static void main(String[] args){
		ArrayList<Eiendom> tilSalgs = new ArrayList<Eiendom>();
		tilSalgs.add(new Enebolig("Marihandstien 2", "Ole Joan Olsen", 1100000, 204, 23, 400, Enebolig.FRITTSTAAENDE));
		tilSalgs.add(new Leilighet("Nordlandsveien 97B", "H. Svendsen", 2200000, 105, 240, 2, 0, 13000, 2));
		tilSalgs.add(new Eiendom("Skogmoen", "J. Karlsen", 250000, 15000, 5, 0));
		tilSalgs.get(0).nyttBud("Ole Pedersen", 2400000, "90522355", 24);
		tilSalgs.get(0).nyttBud("John McIntosh", 2500000, "90822655", 12);
		tilSalgs.get(1).nyttBud("Karl Johansen", 1850000, "47846759", 168);
		tilSalgs.get(2).nyttBud("Arne McQuinn", 210000, "44573209", 48);
		tilSalgs.get(2).nyttBud("Bård-André Moen", 240000, "75346078", 72);
		tilSalgs.get(2).nyttBud("Arne McQuinn", 2650000, "44573209", 48);
		// DU skal:
		// Opprette en ArrayList som holder rede på de ulike salgsobjektene
		// Lage noen salgsobjekter som legges inn i arraylisten (kan hardkodes som
		//over, trenger ingen brukerdialog)
		// Lage noen bud pr salgsobjekt (kan hardkodes som over, trenger ingen
		//brukerdialog)
		// Deretter:
		// Lage en ENKEL brukerdialog (i løkke) som spør etter gnr og bnr
		// og deretter lister alle bud for dette objektet
		Scanner input = new Scanner(System.in);
		System.out.println("Legg inn gnr: ");
		int gnr = input.nextInt();
		System.out.println("Legg inn bnr: ");
		int bnr = input.nextInt();
		for(int i = 0; i < tilSalgs.size(); i++){
			if(tilSalgs.get(i).getbnr() == bnr && tilSalgs.get(i).getgnr() == gnr)
				tilSalgs.get(i).skrivAlleBud();
		}
		input.close();
	}
}
