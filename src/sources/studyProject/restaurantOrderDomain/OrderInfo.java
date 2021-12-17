package sources.studyProject.restaurantOrderDomain;

/**
 * 주문정보 객체
 * */

class OrderInfo {
    private String menuName;
    private int price;

    public OrderInfo(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }

}
