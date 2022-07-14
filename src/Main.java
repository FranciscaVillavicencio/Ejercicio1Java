

public class Main {

    // funcion para sumar numeros
    public static void suma(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }

    //funcion sumar puerta 1 puerta a Auto


   public static class Auto {

         int puertas = 4;

      void SumarPuerta(int totalPuertas){
           puertas += totalPuertas;
           System.out.println(puertas);
       }
   }




    public static void main(String[] args) {
        //aqui estoy invocando la función suma dandole parametros
        suma( 5, 10, 15);


        // este seria el objeto creado
        Auto miAuto= new Auto();

        // aqui estoy llamando la función que cree mas arriba
        miAuto.SumarPuerta(+1);



    }


}

