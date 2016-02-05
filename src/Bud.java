import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Bud {
	private GregorianCalendar budFrist;
	private GregorianCalendar budGitt;
	private float belop;
	private String navn;
	private String telefon;
	
	public Bud(String navn, float belop, String telefon, int frist){
		budGitt = new GregorianCalendar();
		this.navn = navn;
		this.belop = belop;
		this.telefon = telefon;
		this.budFrist = new GregorianCalendar();
		budFrist.add(GregorianCalendar.HOUR_OF_DAY, frist);
	}
	public GregorianCalendar getbudGitt(){
		return budGitt;
	}
	public GregorianCalendar getbudFrist(){
		return budFrist;
	}
	public float getbelop(){
		return belop;
	}
	public String gettelefon(){
		return telefon;
	}
	public String getnavn(){
		return navn;
	}
	@Override
	public String toString(){
		SimpleDateFormat format = new SimpleDateFormat("E dd MMM HH:mm:ss zzz yyyy");
		return format.format(budGitt.getTime()) + '\t'
				+ format.format(budFrist.getTime())
				+ '\t'
				+ navn + "\t\t"
				+ telefon + "\t\t"
				+ belop;
	}
	
}
