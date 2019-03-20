package Exercise3;

public class Car implements Comparable<Car> {
    private  String name;
    private  Integer id;

    public Car() {
    }

    public Car(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Car car) {
        //按id升序
        return this.getId() - car.getId();
    }
}
