
package eva1_5_circulo;


public class EVA1_5_CIRCULO {

  
    public static void main(String[] args) {
    // TODO code application logit here 
        Circulo circul = new Circulo ();
        circul.setRadio(10);
        double area = circul.calcularArea();
        System.out.println("Área: "+ circul.calcularArea());
        System.out.println("Perímetro: "+ circul.calcularPeri());
        
        
        
    }
    
}
