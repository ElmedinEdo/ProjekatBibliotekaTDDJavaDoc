package com.biblioteka;

/**
 * This class represents an instance of a Korisnik.
 * 
 * <p>
 * This is a sample paragraph, no real purpose other than to illustrate the
 * usage of the p tag.
 * </p>
 *
 * @author Hanic Elmedin
 * @version 1.0
 * 
 */
public class Korisnik extends BibliotekaTest {

	/** The id. */
	private int id;

	/** The age. */
	private int age;

	/** The name. */
	private String name;

	/** The last name. */
	private String lastName;

	/** The knjiga1. */
	private String knjiga1;

	/** The knjiga2. */
	private String knjiga2;

	/** The knjiga3. */
	private String knjiga3;

	/**
	 * The default constructor.
	 */

	public Korisnik() {

	}

	/**
	 * Constructor for full initialization of the Korisnik object.
	 *
	 * @param id
	 *            - represents the id of the korisnik.
	 * @param age
	 *            - represents the age of the korisnik.
	 * @param name
	 *            - represents the first name of the korisnik.
	 * @param lastName
	 *            - represents the last name of the korisnik.
	 * @param knjiga1
	 *            - represents the knjiga1 of the korisnik.
	 * @param knjiga2
	 *            - represents the knjiga2 of the korisnik.
	 * @param knjiga3
	 *            - represents the knjiga3 of the korisnik.
	 */
	public Korisnik(int id, int age, String name, String lastName,
			String knjiga1, String knjiga2, String knjiga3) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.knjiga1 = knjiga1;
		this.knjiga2 = knjiga2;
		this.knjiga3 = knjiga3;

	}

	/**
	 * Gets the knjiga 1.
	 *
	 * @return the knjiga 1
	 */
	public String getKnjiga1() {
		return knjiga1;
	}

	/**
	 * Sets the knjiga 1.
	 *
	 * @param knjiga1
	 *            the new knjiga 1
	 * @return true, if successful
	 */
	public boolean setKnjiga1(String knjiga1) {
		this.knjiga1 = knjiga1;
		return false;
	}

	/**
	 * Gets the knjiga 2.
	 *
	 * @return the knjiga 2
	 */
	public String getKnjiga2() {
		return knjiga2;
	}

	/**
	 * Sets the knjiga 2.
	 *
	 * @param knjiga2
	 *            the new knjiga 2
	 * @return true, if successful
	 */
	public boolean setKnjiga2(String knjiga2) {
		this.knjiga2 = knjiga2;
		return false;
	}

	/**
	 * Gets the knjiga 3.
	 *
	 * @return the knjiga 3
	 */
	public String getKnjiga3() {
		return knjiga3;
	}

	/**
	 * Sets the knjiga 3.
	 *
	 * @param knjiga3
	 *            the new knjiga 3
	 * @return true, if successful
	 */
	public boolean setKnjiga3(String knjiga3) {
		this.knjiga3 = knjiga3;
		return false;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 * @return true, if successful
	 */
	public boolean setId(int id) {
		this.id = id;
		return false;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age
	 *            the new age
	 * @return true, if successful
	 */
	public boolean setAge(int age) {
		this.age = age;
		return false;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 * @return true, if successful
	 */
	public boolean setName(String name) {
		this.name = name;
		return false;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 * @return true, if successful
	 */
	public boolean setLastName(String lastName) {
		this.lastName = lastName;
		return false;
	}

	/**
	 * Sets the korisnik.
	 *
	 * @param i
	 *            the i
	 * @param j
	 *            the j
	 * @param string
	 *            the string
	 * @param string2
	 *            the string 2
	 * @param string3
	 *            the string 3
	 * @param string4
	 *            the string 4
	 * @param string5
	 *            the string 5
	 * @return true, if successful
	 */
	public boolean setKorisnik(int i, int j, String string, String string2,
			String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return false;
	}

}
