import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
//Too short (80) Sudoku string:
String ts = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
//Too long (82) Sudoku string:
String tl = "4173698256321589479587243168254371697915864323469127582896435715732916841648752931";
//Includes 'a' string:
String ic = "4173698256321589479587243168254371697915864323469a2758289643571573291684164875293";
//Includes ' ' string:
String iw = "4173698256321589479587243168254371697915864323469 2758289643571573291684164875293";
//Includes "¡™£¢∞§¶•ªº–≠" string:
String iu = "417¡™£¢∞§¶•ªº–≠947958724316825437169791586432346912758289643571573291684164875293";
//Includes negative nums string:
String in = "4173698256321589479587243168254371697915864323-46912758289643571573291684164875293";
//Repeats on rows:
String rr = "417369825632158947958724316825437159791586432346912768289643571573291684164875293";
//Repeats on columns:
String rc = "417369825632158947958724316825437169197586432346912758289643571573291684164875293";
//includes zero:
String iz = "417369825632158947958724316825437009791586432346912758289643571573291684164875293";
//all zeros string:
String az = "000000000000000000000000000000000000000000000000000000000000000000000000000000000";



SudokuVerifier v = new SudokuVerifier();

	@Test //testcase 1
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test //testcase 2
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test //testcase 3
	public void testTooShortString() {
		int a = v.verify(ts);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test //testcase 4
	public void testTooLongString() {
		int a = v.verify(tl);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test //testcase 5
	public void testIncludesCharacterString() {
		int a = v.verify(ic);
		assertEquals("incorrect string", a, 1);
		
	}
	
	@Test //testcase 6
	public void testIncludesWhitespaceString() {
		int a = v.verify(iw);
		assertEquals("incorrect string", a, 1);
		
	}
	
	@Test //testcase 7
	public void testIncludesSpecialunicodeString() {
		int a = v.verify(iu);
		assertEquals("incorrect string", a, 1);
		
	}
	
	@Test //testcase 8
	public void testIncludesNegativeNumsString() {
		int a = v.verify(in);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test //testcase 9
	public void testRepeatsInRowsString() {
		int a = v.verify(rr);
		assertEquals("incorrect string", a, -3);
		
	}
	
	@Test //testcase 10
	public void testRepeatsInColumnsString() {
		int a = v.verify(rc);
		assertEquals("incorrect string", a, -4);
		
	}
	
	@Test //testcase 11
	public void testIncludesZeroString() {
		int a = v.verify(iz);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test //testcase 12
	public void testAllZerosString() {
		int a = v.verify(az);
		assertEquals("incorrect string", a, -1);
		
	}
	
	
	
}
