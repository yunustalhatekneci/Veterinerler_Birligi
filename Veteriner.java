package veterinerler_birligi;

import java.util.ArrayList;

public class Veteriner extends Kisi {

	private String mezunOlduguOkul;
	private int calismaSuresi;
	private ArrayList<Musteri> veterinerMusterleri;
	private int musteriSayisi;

	public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
		super(isim, tcKimlik);
		this.mezunOlduguOkul = mezunOlduguOkul;
		this.calismaSuresi = calismaSuresi;
		veterinerMusterleri=new ArrayList<>();
		musteriSayisi=0;

	}
	public void musteriEkle(Musteri musteri) {
		veterinerMusterleri.add(musteri);
		musteriSayisi++;
		
	}

	@Override
	void kendiniTanit() {
		System.out.println(toString() + "Ben bir veterinerim");

	}
	public void musterileriListele(){
		for (Musteri m: veterinerMusterleri) {
		m.kendiniTanit();
		}
	}

	@Override
	public String toString() {
		return super.toString()+ "Veteriner [mezunOlduguOkul=" + mezunOlduguOkul + ", calismaSuresi=" + calismaSuresi + "]";
	}

}
