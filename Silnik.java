class.Silnik

import java.util.Scanner

public class Silnik{
	private String rodzaj_silnika;
	private int numer_serii
	private int liczba_koni
	
	public Silnik(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj rodzaj silnika: ");
		this.rodzaj_silnika = input.next();
		System.out.println("Podaj numer serii: ");
		this.numer_serii = Integer.parseInt(input.next());
		System.out.println("Podaj ilość koni: ");
		this.liczba_koni = Integer.parseInt(input.next());
	}
	
	public String getrodzaj_silnika(){
		return rodzaj_silnika;
	}
	
	public void setrodzaj_silnika(String rodzaj_silnika){
		this.rodzaj_silnika = rodzaj_silnika
	}
	public int getnumer_serii(){
		returm numer_serii;
	}
	public void setnumer_serii(int numer_serii){
		this.numer_serii = numer_serii
	}
	public int getliczba_koni(){
		return liczba_koni
	}
	public void setliczba_koni(int liczba_koni){
		this.liczba_koni = liczba_koni
	}
	public String toString(){
		String tekst = "Rodzaj silnika: " + rodzaj_silnika + " Numer serii: " + numer_serii + " Liczba koni: " + liczba_koni;
		return tekst;
	}
}
		
		

	
		
	
	
	
	

