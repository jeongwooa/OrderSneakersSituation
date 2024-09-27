package Mission.OrderSneakersSituation;

public class OrderSneakersSituation
{
    public static void main(String[] args)
    {
        Customer customer = new Customer(100_000, false, "");
        Employee employee = new Employee(10_0000, true, 50_000, "편안");
        DeliveryManager deliveryManager = new DeliveryManager(10_0000, 3, 15_000);
        boolean isTrue; // 매장에 신발재고가 남았는지 18번줄에서 사용

        customer.askShoesInfo(); // 신발에 대한 정보를 물어봄

        employee.explanationShoes(); // 신발의 특징과 가격을 말해줌

        if(customer.paymentAvailability(employee.getNikeSneakersPrice()))// 손님이 신발가격보다 많은 돈을 소유하고 있는가?
        {
            isTrue = employee.checkShoesInStore(); // 재고가 남았는지 boolean 값을 변수에 저장
            if(isTrue)// 직원은 신발재고가 남았는지 확인한다.
            {
                customer.paymentShoes(employee.getNikeSneakersPrice(), isTrue, deliveryManager.getCostForDeliver()); // 신발 가격만큼 지불
                employee.outlineSalesCompleted(); // 현장결제시 실행되는 함수
                customer.customerFeeling(employee.getNikeSneakersFeature()); // 신발을 신은 손님의 기분(매개변수: 신발의 특징)
            }
            else
            {
                employee.askDelivery(); // 배송을 원하는지 직원이 물어봄
                if(customer.getDeliveryPreference()) // 배송을 원하는지 bool 리턴
                {
                    customer.deliveryRequest(); // 배송 요청
                    employee.explanationShoesDelivery(deliveryManager.getDaysForDeliver(), deliveryManager.getCostForDeliver()); // 직원이 배송정보(배송소요일, 배송비)에 대해 설명
                    if (customer.getTotalMoney() >= employee.getNikeSneakersPrice() && customer.getTotalMoney() < (employee.getNikeSneakersPrice() + deliveryManager.getCostForDeliver()))
                    {
                        // if문 해석 : 신발살돈은 있지만, 배송료까지는 없는경우
                        customer.sayExcessiveDeliveryPrice();
                        customer.sayGoodbye();
                    }

                    customer.paymentShoes(employee.getNikeSneakersPrice(), employee.checkShoesInStore(), deliveryManager.getCostForDeliver()); // 신발 구매
                    employee.sayCompletedDelivery(); // 직원의 배송완료 메시지 출력
                    employee.onlineSalesCompleted(); // 배송결제시 출력되는 함수
                    deliveryManager.getDeliveryMoney(); // 배달매니저 배송료 수익
                    customer.customerFeeling(employee.getNikeSneakersFeature()); // 손님: 신발특징, 기분, 잔액 말하고 종료
                }
                else customer.sayGoodbye(); //
            }
        }
        else customer.sayGoodbye(); // 사고싶지 않은 이유가 생기면 상황종료

    }
}
