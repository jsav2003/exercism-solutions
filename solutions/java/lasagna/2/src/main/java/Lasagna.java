public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int expectedMinutesInOvenParameter) {
        return  expectedMinutesInOven() - expectedMinutesInOvenParameter ;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }
    public int totalTimeInMinutes(int numberOfLayers,int numberOfMinutes) {
        return numberOfMinutes + preparationTimeInMinutes(numberOfLayers);
    }
}
