public class Oseba {
	
	private String ime;
	private String priimek;
	private int starost;
	
	public Oseba(String i, String p, int s){
		ime = i;
		priimek = p;
		starost = s;	
	}





	public String getIme(){
		return ime;
	}
	
		public String getPriimek(){
		return priimek;
	}

		
		
	public int age() {
		if(starost > 18) {
			System.out.println("Odrasla oseba");
		}
		else {
			System.out.println("oseba ni se polnoletna");
		}
		return 0;

	}//age

	public int getStarost() {
		if (starost < 18) {
			System.out.println("Vpis zal ni mogoč");		
		}
		else {System.out.println("Lahko se vpišete!");}
		return 0;
	}
		

	
	
}