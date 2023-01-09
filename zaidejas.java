package zaidejas;

public class zaidejas {
	private String vardas;
	private int hitpoints;
	private int maxHitpoints;
	private boolean statusas;
	
	// konstruktorius
	public zaidejas() {
		this.vardas = "";
		this.hitpoints = 0;
		this.maxHitpoints = 0;
		this.statusas = true;

	}
	
	  public zaidejas(String vardas, int hitpoints, int maxHitpoints) {
		    this.vardas = vardas;
		    this.hitpoints = hitpoints;
		    this.maxHitpoints = maxHitpoints;
		    this.statusas = true;
		    
	
		  }

		  // metodai
		  public void setVardas(String vardas) {
		    this.vardas = vardas;
		  }
		  

		  public void gydyti(int hitpoints) {
		    this.hitpoints += hitpoints;
		    if (this.hitpoints > this.maxHitpoints) {
		      this.hitpoints = this.maxHitpoints;
		    }
		  }

		  public void zala(int hitpoints) {
		    this.hitpoints -= hitpoints;
		    if (this.hitpoints <= 0) {
		      this.statusas = false;
		    }
		  }

		  public void atgaivinti() {
		    if (!this.statusas) {
		      this.statusas = true;
		      this.hitpoints = this.maxHitpoints / 4;
		    }
		  }

		  public String getVardas() {
		    return this.vardas;
		  }

		  public int getHitpoints() {
		    return this.hitpoints;
		  }

		  public int getMaxHitpoints() {
		    return this.maxHitpoints;
		  }

		  public boolean koksStatusas() {
		    return this.statusas;
		  }
		}
	
