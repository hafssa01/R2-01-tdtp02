public class Exercice4 {
    public static void main(String[] args) {
        String phrase = "Termine par un point-virgule;";
        if(phrase.endsWith(".") || phrase.endsWith(";")) {
            System.out.println("Termine par . ou ;");
        }
    }
}
