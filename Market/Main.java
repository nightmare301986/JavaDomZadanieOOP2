/*
Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди,
MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
(принимает и отдаёт заказы)
 */

package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer hm = new Customer();
        System.out.println("Введите имя покупателя");
        Scanner scanner = new Scanner(System.in);
        String buyerName = scanner.nextLine();
        hm.name = buyerName;
        scanner.close();

        Market market = new Market() {
            @Override
            public void setMakeOrder() {

            }

            @Override
            public void setTakeOrder() {

            }

            @Override
            public boolean isMakeOrder() {
                return false;
            }

            @Override
            public boolean isTakeOrder() {
                return false;
            }

            @Override
            public void removeCustomer(Customer customer) {

            }

            @Override
            public void completeOrder(Customer customer) {

            }

            @Override
            public void acceptOrder(Customer customer) {

            }
        };

        market.addCustomer(hm);
     //   market.takeInQueue(hm);
        market.acceptOrder();
        market.completeOrder();
        market.removeCustomer();
       // market.releaseFromMarket(hm);
        market.update();


    } 
}
