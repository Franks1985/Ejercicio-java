public class Main {

  public static void main(string[] args) {
    int resultado;
    resultado = suma(10, 20, 15);

    System.out.println(resultado);
  }

  public static int suma(int a, int b, int c) {
  return a + b + c;
}

}

public static void main(String[] args) {
  Coche miCoche = new Coche();
  miCoche.AgregarPuerta();
  System.out.println(miCoche.puertas);
}

class Coche {
  public int puertas = 4;

  public void AgregarPuerta() {
    this.puertas++;
  }
}