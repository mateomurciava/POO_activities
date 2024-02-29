public class Ejercicio_N12 {
    public static void main(String[] args) {
        double horas_trabajadas , precio_hora , porcentaje_retencion;
        double salario_bruto , retencion , salario_neto;
        horas_trabajadas = 48;
        precio_hora = 5000;
        salario_bruto = precio_hora * horas_trabajadas;
        porcentaje_retencion = (12.5/100);
        retencion = salario_bruto * porcentaje_retencion;
        salario_neto = salario_bruto - retencion;
        System.out.println("Las horas trabajadas son : " + horas_trabajadas);
        System.out.println("El precio por hora trabajada es : " + precio_hora);
        System.out.println("El porcentaje de retencion en la fuente es : " + porcentaje_retencion);
        System.out.println("La retencion en la fuente es : " + retencion);
        System.out.println("El salario bruto es : " + salario_bruto);
        System.out.println("El salario neto es : " + salario_neto);
    }
}

