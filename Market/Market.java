package Market;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Market implements QueueBehaviour, MarketBehaviour {
    // implementation of QueueBehaviour methods
    List<Customer> customer = new LinkedList<>();
    Queue<Customer> customerQueue = new ArrayDeque<>();
    //public boolean enqueue(Object element);
        // add element to queue



    // implementation of MarketBehaviour methods

    public void addCustomer(Customer customer) {
        // add customer to market queue
        customerQueue.add(customer);
        System.out.println(customer.getName() + " встал(а) в очередь");
    }


    public void removeCustomer() {
        // remove customer from market queue
        System.out.println(customerQueue.peek().getName() + " покинул(а) очередь");
        customerQueue.poll();
    }


    public void acceptOrder() {
        // add order to market orders list
        customerQueue.peek().isTakeOrder();
        System.out.println(customerQueue.peek().getName() + " забрал(а) заказ");
    }


    public void completeOrder() {
        // remove completed order from market orders list
        
        customerQueue.peek().isMakeOrder();
        System.out.println(customerQueue.peek().getName() + " сделал(а) заказ");
    }


    public void update() {
        // update market state based on current orders and customers
    }
}