import java.util.Scanner;
public class Auto{
		public String kolor_auta;
		public int predkosc_max;
		public int rok_produkcji;
	public Auto(int a,int b,String c) {
		this.predkosc_max = a;
		this.rok_produkcji = b;
		this.kolor_auta = c;
	}
	public Auto() {
        Scanner input = new Scanner(System.in);
			System.out.println("Podaj predkosc maksymalna:");
            this.predkosc_max = input.nextInt();
            System.out.println("Podaj rok produkcji:");
            this.rok_produkcji = input.nextInt();
			System.out.println("Podaj kolor auta:");
			this.kolor_auta = input.next();
	}
	 public String getKolor_auta() {
        return kolor_auta;
    }

    public void setKolor_auta() {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj kolor auta:");
        this.kolor_auta = input.nextInt();
    }

    public int getPredkosc_max() {
        return predkosc_max;
    }

    public void setPredkosc_max() {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj predkosc maksymalna:");
        this.predkosc_max = input.nextInt();
    }
	public int getrok_produkcji() {
        return predkosc_max;
    }

    public void setrok_produkcji() {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj rok produkcji:");
        this.rok_produkcji = input.nextInt();
    }

    public String toString(){
        String tekst=" rok produkcji to:"+rok_produkcji+" predkosc maksymalna to:"+predkosc_max+" a kolor auta to :"+kolor_auta;
        return tekst;
    }
	}
	}