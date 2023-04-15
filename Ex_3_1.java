import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ex_3_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(15);
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(0, 100));
        }
        System.out.println(list);
        for (int i = list.size()-1; i >= 0 ; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}