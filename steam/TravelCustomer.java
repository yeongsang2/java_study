package steam;

public class TravelCustomer {
    private String name;
    private Integer age;
    private Integer price;

    public TravelCustomer(String name, Integer age, Integer price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "name: " + name + "age: " + age + "price: " + price;
    }
}
