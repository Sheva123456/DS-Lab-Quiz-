

public class Main {
    public static void main(String[] args) {
    newlist l1 = new newlist();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l1.add(5);
    l1.add(6);

    System.out.println(l1.printList());
    System.out.println(l1.findMiddle());
    l1.remove(3);
    l1.reverse();
    System.out.println(l1.printList());
    System.out.println(l1.findMiddle());
    }
}