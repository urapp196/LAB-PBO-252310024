import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
        animals.addFirst("Elephant");
        animals.addLast("Lion");
        System.out.println("Updated LinkedList: " + animals);
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removal: " + animals);
        for(String animal : animals) {
            System.out.println(animal);
        }
    }
}
