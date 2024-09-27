package Mission.OrderSneakersSituation;

public class DeliveryManager
{
    private int totalMoney;
    private final int daysForDeliver; // 배송예정 소요일자
    private final int costForDeliver; // 배송료




    void getDeliveryMoney() // 배송료 수익
    {
        totalMoney += costForDeliver;
    }



    int getDaysForDeliver() // 배송소요일 getter
    {
        return daysForDeliver;
    }

    int getCostForDeliver() // 배송료 getter
    {
        return costForDeliver;
    }

    DeliveryManager(int totalMoney, int daysForDeliver, int costForDeliver)
    {
        this.totalMoney = totalMoney;
        this.daysForDeliver = daysForDeliver;
        this.costForDeliver = costForDeliver;
    }




}


