package sources.studyProject.restaurantOrderDomain;

/**
 * 식사 객체
 * */

class Meal {
    private String mealName;        // 식사
    private String requestDetail;   // 요청 세부사항

    public Meal(String menuName) {
        this.mealName = menuName;
    }

    public String getMealName() {
        return mealName;
    }

    public String getRequestDetail() {
        return requestDetail;
    }
}
