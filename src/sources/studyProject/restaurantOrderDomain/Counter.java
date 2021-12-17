package sources.studyProject.restaurantOrderDomain;

import java.util.HashMap;
import java.util.Map;

/**
 * 카운터 객체
 * : 점원이 고객의 주문을 받으면 카운터에서 주문등록을 하고 주문정보를 뽑는다,
 *   카운터에서 주문등록이 이뤄지면 셰프의 주방에 주문정보가 전달된다.
 * */

class Counter {

    public Map<String, Object> registerOrder(MenuItem menuItem) {
        Map<String, Object> map = new HashMap<>();
        Chef chef = new Chef();

        OrderInfo orderInfo = new OrderInfo(menuItem.getName(), menuItem.getPrice());
        Meal meal = chef.makeMeal(orderInfo);

        map.put("orderInfo", orderInfo);
        map.put("meal", meal);
        return map;
    }
}
