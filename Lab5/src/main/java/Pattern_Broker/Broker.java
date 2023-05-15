package Pattern_Broker;

public class Broker implements IBroker {
    // Reference to the data provider
    DataProvider dataProvider;

    public Broker(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    // Request data from the provider
    public void requestData(String data) {
        dataProvider.provideData(data);
    }
}