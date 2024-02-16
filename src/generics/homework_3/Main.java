package generics.homework_3;

// Luis Martinez
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    MyList<Integer> integers = new MyList<>();
    MyList<String> strings = new MyList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        System.out.print("PART 2\n");
        System.out.print("Please enter a number: \n");
        int number = input.nextInt();
        System.out.print("Please another  number: \n");
        int number2 = input.nextInt();
        System.out.print("Please enter your name: \n");
        String name = input.next();
        input.nextLine();
        System.out.print("Please enter your City: \n");
        String city = input.nextLine();
        main.integers.add(number);
        main.integers.add(number2);
        main.strings.add(name);
        main.strings.add(city);
        System.out.print("First number is " + main.integers.get(0) + "\n");
        System.out.print("Second number is " + main.integers.get(1) + "\n");
        System.out.print("Name is:  " + main.strings.get(0) + "\n");
        System.out.print("City is:  " + main.strings.get(1) + "\n");
    }
}

class MyList<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

}