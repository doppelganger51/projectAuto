import java.util.Scanner;

class program {
	public static void main(String[] args) {
		System.out.println("Co chcesz wyświetlić? (i) - dane auta; (s) - dane silnika; (x) - wyjść z programu");
		System.out.print("Please input choise: ");
		Auto newAuto = new Auto(100, 50, "czerwone");
		Silnik newSilnik = new Silnik();

		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		if (choice.equals("x")) {
			System.out.println("Bye");
		}
		if (choice.equals("i")) {
			System.out.println(newAuto.toString());
		}
		if (choice.equals("s")) {
			System.out.println(newSilnik.toString());
		}
	}
}