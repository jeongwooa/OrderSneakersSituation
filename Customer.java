package Mission.OrderSneakersSituation;

public class Customer
{
    private int totalMoney;
    private boolean isCustomerLikeDelivery; // 고객의 배송 주문 선호 여부
    private String feel; // 고객의 기분


    void askShoesInfo() // 운동화에 대한 정보 요청
    {
        System.out.println("손님: Nike 운동화에 대해 알려주세요");
    }

    boolean paymentAvailability(int NikeSneakersPrice) // 결제가능여부 체크
    {
        return totalMoney >= NikeSneakersPrice;
    }

    void sayGoodbye() // 돈이없을시
    {
        this.feel = "비참";
        System.out.println("손님: 다음에 올게요, 기분이 " + this.feel + "하고 잔액 " + this.totalMoney + "원 남았습니다.");
        System.exit(0);
    }

    void paymentShoes(int NikeSneakersPrice, boolean checkShoesInStore, int costForDelivery) // 신발 결제
    {
        System.out.println("손님: 네 주문할게요.");
        if (checkShoesInStore)
            this.totalMoney -= NikeSneakersPrice;
        else
            this.totalMoney -= (NikeSneakersPrice + costForDelivery);

    }


    void customerFeeling(String NikeSneakersFeature) // 고객의 기분
    {
        this.feel = "행복";
        System.out.println("손님: 신발이 매우 " + NikeSneakersFeature + "하고 기분이 정말 " + this.feel + "해요 " + "잔액은 " + this.totalMoney + "원 남았습니다.");

    }


    void deliveryRequest() // 배달을 원하면 실행되는 대화함수
    {
        System.out.println("직원: 네 당장 배송해주세요");
    }


    void sayExcessiveDeliveryPrice() // 배송료가 너무 비쌀경우
    {
        System.out.println("손님: 배송료가 너무 비싸네요. 신발 환불해주세요");
    }


    boolean getDeliveryPreference() // 손님이 배송을 원하는지에 대한 값 리턴
    {
        return this.isCustomerLikeDelivery;
    }


    int getTotalMoney()
    {
        return this.totalMoney;
    }

    Customer(int totalMoney,  boolean isCustomerLikeDelivery, String feel)
    {
        this.totalMoney = totalMoney;
        this.isCustomerLikeDelivery = isCustomerLikeDelivery;
        this.feel = feel;
    }


}
