import java.util.ArrayList;
import java.util.*;

public class Sensor{
  
  public static int tamano = 8;
  public static Sensor[] sensores = new Sensor[tamano];
  public static int posAnadir = 0;
  private String tipo;
  private double valor;

  public Sensor(){
    
  }
  public Sensor(String t, double v){
    this();
    this.tipo = t;
    this.valor = v;
    sensores[posAnadir] = this;
    posAnadir++;
  }
  public String toString(){
    return "El sensor cuenta con las siguentes características; Tipo" + this.tipo + " valor: " + this.valor;
  }
  public static String toStringSensores(){
     String informacion ="";
    for(int i=0; i<posAnadir; i++){
      informacion = informacion + Sensor.sensores[posAnadir].toString() + " ";
    }
    return informacion;
  }
  public static int cantidadSensores(){
    return posAnadir;
  }
  public String getTipo() {
	  return this.tipo;
  }
  public void setTipo(String tipo) {
	  this.tipo = tipo;
  }
  public double getValor() {
	  return this.valor;
  }
  public void setValor(Double valor) {
	  this.valor = valor;
  }
  public static Sensor[] ordSensores() {
    int cantSensTemp = 0;

    for (int i = 0; i < cantidadSensores(); ++i) {
      if (sensores[i].getTipo().equals("temperatura")) {
        cantSensTemp++;
      }
    }

    Sensor[] sensor2 = new Sensor[cantSensTemp];
    int cnt = 0;
    for (int i = 0; i < cantidadSensores(); ++i) {
      if (sensores[i].getTipo().equals("temperatura")) {
        sensor2[cnt] = sensores[i];
        cnt++;
      }
    }

    for (int i = 1; i < sensor2.length; i++) {
      for (int j = 0; j < sensor2.length - 1; j++) {
        if (sensor2[j].getValor() > sensor2[j + 1].getValor()) {
          Sensor temporal = sensor2[j];
          sensor2[j] = sensor2[j + 1];
          sensor2[j + 1] = temporal;
        }
      }
    }
    return sensor2;
  }
}