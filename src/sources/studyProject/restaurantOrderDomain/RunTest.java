package sources.studyProject.restaurantOrderDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * 실행 클래스
 * */

public class RunTest {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer();
        String mealName = "비빔밥";
        Waiter waiter = new Waiter();
        Menu menu = new Menu();

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("스테이크", 30000));
        menuItems.add(new MenuItem("샐러드바", 20000));
        menuItems.add(new MenuItem("와인", 40000));
        menu.setMenuItems(menuItems);

        customer.order(mealName, menu, waiter);
    }

}
