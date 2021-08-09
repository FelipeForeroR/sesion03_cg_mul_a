package sesion03_mul_a;

public class Esferica {
    
  private double radio, AnguloE, AnguloF;//Radio de la esfera, Angulo teta, Angulo beta  
 
    //Constructores
    public Esferica(double radio, double AnguloE, double AnguloF){
        this.radio = radio;
        this.AnguloE = AnguloE;
        this.AnguloF = AnguloF;
    }

    public Esferica(){
        
    }
    //Getters y setters
    public double getRadio() {
        return radio;
    }

    public void setR(double r) {
        this.radio = r;
    }

    public double getAnguloE() {
        return AnguloE;
    }

    public void setAnguloE(double anguloE) {
        this.AnguloE = anguloE;
    }

    public double getAnguloF() {
        return AnguloF;
    }

    public void setAnguloF(double AnguloF) {
        this.AnguloF = AnguloF;
    }
    
  
}