package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		
		int sonuc = topla(20, 48);
		System.out.println(sonuc);
	}

	public static int topla(int sayi1, int sayi2) {
		
		return sayi1 + sayi2;
		
	}

	public static int carpma(int sayi1, int sayi2) {
		
		return sayi1 * sayi2;
  }
	
public static int bolme(int sayi1, int sayi2) {
		
		return sayi1 / sayi2;

  }

public static int cikarma(int sayi1, int sayi2) {
	
	return sayi1 - sayi2;
}

static int usalma(int sayi1, int sayi2) {
    int sonuc =(int) Math.pow(sayi1, sayi2);
    return sonuc;
}