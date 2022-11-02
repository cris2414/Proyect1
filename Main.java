import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    mostrarMenu();
    int user = sc.nextInt();
     while (user != 0) {
      if (user== 1) {
        if (Vehiculo.cantidadVehiculos() == 10) {
          System.out.println("Base de datos llena");
        } else {
          int modelo = sc.nextInt();
          String marca = sc.nextLine();
          double valor = sc.nextDouble();
          String color = sc.nextLine();
          Vehiculo ve = new Vehiculo();
        }
      }
      if (user == 2) {
        System.out.println(Vehiculo.toStringVehiculos());
      }
      if (user == 3) {
        System.out.println(Vehiculo.cantidadVehiculos());
      }
      if (user == 4) {
        for (int i = 0; i < Vehiculo.cantidadVehiculos(); i++) {
          if (Vehiculo.vehiculos[i].getColor().equals("verde")) {
            System.out.println(Vehiculo.vehiculos[i].toString());
          }
        }
      }
      if (user == 5) {
        for (int j = 0; j < Vehiculo.cantidadVehiculos(); j++) {
          if (Vehiculo.vehiculos[j].getModelo() > 1999 && Vehiculo.vehiculos[j].getModelo() < 2022) {
            System.out.println(Vehiculo.vehiculos[j].toString());
          }
        }
      }
      if (user == 6) {
        if (Sensor.cantidadSensores() == 8) {
          System.out.println("Base de datos llena");
        } else {
          String tipo = sc.nextLine();
          double valor = sc.nextDouble();
          Sensor sen = new Sensor();
        }
      }
      if (user== 7) {
        System.out.println(Sensor.toStringSensores());
      }
      if (user == 8) {
        System.out.println(Sensor.cantidadSensores());
      }
      if (user == 9) {
        for (int i = 0; i < Sensor.cantidadSensores(); i++) {
          if (Sensor.sensores[i].getTipo().equals("temperatura")) {
            System.out.println(Sensor.sensores[i].toString());
          }
        }
      }
      if (user == 666) {
           System.out.println(Sensor.ordSensores());
      }
    }
  }
  public static void mostrarMenu(){
    
    System.out.println("Ingrese 1 para:");
    
  }
}
