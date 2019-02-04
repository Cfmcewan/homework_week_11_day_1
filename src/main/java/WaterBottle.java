public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void drinkWater(int amount){
        this.volume -= amount;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void fillBottle(){
        this.volume = 100;
    }
}
