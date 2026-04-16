public class Exercice6 {
    public static void main(String[] args){
        String chaine = "language Java est oop";
        String versionMajuscule = chaine.toUpperCase();
        if(!chaine.equals(versionMajuscule)){
            System.out.println("Transformation en majuscules: "+ versionMajuscule);
        }else{
            System.out.println("La chaine ne comporte aucune minuscule.");
        }
    }
}
