package level0.A_E;
/*
머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

price	result
150,000	142,500
580,000	464,000
 */
public class ClothesS {
    public int solution(int price) {
        return (int) (price >= 500000 ? 0.8 * price : price >= 300000 ? 0.9 * price : price >= 100000 ? 0.95 * price : price);
    }
}
