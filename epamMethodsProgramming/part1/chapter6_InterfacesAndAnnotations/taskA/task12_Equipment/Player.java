package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.taskA.task12_Equipment;

/**
 * Created by Alexander on 9/3/2016.
 */
public abstract class Player implements IEquipment{
    public static final int PLAYING_QUANTITY = 10;

    private IEquipment iEquipment;

    public Player(IEquipment iEquipment){
        this.iEquipment = iEquipment;
    }
}
