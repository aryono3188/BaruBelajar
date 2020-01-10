package TestLingkaran;


public class Lingkaran {
	
	public double luas;
	public double keliling;
	private double phi = 3.14;
	
	
	public void setLuas(double jarijari) {
		this.luas = (phi * jarijari * jarijari);
	}
	
	public double getLuas() {
		return this.luas;
	}
	
	public void setKeliling(double jarijari) {
		this.keliling =  (2 * phi * jarijari);
	}
	 
	public double getKeliling() {
		return this.keliling;
	}

	/*public static void main(String[] args) {
		
		Lingkaran lingkaran = new Lingkaran ();
	
		lingkaran.setLuas(3);
		lingkaran.setKeliling(3);
		
		System.out.println("Jadi Luas Lingkaran = " + lingkaran.getLuas());
		System.out.println("Jadi Keliling Lingkaran = "+ lingkaran.getKeliling());
	}*/
	

}
