
package eva1_5_circulo;

public class Circulo {
    private double radio;
    
    //constructores: solo se usan una vez
        public Circulo (){
              radio = 5;
        }
      
        
    public Circulo (double datoRadio){
        radio = datoRadio;
    }
    //métodos get y set
    public void setRadio (double valor){
        radio = valor;
       
    }
    public double getRadio (){
        return radio;
        
    }
    //calcular área y perímetro
    public double calcularArea(){
       return Math.PI * (radio * radio);
       
    }
    public double calcularPeri (){
        return Math.PI * (radio * 2);
       
    }
    
    
    
    
}
