package tr.edu.medipol.yova;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HesaplamaTest {
	
	
 
	@Test 
public void testCarpHepsi() {
		
    	for(int sayi1=-1000; sayi1<10001; sayi1++) {
    		for(int sayi2=-1000; sayi1<10001; sayi2++) {
    			int gercekSonuc = Hesaplama.carpma(sayi1, sayi2);
    			assertEquals(sayi1*sayi2, gercekSonuc);
    		
    		}
    	}
    	
	}
	
	@Test
	public void testCarp20ve48() {
		int gercekSonuc = Hesaplama.carpma(20, 48);
		assertEquals(960, gercekSonuc);
		
	}
	
	@Test
	public void testCarpNegatif() {
		int gercekSonuc = Hesaplama.carpma(-20, -48);
		assertEquals(960, gercekSonuc);
		
	}


@Test 
public void testBolHepsi1() {
	
	for(int sayi1=-1000; sayi1<10001; sayi1++) {
		for(int sayi2=-1000; sayi1<10001; sayi2++) {
			int gercekSonuc = Hesaplama.bolme(sayi1, sayi2);
			assertEquals(sayi1/sayi2, gercekSonuc);
		
		}
	}
	
}

@Test
public void testBol20ve48() {
	int gercekSonuc = Hesaplama.bolme(60, 30);
	assertEquals(2, gercekSonuc);
	
}

@Test
public void testBolNegatif1() {
	int gercekSonuc = Hesaplama.bolme(-60, -30);
	assertEquals(-2, gercekSonuc);
	
}


@Test 
public void testCikarHepsi1() {
	
	for(int sayi1=-1000; sayi1<10001; sayi1++) {
		for(int sayi2=-1000; sayi1<10001; sayi2++) {
			int gercekSonuc = Hesaplama.cikarma(sayi1, sayi2);
			assertEquals(sayi1-sayi2, gercekSonuc);
		
		}
	}
	
}

@Test
public void testCikar50ve40() {
	int gercekSonuc = Hesaplama.cikarma(50, 40);
	assertEquals(2, gercekSonuc);
	
}

@Test
public void testCikarNegatif1() {
	int gercekSonuc = Hesaplama.carpma(-50, -40);
	assertEquals(-10, gercekSonuc);
	
}


@Test 
public void testUsAlHepsi1() {
	
	for(int sayi1=-1000; sayi1<10001; sayi1++) {
		for(int sayi2=-1000; sayi1<10001; sayi2++) {
			int gercekSonuc = Hesaplama.cikarma(sayi1, sayi2);
			assertEquals(sayi1-sayi2, gercekSonuc);
		
		}
	}
	
}

@Test
public void testUsAl2ve3() {
	int gercekSonuc = Hesaplama.usalma(2, 3);
	assertEquals(8, gercekSonuc);
	
}

@Test
public void testUsAlNegatif() {
	int gercekSonuc = Hesaplama.usalma(-2, -3);
	assertEquals(-8, gercekSonuc);
	
}
}
