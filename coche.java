public class  coche {

private int numPuertas;
public coche() {
    this.numPuertas = 0;
}

public void incrementarPuertas(){
      this.numPuertas++;
    }
    public int getNumPuertas(){
      return this.numPuertas;
      
    }
   public static void main(String[] args) {
    coche miCoche =new coche();
     miCoche.incrementarPuertas();
     System.out.println(miCoche.getNumPuertas());
  }
  }

