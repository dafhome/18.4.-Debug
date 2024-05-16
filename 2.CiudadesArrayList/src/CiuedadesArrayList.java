import java.util.ArrayList;

public class CiuedadesArrayList {
    public static void main(String[] args) throws Exception {

                ArrayList<String> ciudades = new ArrayList<>();

                ciudades.add("Tokio");
                ciudades.add("Londres");
                ciudades.add("Paris");
                ciudades.add("Washington D.C.");
                ciudades.add("Ottawa");
                ciudades.add("Barcelona");
                ciudades.add("Brasilia");
                ciudades.add("Moscu");
                ciudades.add("Pekin");
                ciudades.add("Nueva Delhi");
                ciudades.add("Berlin");
                ciudades.add("Madrid");
                ciudades.add("Roma");
                ciudades.add("Amsterdam");
                ciudades.add("Buenos Aires");
                ciudades.add("Bogota");
                ciudades.add("Caracas");
                ciudades.add("Seul");
                ciudades.add("Rabat");
                ciudades.add("El Cairo");
                int random = 0;
        for (int i = 0; i<3;i++){
            random = (int) Math.floor(Math.random()*ciudades.size());
            System.out.println(ciudades.get(random));
        }


                



    }
}
