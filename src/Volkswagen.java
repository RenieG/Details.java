public class Volkswagen extends Car {


    //provide the appropriate implementation of the toString() method


    @Override
    public String toString() {
        return "| Details of your Volkswagen |\n" + "Model:" + getModel() + "\n" + "Year:" + getYear() + "\n" + "Speed:" + getSpeed() + "km\n";
    }
}

