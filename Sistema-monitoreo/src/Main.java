import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int temperaturasSensor[][] = new int [3][3];

        for(int i = 0; i < temperaturasSensor.length; i++){
            System.out.println("Registrar temperaturas de la zona "+ i);
            for (int j = 0; j < temperaturasSensor[i].length; j++){
                System.out.println("Ingrese la temperatura del sensor " + j);
                temperaturasSensor[i][j] = sc.nextInt();
            }
        }
        promedioZona(temperaturasSensor);
        System.out.println("EL promedio general es: "+ promedioGeneral(temperaturasSensor));
        valoresCriticos(temperaturasSensor);
    }

    public static void promedioZona(int temperaturas[][]){
    }

    public static double promedioGeneral(int temperaturas[][]){
        return 0;
    }

    public static void valoresCriticos(int temperaturas[][]){
    }
}