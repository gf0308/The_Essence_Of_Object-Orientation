package sources.chapter7.coffeOrderDomain;

import java.util.ArrayList;
import java.util.List;

public class TestRun {
    public static void main(String[] args) {

        Customer customer = new Customer();
        String coffeeName = "카라멜마끼아또";
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("아메리카노", 4100));
        items.add(new MenuItem("카페라떼", 4500));
        items.add(new MenuItem("카라멜마끼아또", 4800));
        Menu menu = new Menu(items);
        Barista barista = new Barista();

        customer.order(coffeeName, menu, barista);
    }
}
