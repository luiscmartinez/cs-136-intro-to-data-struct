package generics.homework_2;

// Luis Martinez
import java.util.ArrayList;

public class Main {
    MyList<Integer> list = new MyList<>();
    MyList<Double> list2 = new MyList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.list.add(2);
        main.list.add(5);
        main.list.add(-13);
        main.list.add(11);
        main.list.add(12);

        main.list2.add(27.3);
        main.list2.add(5.7);
        main.list2.add(-23.9);
        main.list2.add(11.1);
        main.list2.add(5.12);
        System.out.printf("PART 1%n");
        System.out.println("The Integer largest:\n" + main.list.largest());
        System.out.println("The Integer smallest:\n" + main.list.smallest());
        System.out.println("The Double largest:\n" + main.list2.largest());
        System.out.println("The Double smallest:\n" + main.list2.smallest());
    }
}

class MyList<T extends Number> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T largest() {
        T max = list.get(0);
        for (T element : list) {
            if (element.doubleValue() > max.doubleValue()) {
                max = element;
            }
        }
        return max;
    }

    public T smallest() {
        T min = list.get(0);
        for (T element : list) {
            if (element.doubleValue() < min.doubleValue()) {
                min = element;
            }
        }
        return min;
    }
}