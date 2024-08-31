import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		// Alperen Yal��n Iban:TR123 456 789 101 112 1314 15 16
		// Alperen kullan�c� ad� : alperen sifre: 1234

		// Ali Uzun Iban:TR165 1314 789 112 131 4756 13 12
		// Ali kullan�c� ad�: ali sifre:456

		/*
		 * Bakiye g�r�nt�leme i�in -->1 Para �ekme i�in -->2 Farkl� hesaba para
		 * g�ndermek i�in -->3 Uygulamadan ��kmak i�in -->4
		 */

		Scanner scanner = new Scanner(System.in);

		double alperenBakiye = 3000;
		String alplerenIban = "TR123 456 789 101 112 1314 15 16";
		String alperenKullaniciAdi = "alperen";
		String alperenSifre = "1234";

		double aliBakiye = 1500;
		String aliIban = "TR165 1314 789 112 131 4756 13 12";
		String aliKullaniciAdi = "ali";
		String aliSifre = "456";

		System.out.println("ATM'ye ho�geldiniz");
		System.out.println("Kullan�c� ad�: ");
		String kullaniciAdi = scanner.nextLine();
		System.out.println("�ifre :");
		String sifre = scanner.nextLine();

		String islemler = "Bakiye g�r�nt�lme i�in->1 Para �ekmek i�in ->2  Farkl� hesaba para g�ndermek i�in ->3  Uygulamadan ��kmak i�in -->4 tu�lay�n�z";

		if (kullaniciAdi.equals("alperen") && sifre.equals("1234")) {
			System.out.println("Alperen Yal��n ho�geldiniz l�tfen yapmak istedi�iniz i�lemi se�in");
			System.out.println(islemler);
			System.out.println("��LEM: ");
 			String secilenIslem = scanner.nextLine();
			switch (secilenIslem) {
			case "1":
				System.out.println(alperenBakiye);
				break;
			case "2":
				System.out.println("l�tfen �ekmek istedi�iniz miktar� giriniz: ");
				int cekilmekIstenenMiktar = scanner.nextInt();
				if (cekilmekIstenenMiktar < alperenBakiye) {
					alperenBakiye -= cekilmekIstenenMiktar;
					System.out.println("hesab�n�zdan para �ekilmi�tir");
				} else {
					System.out.println("bakiyenizden fazla para �ekemezsiniz");
				}
				break;
			case "3":
				System.out.println("l�tfen g�ndermek  istedi�iniz iban adresini giriniz: ");
				String gonderilecekIban = scanner.nextLine();
				System.out.println("g�ndermek istedi�iniz miktar� girin");
				int gonderilecekMiktar = scanner.nextInt();
				if (gonderilecekIban.equals(aliIban)) {
					alperenBakiye -= gonderilecekMiktar;
					aliBakiye += gonderilecekMiktar;
					System.out.println(alperenBakiye);
					System.out.println(aliBakiye);
				} else {
					System.out.println("yanl�� iban");
				}
				break;
			case "4":
				System.out.println("i�leminiz sonland�r�ld�");
				break;
			default:
				System.out.println("l�tfen ge�erli bir i�lem se�iniz");
				break;
			}

		} else if (kullaniciAdi.equals("ali") && sifre.equals("456")) {

		} else {
			System.out.println("Kullan�c� ad� veya �ifre hatal� l�tfen tekrar deneyiniz");
		}

	}
}
