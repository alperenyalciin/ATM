import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		// Alperen Yalçýn Iban:TR123 456 789 101 112 1314 15 16
		// Alperen kullanýcý adý : alperen sifre: 1234

		// Ali Uzun Iban:TR165 1314 789 112 131 4756 13 12
		// Ali kullanýcý adý: ali sifre:456

		/*
		 * Bakiye görüntüleme için -->1 Para çekme için -->2 Farklý hesaba para
		 * göndermek için -->3 Uygulamadan çýkmak için -->4
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

		System.out.println("ATM'ye hoþgeldiniz");
		System.out.println("Kullanýcý adý: ");
		String kullaniciAdi = scanner.nextLine();
		System.out.println("Þifre :");
		String sifre = scanner.nextLine();

		String islemler = "Bakiye görüntülme için->1 Para çekmek için ->2  Farklý hesaba para göndermek için ->3  Uygulamadan çýkmak için -->4 tuþlayýnýz";

		if (kullaniciAdi.equals("alperen") && sifre.equals("1234")) {
			System.out.println("Alperen Yalçýn hoþgeldiniz lütfen yapmak istediðiniz iþlemi seçin");
			System.out.println(islemler);
			System.out.println("ÝÞLEM: ");
 			String secilenIslem = scanner.nextLine();
			switch (secilenIslem) {
			case "1":
				System.out.println(alperenBakiye);
				break;
			case "2":
				System.out.println("lütfen çekmek istediðiniz miktarý giriniz: ");
				int cekilmekIstenenMiktar = scanner.nextInt();
				if (cekilmekIstenenMiktar < alperenBakiye) {
					alperenBakiye -= cekilmekIstenenMiktar;
					System.out.println("hesabýnýzdan para çekilmiþtir");
				} else {
					System.out.println("bakiyenizden fazla para çekemezsiniz");
				}
				break;
			case "3":
				System.out.println("lütfen göndermek  istediðiniz iban adresini giriniz: ");
				String gonderilecekIban = scanner.nextLine();
				System.out.println("göndermek istediðiniz miktarý girin");
				int gonderilecekMiktar = scanner.nextInt();
				if (gonderilecekIban.equals(aliIban)) {
					alperenBakiye -= gonderilecekMiktar;
					aliBakiye += gonderilecekMiktar;
					System.out.println(alperenBakiye);
					System.out.println(aliBakiye);
				} else {
					System.out.println("yanlýþ iban");
				}
				break;
			case "4":
				System.out.println("iþleminiz sonlandýrýldý");
				break;
			default:
				System.out.println("lütfen geçerli bir iþlem seçiniz");
				break;
			}

		} else if (kullaniciAdi.equals("ali") && sifre.equals("456")) {

		} else {
			System.out.println("Kullanýcý adý veya þifre hatalý lütfen tekrar deneyiniz");
		}

	}
}
