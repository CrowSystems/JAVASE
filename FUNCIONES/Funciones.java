package FUNCIONES;

public class Funciones {

    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //pi * r2
        System.out.println(circleArea(y));

        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI * r3
        System.out.println(sphereVolumen(y));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    
}
