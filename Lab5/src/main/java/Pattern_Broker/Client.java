package Pattern_Broker;

public class Client {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Broker broker = new Broker(dataProvider);
        broker.requestData("Hello World!");
    }
}
