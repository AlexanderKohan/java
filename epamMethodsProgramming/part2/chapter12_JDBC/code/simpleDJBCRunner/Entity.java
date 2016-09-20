package epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner;

import java.io.Serializable;

/**
 * Created by Alexander on 9/19/2016.
 */
public class Entity implements Serializable, Cloneable {

    private int id;

    public Entity(){
    }

    public Entity(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int idphonebook){
        this.id = id;
    }
}
