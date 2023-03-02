package designpatterns.factoryMethod.tableExample;

public class Client {
    public static void main(String[] args) {
        //Table kitchenTable = new KitchenTable("kitchen table");
        TableFactory tableFactory = new TableFactory();
        Table table = tableFactory.createTable("kitchen");
        System.out.println(table instanceof KitchenTable);
    }
}
