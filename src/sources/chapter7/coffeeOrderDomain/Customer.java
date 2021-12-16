package sources.chapter7.coffeeOrderDomain;

/**
 * 손님 객체
 *
 * */

class Customer {
    // 커피를 주문하다
    public void order(String coffeeName, Menu menu, Barista barista) {
        // 메뉴판과 소통
        // 메뉴판객체 참조가 필요 => 메뉴판객체를 매개변수로 받을 필요 있다.
        MenuItem menuItem = menu.choose(coffeeName);
        // 바리스타와 소통 -> 바리스타객체 참조가 필요 -> 바리스타객체를 매개변수로 받을 필요 있다.
        Coffee coffee = barista.makeCoffee(menuItem);

        if(coffee == null) {
            System.out.println("해당 커피가 없습니다.");
        } else {
            System.out.println("커피 가격 " + coffee.getPrice() + "을 지불하고, " + coffee.getName() + " 커피를 얻었습니다.");
        }
    }

}
