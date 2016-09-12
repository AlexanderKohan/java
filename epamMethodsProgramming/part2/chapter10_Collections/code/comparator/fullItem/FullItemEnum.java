package epamMethodsProgramming.part2.chapter10_Collections.code.comparator.fullItem;

/**
 * Created by Alexander on 9/12/2016.
 */
public enum FullItemEnum {
    ITEM_ID(true), PRICE(false), NAME(true);
    private boolean ascend;

    private FullItemEnum(boolean ascend) {
        this.ascend = ascend;
    }

    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }

    public boolean getAscend() {
        return ascend;
    }
}
