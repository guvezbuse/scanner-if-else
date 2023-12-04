package deneme;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		/* kullanıcının girecegi veriyi okumak için tanımlanmış bir sınıftır. Bu sınıfı tanımlamak için
		yandaki uyarıdan import etmek gerekir. input değişken adıdır. */
		
		// Klavyeden girilen ogrenci notu 60 dan büyükse geçti mesajını ekrana yazan java kodu;
		
		int ogrencinotu; //tanımlama adımı
		
		System.out.println("Ogrencinin notunu tamsayi olarak giriniz.");
		
		ogrencinotu = input.nextInt();
		// ogrenci notunu almak için inputtan gelen nextint değerini ata.
		
	
		
		if(ogrencinotu >= 60) { 
			// if koşul ifadesi. koşul doğru olmadığı sürece çalışmaz
			
			System.out.println("Öğrenci Notu:" + ogrencinotu);
			System.out.println("Gecti");
	}
			// if den sonra süslü parantez konulmazsa if komutu sadece arkasındaki bir komutu çalıştırır.
		    // süslü parantez açılarak kod bloğu oluşturulmalıdır.
		    // == != < <= > >= boolean ifadeleridir. karşılaştırma operatörleridir.
		    
		    // else ifadesi if ifadesinden sonra kullanılır. kontrol-koşul içermez.if koşulu değilse else olur.
		
		else {
			System.out.println("Öğrenci Notu:" + ogrencinotu);
			System.out.println("Kaldı");
		}
		
		boolean control = ogrencinotu >= 60;
		System.out.println(control);
		// boolean kontrol işlemidir. true false belirtir.
		

	}

}
