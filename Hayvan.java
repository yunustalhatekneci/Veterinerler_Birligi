package veterinerler_birligi;

abstract public class Hayvan {

	private String dogumTarihi;
	private boolean kayitli;
	
	

	public Hayvan(String dogumTarihi, boolean kayitli) {
		this.dogumTarihi = dogumTarihi;
		this.kayitli = kayitli;
	}

	public boolean isKayitli() {
		return kayitli;
	}

	public void setKayitli(boolean kayitli) {
		this.kayitli = kayitli;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	abstract void bilgileriGoster();
		
	
	@Override
	public String toString() {
		return "Hayvan [dogumTarihi=" + dogumTarihi + ", kayitli=" + kayitli + "]";
	}

}
