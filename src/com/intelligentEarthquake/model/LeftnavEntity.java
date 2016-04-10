package com.intelligentEarthquake.model;

import javax.persistence.*;

/**
 * Created by flylu on 2016/4/10.
 */
@Entity
@Table(name = "leftnav", schema = "earthquake", catalog = "")
public class LeftnavEntity {
    private int id;
    private String item;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeftnavEntity that = (LeftnavEntity) o;

        if (id != that.id) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        return result;
    }
}
