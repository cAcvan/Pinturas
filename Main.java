import java.util.Scanner;

class Forma{
    private String nombre;

    public Forma(String nombre){ this.nombre=nombre; }

    public double devolverArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

class Esfera extends Forma{
    private double radio;
    private double area;

    public Esfera(int radio){
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double devolverArea() {
        area = 4*Math.PI*Math.pow(radio,2);
        return area;
    }
}

class Rectangulo extends Forma{
    private int alto;
    private int ancho;
    private double area;

    public Rectangulo(int alto, int ancho) {
        super("Rectángulo");
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double devolverArea() {
        area = alto*ancho;
        return area;
    }
}

class Cilindro extends Forma{
    private double radio;
    private double altura;
    private double area;

    public Cilindro(double radio, double altura){
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double devolverArea() {
        area = Math.PI*Math.pow(radio,2)*altura;
        return area;
    }
}

class Pintura{
    private double cobertura;

    public Pintura(double cobertura) { this.cobertura = cobertura; }

    public double calcularPintura(Forma forma){
        return forma.devolverArea()/cobertura;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pintura pintura = new Pintura(250);

        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);

        System.out.println("Ahora aparecerá la cantidad de pintura de formas geométricas (Esfera, rectángulo y cilindro), utilizando su área y su cobertura de pintura :)");
        System.out.println("Esfera: " + pintura.calcularPintura(esfera));
        System.out.println("Rectángulo: "+ pintura.calcularPintura(rectangulo));
        System.out.println("Cilindro: " + pintura.calcularPintura(cilindro));
    }
}
