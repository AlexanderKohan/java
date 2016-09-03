package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.taskA.task12_Equipment;

/**
 * Created by Alexander on 9/3/2016.
 */
public class DvdPlayer extends Player implements IEquipment {

    public DvdPlayer(IEquipment iEquipment) {
        super(iEquipment);
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}
