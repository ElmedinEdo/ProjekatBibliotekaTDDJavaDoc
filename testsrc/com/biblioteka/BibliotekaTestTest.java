package com.biblioteka;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0
 * 
 * 
 *          The Class BibliotekaTestTest.
 */
public class BibliotekaTestTest {

	/** The Biblioteka test. */
	BibliotekaTest BibliotekaTest;

	/** The name. */
	String name;

	/** The empty name. */
	String emptyName;

	/** The last name. */
	String lastName;

	/** The empty last name. */
	String emptyLastName;

	/** The knjiga 3. */
	String knjiga1, knjiga2, knjiga3;

	/** The empty knjiga 3. */
	String emptyKnjiga1, emptyKnjiga2, emptyKnjiga3;

	/** The empty id. */
	String id, emptyId;

	/** The empty age. */
	String age, emptyAge;

	/** The greater than 5 chars. */
	String greaterThan5Chars;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		BibliotekaTest = new BibliotekaTest();
		name = "asd";
		emptyName = "";
		lastName = "asd";
		emptyLastName = "";
		knjiga1 = "";
		knjiga2 = "";
		knjiga3 = "";
		emptyKnjiga1 = "asd";
		emptyKnjiga2 = "asd";
		emptyKnjiga3 = "asd";
		id = "";
		age = "";
		emptyId = "";
		emptyAge = "";
		greaterThan5Chars = "asdasa";
	}

	/**
	 * Should return false when name last name knjiga1 knjiga2 knjiga3 id age
	 * greaterthan5chars is null.
	 */
	@Test
	public void shouldReturnFalseWhenNameLastNameKnjiga1Knjiga2Knjiga3IdAgeGreaterThan5CharsIsNull() {
		boolean result = BibliotekaTest.BibliotekaTest(name, null, lastName,
				null, knjiga1, null, knjiga2, null, knjiga3, null, id, null,
				age, null, greaterThan5Chars);
		assertFalse(result);
	}

	/**
	 * Should return false when empty name last name knjiga1 knjiga2 knjiga3 id
	 * age greaterthan5chars is empty string.
	 */
	@Test
	public void shouldReturnFalseWhenEmptyNameLastNameKnjiga1Knjiga2Knjiga3IdAgeGreaterThan5CharsIsEmptyString() {
		boolean result = BibliotekaTest.BibliotekaTest(emptyName, null,
				emptyLastName, null, emptyKnjiga1, null, emptyKnjiga2, null,
				emptyKnjiga3, null, emptyId, null, emptyAge, null,
				greaterThan5Chars);
		assertFalse(result);

	}

}
