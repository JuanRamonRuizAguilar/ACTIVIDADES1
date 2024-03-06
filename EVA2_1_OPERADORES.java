/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author rubra
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2; 
    num1 = 5;
    num2 = 3;
    int suma = num1 + num2; //operador de suma +
    //si en el operador + uno de los terminos es
    //una cadena, todo se convierte a cadena y se unen 
    //concatenacion:union de cadenas de texto
    System.out.println("el valor de prueba es " + suma);
    boolean prueba = true;
    System.out.println("el valor de preuba es " + prueba);
    int divi = 7 / 2;
    System.out.println("divicion es: ");
    //ACUMULADORES
    //SUMA +=, RESTA -=, MULTI *=; DIVI /=
    int sumatoria = 0;
    /*sumatoria = sumatoria + 90;
    sumatoria = sumatoria + 80;
    sumatoria = sumatoria + 80;*/
    sumatoria += 90;
    sumatoria += 80;
    sumatoria += 80;
    System.out.println("la sumatoria es " + sumatoria);
    sumatoria -= 70;//le resto 70 a sumatoria 
    //sumatoria = sumatroia -70;
    System.out.println("La sumatoria es " + sumatoria);
    //
    int multiAcum = 1;
    multiAcum *= 100;
    System.out.println("multiAcum = " + multiAcum);
    multiAcum *= 5;
    System.out.println("multiAcum = " + multiAcum);
    }
    
}
