public class Sinif {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
   void increaseSpeed(int increment) {
        if((speed += increment) <= 200)
        {
            speed += increment;
        }

    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }

    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}
