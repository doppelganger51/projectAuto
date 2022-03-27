

import java.util.Scanner;

public class Silnik{
	private String rodzaj_silnika;
	private int numer_serii;
	private int liczba_koni;
	
	public Silnik(String a, int b, int c){
		this.rodzaj_silnika = a;
		this.numer_serii = b;
		this.liczba_koni = c;
	}
	
	public Silnik(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj rodzaj silnika: ");
		this.rodzaj_silnika = input.next();
		System.out.println("Podaj numer serii: ");
		this.numer_serii = Integer.parseInt(input.next());
		System.out.println("Podaj ilość koni: ");
		this.liczba_koni = Integer.parseInt(input.next());
	}
	

	
	public void setrodzaj_silnika(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj rodzaj silnika: ");
		this.rodzaj_silnika = input.next();
	}

	public void setnumer_serii(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj numer serii: ");
		this.numer_serii = numer_serii;
	}

	public void setliczba_koni(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj ilość koni: ");
		this.liczba_koni = liczba_koni;
	}
	public String toString(){
		String tekst = "Rodzaj silnika: " + rodzaj_silnika + " Numer serii: " + numer_serii + " Liczba koni: " + liczba_koni;
		return tekst;
	}
}
		
		

	
		
	
	
	
	

