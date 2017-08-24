public class Homero extends Simpson {

	public Homero(String nombre) {
		super(nombre);
	}

	public void come() {
		System.out.println(this.nombre + "comi� y recuper� energ�a.");
		this.energia = this.energia + ((int) Math.random() * 10) / 2;
		if (this.energia > 10) {
			this.energia = 10;
		}
		System.out.println("Su energ�a es ahora" + this.energia);
	}

	public void bebeCerveza() {
		System.out.println(this.nombre
				+ "tom� cerveza. Su salud y energ�a disminuyeron.");
		this.salud = this.salud - 3;
		if (this.salud < 0) {
			this.salud = 0;
		}
		this.energia = this.energia - 3;
		if (this.energia < 0) {
			this.energia = 0;
		}
		System.out.println("Su salud ahora es " + this.salud + " y su energia "
				+ this.energia);
	}

}
