package jan;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args)
    {
        StockItem temp = new StockItem("bread", 0.8, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.1, 8);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.75, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 24.1, 21);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.6, 10);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.55, 7);
        stockList.addStock(temp);

        temp = new StockItem("cupboard", 21.0, 12);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("phone", 99.99, 80);
        stockList.addStock(temp);

        temp = new StockItem("window", 120.99, 12);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet())
        {
            System.out.println(s);
        }

        Basket basket = new Basket("Jan");

        sellItem(basket,"car", 1);
        System.out.println(basket);

        sellItem(basket,"car",1);
        System.out.println(basket);

        if(sellItem(basket,"car", 12) != 1)
        {
            System.out.println("There are no more car in stock!");
        }

        sellItem(basket, "cos", 5);
//        System.out.println(basket);

        sellItem(basket,"juice", 4);
        sellItem(basket,"cup", 12);
        sellItem(basket, "bread", 1);

//        System.out.println(basket);
//        System.out.println(stockList);

        Basket basket2 = new Basket("customer");
        sellItem(basket2, "cup",100);
        sellItem(basket2, "juice", 5);
        removeItem(basket2, "cup", 1);
        System.out.println(basket2);

        removeItem(basket,"car",1);
        removeItem(basket, "cup", 9);
        removeItem(basket, "car", 1);
        System.out.println("cars removed: " + removeItem(basket,"car",1)); // should not remove any

        System.out.println(basket);

        // remove all items
        removeItem(basket, "bread",1);
        removeItem(basket, "cup",3);
        removeItem(basket, "juice",4);
        removeItem(basket, "cup",3);
        System.out.println(basket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket2);
        System.out.println(stockList);
        chechOut(basket2);
        System.out.println(basket2);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);


        StockItem car = stockList.Items().get("car");

        if(car != null)
        {
            car.adjustStock(2000);
        }

        if(car != null)
        {
            stockList.get("car").adjustStock(-1000);
        }

        System.out.println(stockList);

//        for(Map.Entry<String,Double> price: stockList.priceList().entrySet())
//        {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        chechOut(basket);
        System.out.println(basket);
    }

    public static int sellItem(Basket basket, String item, int quantity)
    {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null)
        {
            System.out.println("We dont sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0)
        {
            return basket.addToBusket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity)
    {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null)
        {
            System.out.println("We dont sell " + item);
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity)
        {
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void chechOut(Basket basket)
    {
        for(Map.Entry<StockItem,Integer> item : basket.Items().entrySet())
        {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }

        basket.clearBasket();
    }
}
