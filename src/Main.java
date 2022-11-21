import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Рожков О.Л", "+1254367895");
        phoneBook.put("Пирожков О.Л", "+12526458895");
        phoneBook.put("Божков О.П", "+72543636995");
        phoneBook.put("Ложков Ы.Ю", "+12543678995");
        phoneBook.put("Рыжков Т.Ц", "+3584367895");
        phoneBook.put("Пушков Л.В", "+8574367895");
        phoneBook.put("Кружков О.Л", "+781254367895");
        phoneBook.put("Ляжков О.Л", "+35454367895");
        System.out.println(phoneBook.entrySet());

        Product banana = new Product("банан", 150f, 2.1f);
        Product lemon = new Product("лимон", 58.5f, 0.5f);
        Product bread = new Product("хлеб", 45f, 0.7f);
        Product milk = new Product("молоко", 55f, 0.5f);
        Product.addProduct(new Product( "хлеб",2f,2f));
        Product.addProduct(new Product("яйца",2f,0.2f));
        Product.addProduct(new Product("рыба", 125f, 2.1f));

        Product.addProduct(banana);
        Product.addProduct(lemon);
        Product.deleteProduct(lemon);
        Product.markAsBought(banana);
        System.out.println(Product.getProducts());
        System.out.println(banana.getPrice());
        Recipe salat = new Recipe("салат", Product.getProducts(),2);
        Recipe borsch = new Recipe("борщь", Product.getProducts(),3);
        HashMap<Recipe,Integer> recipes = new HashMap<>();
        recipes.put(salat,2);
        recipes.put(borsch,3);
        System.out.println(borsch.calculatePrice());
        System.out.println(salat.calculatePrice());

        Exercise3 exercise = new Exercise3();
        exercise.addMap("str", 1);
        exercise.addMap("str1", 2);
        exercise.addMap("str1",3);
        System.out.println(exercise);

        MapCollection mapCollection = new MapCollection();
        System.out.println(mapCollection.getMapTransformed());

        Map<Integer, String> task2 = new LinkedHashMap<>();
        task2.put(10, "велосипед");
        task2.put(2, "лыжи");
        task2.put(7, "ружье");
        task2.put(15, "удочка");
        task2.put(5, "палатка");
        task2.put(3, "конделябр");
        task2.put(11, "хлеб");
        task2.put(8, "спички");
        task2.put(9, "червяк");
        task2.put(1, "весло");
        System.out.println(task2);
    }
}