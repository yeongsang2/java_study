package steam;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args){
        TravelCustomer customer1 = new TravelCustomer("이순신", 40,100);
        TravelCustomer customer2 = new TravelCustomer("김유신", 20,100);
        TravelCustomer customer3 = new TravelCustomer("홍길동", 13,50);
        List<TravelCustomer> travelCustomerList = new ArrayList<TravelCustomer>();
        travelCustomerList.add(customer1);
        travelCustomerList.add(customer2);
        travelCustomerList.add(customer3);

        System.out.println("고객명단");
        travelCustomerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        System.out.println("총 여행 비용");
        int sum = travelCustomerList.stream().mapToInt(p -> p.getPrice()).sum();
        System.out.println("총 여행 비용" + sum);
        System.out.println("20세 이상 고객 명단");
        travelCustomerList.stream().filter(c-> c.getAge() >= 20).map(c-> c.getName()).sorted().forEach(s->System.out.println(s));
    }
}
