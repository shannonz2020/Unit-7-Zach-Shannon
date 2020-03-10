public class Boat {
    private String name;
    private boolean hasMotor;
    private int topSpeed;
    private int length;
    private int numPassengers;

    public Boat(String name){
        this.name = name;
        this.hasMotor = false;
        this.topSpeed = 0;
        this.length = 0;
        this.numPassengers = 1;
    }

    public Boat(String name, boolean hasMotor, int topSpeed, int length, int numPassengers){
        this.name = name;
        this.hasMotor = hasMotor;
        this.topSpeed = topSpeed;
        this.length = length;
        this.numPassengers = numPassengers;
    }

    public String move(int nauticalMiles){
        if (hasMotor) {
            return name + " has moved " + nauticalMiles + " nautical miles quickly";
        }else{
            return name + " has moved " + nauticalMiles + " nautical miles slowly";
        }
    }

    public String sink(){
        if(length > 10){
            return name + " sank in " + (length*2 +9)/1.4 + " minutes with " + numPassengers + " passengers aboard";
        }else{
            return name + " sunk instantly with " + numPassengers + " passengers aboard";
        }
    }

    public String toString(){
        return name + ":" + "\nHas motor? " + hasMotor + "\n Top Speed: " + topSpeed + "\nLength: " + length +
                "\n Number of passengers: " + numPassengers;

    }

    public void main(){

    }
}
