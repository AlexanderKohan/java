package epamMethodsProgramming.part2.chapter10_Collections.code.hashMap;

/**
 * Created by Alexander on 9/12/2016.
 */
public enum GASStation {
    DT(50), A80(30), A92(30), A95(50), GAS(40);
    private Integer maxVolume;
    private GASStation (int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public Integer getMaxVolume() {
        return maxVolume;
    }
}
