package sources.studyProject.restaurantOrderDomain;

import java.util.HashMap;
import java.util.Map;

/**
 * 웨이터 객체
 * */

class Waiter {

    public Map<String, Object> order(MenuItem menuItem) throws Exception {
        if(menuItem == null) throw new Exception("해당 메뉴는 서비스하지 않고 있습니다.");

        Counter counter = new Counter();        // [Q]. 여기의 counter를 전역의 private Counter로 빼는것이 더 좋을까? 그렇다면 그 이유는 뭘까?
        Map<String, Object> map = counter.registerOrder(menuItem);
        return map;
    }

}
