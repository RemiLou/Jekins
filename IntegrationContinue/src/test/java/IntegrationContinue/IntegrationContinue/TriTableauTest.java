package IntegrationContinue.IntegrationContinue;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TriTableauTest extends TestCase {

	int tab[] = {8,5,6,1,4,7,9,3};
	int tab2[] = {50,82,-1};
	
	@BeforeEach
	protected void setUp() throws Exception {

	}

	@Test
	void trierTest() throws IOException {
		TriTableau.trier(tab);
		int newTab[] = {9,8,7,6,5,4,3,1};
		assertArrayEquals(newTab, tab); 
	}
	
	@Test
	void trier2Test() throws IOException {
		TriTableau.trier(tab2);
		int newTab[] = {82,50,-1};
		assertArrayEquals(newTab, tab2); 
	}
	
	@Test
	void trierCroissantTest() throws IOException {
		TriTableau.triCroissant(tab);
		int newTab[] = {1,3,4,5,6,7,8,9};
		assertArrayEquals(newTab, tab); 
	}
	
	@Test
	void trierCroissant2Test() throws IOException {
		TriTableau.triCroissant(tab2);
		int newTab[] = {-1,50,82};
		assertArrayEquals(newTab, tab2); 
	}
	
	@Test
	void trierDecroissantTest() throws IOException {
		TriTableau.triDecroissant(tab);
		int newTab[] = {9,8,7,6,5,4,3,1};
		assertArrayEquals(newTab, tab); 
	}
	
	@Test
	void trierDecroissant2Test() throws IOException {
		TriTableau.triDecroissant(tab2);
		int newTab[] = {82,50,-1};
		assertArrayEquals(newTab, tab2); 
	}
}
