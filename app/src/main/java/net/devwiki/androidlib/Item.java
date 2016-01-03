package net.devwiki.androidlib;

import java.io.Serializable;

/**
 * Item
 * Created by Asia on 2016/1/2 0002.
 */
public class Item implements Serializable{

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
