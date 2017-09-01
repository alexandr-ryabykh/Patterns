package creational.builder;

public class Website {
    private String name;
    private Cms cms;
    private int price;

    void setName(String name) {
        this.name = name;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setCms(Cms cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
