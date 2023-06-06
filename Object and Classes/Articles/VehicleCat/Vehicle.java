package ObjectAndClasses_Ex.Articles.VehicleCat;

public class Vehicle {


    //poleta (harakteristiki)
    private String type;
    private String model;
    private String color;
    private int hp;




    //Konstruktor
    public Vehicle(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }


    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        String formattedType = "";
        if(this.type.equals("car")){
            formattedType = "Car";
        }else if (this.type.equals("truck")){
            formattedType = "Truck";
        }
      return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",formattedType, this.model, this.color,
              this.hp);
    }
}
