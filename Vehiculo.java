public class Vehiculo{
  
  public static int tamano = 10;
  public static Vehiculo[] vehiculos = new Vehiculo[tamano];
  public static int posAnadir = 0;
  private int modelo;
  private String marca;
  private double valorComercial;
  private String color;

  public Vehiculo(){
    
  }
  public Vehiculo(int mo, String ma, double va){
    this( mo, ma, va, "verde");
  }
  public Vehiculo(int mo, String ma, double va, String co){
    setModelo(mo);
    setMarca(ma);
    setValorComercial(va);
    setColor(co);
  }
  public String toString(){
    
    return "El vehiculo cuenta con las sigueintes características. Modelo: " + this.modelo + 
      "Marca: " + this.marca + "valor comercial: " + this.valorComercial + "Color:" + this.color;
  }
  public static String toStringVehiculos(){
    String informacion ="";
    for(int i=0; i<posAnadir; i++){
      informacion = informacion + Vehiculo.vehiculos[posAnadir].toString() + " ";
    }
    return informacion;
  }
  public static int cantidadVehiculos(){
    vehiculos[posAnadir];
    posAnadir++;
    return posAnadir;
  }
  
  public int getModelo() {
	return modelo;
  }
  public void setModelo(int modelo) {
	  this.modelo = modelo;
  }
  public String getMarca() {
  	return marca;
  }
  public void setMarca(String marca) {
  	this.marca = marca;
  }
  public double getValorComercial() {
  	return valorComercial;
  }
  public void setValorComercial(double valorComercial) {
  	this.valorComercial = valorComercial;
  }
  public String getColor() {
  	return color;
  }
  public void setColor(String color) {
  	this.color = color;
  }
}