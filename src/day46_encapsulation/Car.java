package day46_encapsulation;

public class Car {
    //make/model
    //year
    //mileage
        private String model;
    private int year;
    private int mileage;
    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    //getting method for model
    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
        //if same name, can put this. before in order to get it
    }

    public int getYear(){
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}