package Mission.OrderSneakersSituation;

public class Employee
{
    private int totalMoney;
    private boolean havingNikeSneakersInStore; // 매장 Nike sneakers 재고 여부
    private final int nikeSneakersPrice; // 신발값
    private String nikeSneakersFeature; // 안정감 | 편안함 | 가벼움 등 신발 특징


    void explanationShoes() // 신발에 대한 설명
    {
        System.out.println("직원: 이신발은 " + nikeSneakersFeature + "하고 가격은 " + nikeSneakersPrice + "원 입니다.");

    }

    void explanationShoesDelivery(int daysForDelivery, int costForDelivery) // 배송소요일, 배송금액 설명
    {
        System.out.println("직원: 고객님 배송은 " + daysForDelivery + "일 걸릴 예정이고, 배송금액은 " + costForDelivery + "원 입니다.");
    }

    void sayCompletedDelivery() // 배송완료 메시지 출력
    {
        System.out.println("직원: sneaker 배송 완료되었습니다.");
    }

    boolean checkShoesInStore() // 신발이 매장에 있는지 확인
    {
        if(havingNikeSneakersInStore)
        {
            System.out.println("직원: 현재 신발재고가 남아있으며, 결제금액은 " + nikeSneakersPrice + "원 입니다.");
            return true;
        }
        else return false;
    }


    void outlineSalesCompleted()// 현장결제시 실행되는 함수
    {
        totalMoney += nikeSneakersPrice;
        System.out.println("직원: 여기 구매하신 신발 드리겠습니다.");
    }

    void onlineSalesCompleted()// 배송결제시 실행되는 함수
    {
        System.out.println("고객님 배송비 결제 도와드리겠습니다. 15000원입니다.");
    }

    void askDelivery() // 현장에 재고가 없어서 배송을 원하는지 손님에게 물어봄
    {
        System.out.println("직원: 현재 매장에 재고가 없습니다. 배송을 원하시나요?");
    }








    int getNikeSneakersPrice() // 신발가격 반환
    {
        return nikeSneakersPrice;
    }

    String getNikeSneakersFeature() // 신발특징 반환
    {
       return nikeSneakersFeature;
    }







    Employee(int totalMoney, boolean havingNikeSneakersInStore, int nikeSneakersPrice, String nikeSneakersFeature)
    {
        this.totalMoney = totalMoney;
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
        this.nikeSneakersPrice = nikeSneakersPrice;
        this.nikeSneakersFeature = nikeSneakersFeature;
    }
}
