package net.devwiki.androidlib;

import java.io.Serializable;
import java.util.List;

/**
 * Group
 * Created by Asia on 2016/1/2 0002.
 */
public class Group implements Serializable{

    private int id;

    private String name;

    private List<Item> itemList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
