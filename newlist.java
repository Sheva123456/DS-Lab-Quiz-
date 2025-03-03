import java.util.Iterator;
import java.util.LinkedList;

public class newlist {
    LinkedList<Integer> LL = new LinkedList<>();

    public void add(int number){
        LL.add(number);
    }

    public void remove(int number){
        Iterator<Integer> it = LL.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current == number){
                it.remove();
                break;
            }
        }
    }

    public int findMiddle() {
        int mid = LL.size() / 2; // Integer division automatically rounds down
        return LL.get(mid);
    }

    public void reverse(){
        LinkedList<Integer> reversed = new LinkedList<>();
        for ( int i = LL.size() - 1; i >= 0; i--){
        reversed.add(LL.get(i));
    }
    LL = reversed;
    }

    public String printList(){
        String printed = "";
        for (int i = 0; i < LL.size(); i++){
            printed += LL.get(i)+ "->";
        }
        return  printed + "null";
    }


}
