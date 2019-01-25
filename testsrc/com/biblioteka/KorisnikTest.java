package com.biblioteka;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 
 * 
 * The Class KorisnikTest.
 */
public class KorisnikTest {

	/** The korisnik. */
	Korisnik korisnik;

	/** The id. */
	int id;

	/** The age. */
	int age;

	/** The name. */
	String name;

	/** The last name. */
	String lastName;

	/** The knjiga 1. */
	String knjiga1;

	/** The knjiga 2. */
	String knjiga2;

	/** The knjiga 3. */
	String knjiga3;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		korisnik = new Korisnik();
		id = 0;
		age = 0;
		name = "";
		lastName = "";
		knjiga1 = "";
		knjiga2 = "";
		knjiga3 = "";
	}

	/**
	 * Should return false when input id.
	 */
	@Test
	public void shouldReturnFalseWhenInputId() {
		boolean result = korisnik.setId(232);
		assertFalse(result);
	}

	/**
	 * Should return false when input age.
	 */
	@Test
	public void shouldReturnFalseWhenInputAge() {
		boolean result = korisnik.setAge(26);
		assertFalse(result);
	}

	/**
	 * Should return false when input name.
	 */
	@Test
	public void shouldReturnFalseWhenInputName() {
		boolean result = korisnik.setName("Jane");
		assertFalse(result);
	}

	/**
	 * Should return false when input last name.
	 */
	@Test
	public void shouldReturnFalseWhenInputLastName() {
		boolean result = korisnik.setLastName("Connor");
		assertFalse(result);
	}

	/**
	 * Should return false when input knjiga 1.
	 */
	@Test
	public void shouldReturnFalseWhenInputKnjiga1() {
		boolean result = korisnik.setKnjiga1("knjiga1");
		assertFalse(result);
	}

	/**
	 * Should return false when input knjiga 2.
	 */
	@Test
	public void shouldReturnFalseWhenInputKnjiga2() {
		boolean result = korisnik.setKnjiga2("knjiga2");
		assertFalse(result);
	}

	/**
	 * Should return false when input knjiga 3.
	 */
	@Test
	public void shouldReturnFalseWhenInputKnjiga3() {
		boolean result = korisnik.setKnjiga3("knjiga3");
		assertFalse(result);
	}

	/**
	 * Should return false when input korisnik.
	 */
	@Test
	public void shouldReturnFalseWhenInputKorisnik() {
		boolean result = korisnik.setKorisnik(232, 26, "Jane", "Connor",
				"Knjiga1", "Knjiga2", "Knjiga3");
		assertFalse(result);
	}
}
