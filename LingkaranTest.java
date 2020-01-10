package TestLingkaran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LingkaranTest {
	
	@Test
	void setLuasAngkaBulat() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3;
		lingkaran.setLuas(tes);
		
		double aktual = lingkaran.luas;
		double exspektasi = 28.259999999999998;
		assertEquals(aktual,exspektasi);
	}
	
	@Test
	void getLuasAngkaBulat() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3;
		lingkaran.setLuas(tes);
		
		double aktual = lingkaran.getLuas();
		double exspektasi = 28.259999999999998;
		assertEquals(aktual,exspektasi);
	}
	
	@Test
	void setLuasAngkaBerkoma() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3.5;
		lingkaran.setLuas(tes);
		
		double aktual = lingkaran.luas;
		double exspektasi = 38.465;
		assertEquals(aktual,exspektasi);
	}
	
	@Test
	void getLuasAngkaBerkoma() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3.5;
		lingkaran.setLuas(tes);
		
		double aktual = lingkaran.getLuas();
		double exspektasi = 38.465;
		assertEquals(aktual,exspektasi);
	}
	
	@Test
	void setKelilingBulat() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 2;
		lingkaran.setKeliling(tes);
		
		double aktual = lingkaran.keliling;
		double exspektasi = 12.56;
		assertEquals(aktual,exspektasi);
		
	}
	
	@Test
	void getKelilingBulat() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 2;
		lingkaran.setKeliling(tes);
		
		double aktual = lingkaran.getKeliling();
		double exspektasi = 12.56;
		assertEquals(aktual,exspektasi);
		
	}
	
	@Test
	void setKelilingBerkoma() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3.5;
		lingkaran.setKeliling(tes);
		
		double aktual = lingkaran.keliling;
		double exspektasi = 21.98;
		assertEquals(aktual,exspektasi);
		
	}
	
	@Test
	void getKelilingBerkoma() {
		Lingkaran lingkaran = new Lingkaran();
		double tes = 3.5;
		lingkaran.setKeliling(tes);
		
		double aktual = lingkaran.getKeliling();
		double exspektasi = 21.98;
		assertEquals(aktual,exspektasi);
		
	}
	
	
	
	}
	
	
	


