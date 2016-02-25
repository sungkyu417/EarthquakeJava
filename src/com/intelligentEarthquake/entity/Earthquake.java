package com.intelligentEarthquake.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by FLY on 2016/2/18 0018.
 */
@Entity
public class Earthquake {
    private int id;
    private String title;
    private String info;
    private String content;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "info", nullable = true, insertable = true, updatable = true, length = 255)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "content", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Earthquake that = (Earthquake) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
