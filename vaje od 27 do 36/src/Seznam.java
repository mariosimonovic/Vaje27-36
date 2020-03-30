//uvozimo paket swing
import javax.swing.*;
//uvozimo paket za delo z tabelami
import javax.swing.table.*;
//uvozimo paket za delo z dogodki
import java.awt.event.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;


public class Seznam{

	private static  BufferedReader in;
	public static void main(String[] args){
		
		System.out.println("Pozdravljeni uporabnik, ki se želi vpisati na bazen Tivoli! ");
		
		in = new BufferedReader(new InputStreamReader(System.in));
		String vnos = "Napaèen vnos.";
		
		try {
			System.out.print("Porsim vpišite koliko ste stari: ");
			vnos = in.readLine();
			if (vnos() < 18) {
				
				System.out.println("Uporabnik še ni polnoleten! ");
			}
			else {
				
				System.out.println("Uporabnik je polnoleten: ");
			}
		}
		
		
		// èe bi bila sporoèena izjema
		catch(Exception e) {
			System.err.println("Napaka: " + e);
		}
		

		Oseba novVnos = new Oseba(vnos, vnos, 0);
		System.out.println("Vnesli ste " + vnos + ".");
//--------------
	
		
		
		
		
		Oseba moski = new Oseba("marko", "boh", 37);
		Oseba zenska = new Oseba("marija", "radic", 33);
		Oseba otrok = new Oseba("denis", "brtonclj", 17);
		
		
		System.out.println("ime ");
		System.out.println(moski.getIme());
		
		
		System.out.println("priimek ");
		System.out.println(moski.getPriimek());
		
		
		System.out.println("starost " + moski.age());	
		System.out.println(moski.getStarost());
		//------------------------------------------------------zenska
		System.out.println("ime ");
		System.out.println(zenska.getIme());
		
		
		System.out.println("priimek ");
		System.out.println(zenska.getPriimek());
		
		
		System.out.println("starost " + zenska.age());	
		System.out.println(zenska.getStarost());
		//---------------------------------------------------otrok
		System.out.println("ime ");
		System.out.println(otrok.getIme());
		
		
		System.out.println("priimek ");
		System.out.println(otrok.getPriimek());
		
		
		System.out.println("starost " + otrok.age());		
		System.out.println(otrok.getStarost());
		
		
	}//main
	private static int vnos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}//seznam