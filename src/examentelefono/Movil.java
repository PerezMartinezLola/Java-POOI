package examentelefono;

public class Movil {
	private boolean encendido;
	private int nivelBateria;
	private String modelo;
	private String marca;
	private boolean modoBajoConsumoActivado;
	
	
	public Movil(String marca, String modelo) {
		this.modelo = modelo;
		this.marca = marca;
		encendido = false;//esto no sería necesario
		nivelBateria = 20;
	}

	public void encender () {
		//encendido = encendido ? encendido : true;
		if(encendido) {
		}else {
			encendido = true;
		}
	}
	
	public void apagar () {
		encendido = encendido ? false : encendido;
	}
	
	private Movil consumir(int consumo) {
		if(!encendido) {
			return this;//si no esta encendido no sigo
		}
		nivelBateria = nivelBateria <= consumo ? 0 : nivelBateria - consumo;
		modoBajoConsumoActivado = nivelBateria < 10;
		
		if(nivelBateria <= 2) encendido = false;
		return this;
	}
	
	public Movil llamar() {
		return consumir(2);
	}
	
	public Movil navegar() {
		return consumir(1);
	}
	
	//consultar modo bajo consumo
	public boolean mostrarBajoConsumo() {
		System.out.printf("Modo bajo consumo:%s%n",
				modoBajoConsumoActivado ? "Activado": "Desactivado");
		return modoBajoConsumoActivado;
	}
	
	public void recargarBateria () {
		nivelBateria = nivelBateria + 25 > 100 ? 100 : nivelBateria + 25;
	}
	
	@Override
	public String toString() {
		return "Movil [ON=" + encendido + ", Bateria=" + nivelBateria + ", mod=" + modelo + ", marca="
				+ marca + ", bajoConsumoActivado=" + modoBajoConsumoActivado + "]";
	}

	public static void main(String[] args) {
		System.out.println("Crear, apagar y encender");
		System.out.printf("=========================%n");
		Movil m1 = new Movil("SAMSUNG", "GALAXY");
		Movil m2 = new Movil("APPLE", "IPHONE16");
		System.out.println("Movil creado");
		System.out.println(m1);
		m1.encender();
		System.out.println("Movil apagado");
		System.out.println(m1);
		m1.apagar();
		System.out.println("Movil encendido\n" + m1);
		
		System.out.printf("%nNavegar y llamar%n");
		System.out.printf("==================%n");
		m1.encender();
		System.out.println("Antes de llamar\n" + m1);
		for (int i = 0; i < 10; i++) {
			m1.llamar();	
		}
		System.out.println("Despues de llamar\n" + m1);
		m1.navegar();
		System.out.println("Despues de navegar\n" + m1);
		
		System.out.printf("%nBateria antes de llamar%n");
		System.out.printf("========================%n");
		System.out.println(m2);
		m2.llamar();
		System.out.printf("%nBateria despues de llamar%n");
		System.out.printf("==========================%n");
		System.out.println(m2);
		
	}
	
}
