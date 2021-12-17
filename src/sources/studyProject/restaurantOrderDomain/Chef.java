package sources.studyProject.restaurantOrderDomain;

/**
 * 셰프 객체
 * */

class Chef {

    public Meal makeMeal(OrderInfo orderInfo) {        // 지금은 일단 메뉴는 무조건 1개씩만 주문한다고 가정하고 구현
        return new Meal(orderInfo.getMenuName());
    }

}
