import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> num_num = new ArrayList<>(15);
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            num_num.add(random.nextInt(0, 100));
        }
        System.out.println(num_num);
        System.out.println("Значение минимального числа равно: " + Collections.min(num_num));
        System.out.println("Значение миксимального числа равно: " + Collections.max(num_num));
        double result = 0;
        for (int i = 0; i < num_num.size(); i++) {
            result += num_num.get(i);
        }
        
        
        System.out.println("Значение среднего арифметического равно: " + result / num_num.size());
        
        
        

        
    }
}
