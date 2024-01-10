package Pattern.builder;

public class test {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.setCarBuilder(new CarBuilder());
        engineer.makeCar("plate1","door1");
    }
}
