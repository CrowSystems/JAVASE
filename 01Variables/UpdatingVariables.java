public class UpdatingVariables {
    public static void main(String ARGS[]) {
        int salary = 1000;
        
        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 descuento.
        salary = salary -  50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //comida $45
        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto.
        String employeName = "Carlos Ivan";
        employeName = employeName + " De Jesus Mendoza";
        System.out.println(employeName);
    }
}
