package designpatterns.factoryMethod.tableExample;

public class Table {
    private String name;

    Table(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
