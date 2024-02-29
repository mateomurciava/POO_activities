public class Ejercicio_N4 {
    public static void main(String[] args) {
        int Edad_juan, Edad_alberto, Edad_ana, Edad_mama;
        Edad_juan = 9;
        Edad_alberto = 2*(Edad_juan/3);
        Edad_ana = 4*Edad_juan/3;
        Edad_mama = Edad_juan + Edad_alberto + Edad_ana;
        System.out.println("Alberto : " + Edad_alberto + " years old.");
        System.out.println("Juan : " + Edad_juan+ " years old.");
        System.out.println("Ana : " + Edad_ana+ " years old.");
        System.out.println("Mamá : " + Edad_mama+ " years old.");
    }
    
}