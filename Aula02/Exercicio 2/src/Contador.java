public class Contador {
    private static int totalObjetos = 0 ;

    Contador(){
        totalObjetos++ ;
    }

    public static void mostrarTotal(){
        System.out.println("Total de objetos : " + totalObjetos);
    }
}
