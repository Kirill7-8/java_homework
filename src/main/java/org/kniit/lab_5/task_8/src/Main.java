import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] names = {"книга", "ручка", "линейка", "пинал", "бибки", "чашка","самовар", "слюпа", "черемша", "зеленка", "конфети"};

        ShopItem[] myArray = new ShopItem[100]; 
        for (int i = 0; i < 100; i++){
            
            Random random = new Random();
            int index = random.nextInt(11);
            double price = random.nextInt(1, 10) * 10 + 0.99;
            int count = random.nextInt(1, 100);
            myArray[i] = new ShopItem(names[index], price, count);
        }
        Arrays.sort(myArray, new SortByPricePerItem());
        for (int i = 0; i < 100; i++){
            System.out.println(myArray[i] + "   " + myArray[i].getPricePerItem());
        }
    }
}
