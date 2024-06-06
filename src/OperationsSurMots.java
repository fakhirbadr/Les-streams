import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperationsSurMots {
    public static void main(String[] args) {
        // Liste de mots
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript", "Scala", "Ruby", "C#", "Go");

        // Filtrer les mots qui contiennent la lettre "a"
        List<String> motsAvecA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots contenant la lettre 'a' : " + motsAvecA);

        // Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse
        List<String> motsInverse = mots.stream()
                .filter(mot -> mot.length() > 3)
                .map(mot -> new StringBuilder(mot).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Mots inversés de plus de 3 caractères : " + motsInverse);

        // Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères
        List<Character> caracteresContenantE = mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Caractères contenant la lettre 'e' : " + caracteresContenantE);

        // Transformer chaque chaîne en sa version en majuscules
        List<String> motsEnMajuscules = mots.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mots en majuscules : " + motsEnMajuscules);

        // Convertir chaque chaîne en sa longueur
        List<Integer> longueurs = mots.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Longueurs des mots : " + longueurs);

        // Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères
        List<Character> tousCaracteres = mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Tous les caractères : " + tousCaracteres);

        // À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom - Index"
        List<String> nomsIndex = IntStream.range(0, mots.size())
                .mapToObj(i -> mots.get(i) + " - " + i)
                .collect(Collectors.toList());
        System.out.println("Noms avec index : " + nomsIndex);
    }
}
