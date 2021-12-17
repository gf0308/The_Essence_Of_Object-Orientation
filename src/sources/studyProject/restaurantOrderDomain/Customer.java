package sources.studyProject.restaurantOrderDomain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 고객 객체
 * */

class Customer {

    // 식사를 주문하다
    public void order(String mealName, Menu menu, Waiter waiter) throws Exception {
        MenuItem menuItem = menu.choose(mealName);
        if(menuItem == null) {
            System.out.println("=====원하는 메뉴가 없어서, 아쉽지만 나간다=====");
            return;
        }

        Map<String,Object> orderResult = waiter.order(menuItem);
        String mealNm = ((Meal)orderResult.get("meal")).getMealName();
        OrderInfo orderInfo = ((OrderInfo)orderResult.get("orderInfo"));

        String orderInfoArray[] = new String[2];
        orderInfoArray[0] = orderInfo.getMenuName();
        orderInfoArray[1] = String.valueOf(orderInfo.getPrice());
        List<String> list = Arrays.asList(orderInfoArray);

        System.out.println("주문하신 " + mealNm + " 식사 나왔습니다.");
        System.out.println("주문정보 '" + list + "'는 여기있습니다.");
    }

}
