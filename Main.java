package veterinerler_birligi;

public class Main {
	public static void main(String[] args) {
		ilkNesneleriOlustur();


	}

	private static void ilkNesneleriOlustur() {
		Kedi kedi = new Kedi("01-01-2016", true, "Van Kedisi");
		Kedi kedi2 = new Kedi("01-03-2016", false, "Sakarya Kedisi");
		Kedi kedi3 = new Kedi("01-05-2016", true, "Bursa Kedisi");

		Kopek kopek = new Kopek("02-06-2018", true, 1, "Golden");
		Kopek kopek2 = new Kopek("02-03-2017", false, 0, "Buldog");
		Kopek kopek3 = new Kopek("02-05-2018", true, 3, "Kaniş");

		Musteri m1 = new Musteri("Yunus", "123", "Sakarya");
		m1.musteriyeHayvanEkle(kedi);
		m1.musteriyeHayvanEkle(kopek);

		Musteri m2 = new Musteri("Icardi", "312", "İzmir");
		m2.musteriyeHayvanEkle(kedi2);
		m2.musteriyeHayvanEkle(kopek2);

		Musteri m3 = new Musteri("Lemina", "213", "Ankara");
		m3.musteriyeHayvanEkle(kedi3);
		m3.musteriyeHayvanEkle(kopek3);

		Veteriner v1 = new Veteriner("Ayşe", "456", "BAU", 2);
		v1.musteriEkle(m1);
		v1.musteriEkle(m2);
		Veteriner v2 = new Veteriner("Barış", "123", "BAU", 4);
		v2.musteriEkle(m1);
		v2.musteriEkle(m3);
		Veteriner v3 = new Veteriner("Serkan", "321", "BAU", 6);
		v3.musteriEkle(m3);

		v1.musterileriListele();

		SehirVeterinerlikleri sakarya = new SehirVeterinerlikleri("Sakarya");
		sakarya.sehireVeterinerEkle(v1);
		sakarya.sehireVeterinerEkle(v2);

		SehirVeterinerlikleri istanbul = new SehirVeterinerlikleri("İstanbul");
		istanbul.sehireVeterinerEkle(v3);

		sakarya.sehirdekiToplamVeterinerSayisiniBul();
		istanbul.sehirdekiToplamVeterinerSayisiniBul();
		
		
		System.out.println("Yönetim Paneli");
		YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
		hayvanYonetimPaneli.bilgileriGoster(kedi);
		hayvanYonetimPaneli.bilgileriGoster(kopek);
		
		YonetimPaneli<Musteri> musteriYonetimPaneli=new YonetimPaneli<>();
		musteriYonetimPaneli.bilgileriGoster(m1);
	}
}
