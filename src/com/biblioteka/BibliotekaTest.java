package com.biblioteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 
 * 
 * The Class BibliotekaTest.
 */

public class BibliotekaTest {

	/**
	 * The main method.
	 *
	 * @param args
	 * 	             the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		try {
			int choice = 0;

			while (choice != 4) {
				choice = menu();
				switch (choice) {
				case 1:
					FileReader file1 = new FileReader("src/file/knjige.txt");
					BufferedReader reader1 = new BufferedReader(file1);
					String text1 = "";
					String line1 = reader1.readLine();
					while (line1 != null) {
						text1 += line1;
						line1 = reader1.readLine();
					}
					System.out.println("..........................");
					System.out.println(text1);
					System.out.println("..........................");
					break;
               
				case 2:
					Korisnik korisnik1 = new Korisnik(1345, 32, "Mike",
							"Johanson", "Tvrdava", "Ostrvo ", "Stepski Vuk");
					System.out.println("\nIme: " + korisnik1.getName()
							+ "\nPrezime: " + korisnik1.getLastName()
							+ "\nGodine: " + korisnik1.getAge() + "\nId: "
							+ korisnik1.getId() + "\nKnjige koje su izdate: "
							+ korisnik1.getKnjiga1() + ", "
							+ korisnik1.getKnjiga2() + "i "
							+ korisnik1.getKnjiga3());
					LocalDate localDate1 = LocalDate.of(2019, 1, 24);
					LocalDate newDate1 = localDate1.plusDays(90);
					System.out
							.println("Knjige su izdate datuma: " + localDate1);
					System.out
							.println("Rok za vracanje knjiga je: " + newDate1);
					break;

				case 3:
					Korisnik korisnik2 = new Korisnik(1252, 20, "Jane",
							"Connor", "Prokleta avlija", "Dundo Maroje ",
							"Post Office ");
					System.out.println("\nIme: " + korisnik2.getName()
							+ "\nPrezime: " + korisnik2.getLastName()
							+ "\nGodine: " + korisnik2.getAge() + "\nId: "
							+ korisnik2.getId() + "\nKnjige koje su izdate: "
							+ korisnik2.getKnjiga1() + ", "
							+ korisnik2.getKnjiga2() + "i "
							+ korisnik2.getKnjiga3());
					LocalDate localDate2 = LocalDate.of(2018, 12, 24);
					LocalDate newDate2 = localDate2.plusDays(90);
					System.out
							.println("Knjige su izdate datuma: " + localDate2);
					System.out
							.println("Rok za vracanje knjiga je: " + newDate2);

					break;

				case 4:
					System.out.println("Exit");
					break;
				}
			}
		} catch (Exception e) {

			System.out.println(">>Unesite odgovarajuci broj - integer!<<");
			System.out.println(">>Pokusajte ponovo.!<<");
			System.out.println(">>Exit<<");
		}
	}

	/**
	 * Menu.
	 *
	 * @return the int
	 */
	public static int menu() {
		Scanner input = new Scanner(System.in);
		try {
			int choice = 0;
			System.out.println("..........................");
			System.out.println("Izaberite jednu od opcija:");
			System.out.println("..........................");

			System.out.println("1.Knjige koje mozete kupiti: ");
			System.out.println("2.Korisnik1: ");
			System.out.println("3.Korisnik2: ");
			System.out.println("4.Izlaz");
			System.out.print("Vas izbor: ");
			choice = input.nextInt();
			return choice;
		} catch (Exception e) {

			System.out.println(">>Unesite odgovarajuci broj - integer!<<");
		}
		return 0;

	}

	public boolean BibliotekaTest(String name, String emptyName,
			String lastName, String emptyLastName, String knjiga1,
			String emptyKnjiga1, String knjiga2, String emptyKnjiga2,
			String knjiga3, String emptyKnjiga3, String id, String emptyId,
			String age, String emptyAge, String greaterThan5Chars) {

		// TODO Auto-generated method stub
		if (name == null || emptyName == null && lastName == null
				|| emptyLastName == null && knjiga1 == null
				|| emptyKnjiga1 == null && knjiga2 == null
				|| emptyKnjiga2 == null && knjiga3 == null
				|| emptyKnjiga3 == null && id == null || emptyId == null
				&& age == null || emptyAge == null) {
			return false;
		}

		else if (name.equals("") || emptyName.equals("") && lastName.equals("")
				|| emptyLastName.equals("") && knjiga1.equals("")
				|| emptyKnjiga1.equals("") && knjiga2.equals("")
				|| emptyKnjiga2.equals("") && knjiga3.equals("")
				|| emptyKnjiga3.equals("") && id.equals("")
				|| emptyId.equals("") && age.equals("") || emptyAge.equals("")) {
			return false;
		} else if (id.length() < 5) {
			return true;
		} else {
			return false;
		}

	}

}
