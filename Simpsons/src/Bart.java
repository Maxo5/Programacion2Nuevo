public class Bart extends Simpson implements INi�o {


	
	public Bart(String nombre) {
		super(nombre);
	}

	@Override
	public void juga() {
		if (this.energia >= 3) {
			System.out.println(this.nombre + " jug�.");
			this.energia = this.energia - 3;
		}else{
			System.out.println("Energ�a insuficiente para jugar.");
		}

	}


}
