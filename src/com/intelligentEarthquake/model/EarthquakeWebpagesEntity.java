package com.intelligentEarthquake.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by flylu on 2016/4/10.
 */
@Entity
@Table(name = "earthquake_webpages", schema = "earthquake", catalog = "")
public class EarthquakeWebpagesEntity {
    private int id;
    private String urlHash;
    private String url;
    private String title;
    private String h1;
    private String h2;
    private String topic;
    private String content;
    private String htmlPath;
    private Timestamp crawledTime;
    private String allWords;
    private String denyWords;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "urlHash")
    public String getUrlHash() {
        return urlHash;
    }

    public void setUrlHash(String urlHash) {
        this.urlHash = urlHash;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "h1")
    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    @Basic
    @Column(name = "h2")
    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    @Basic
    @Column(name = "topic")
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "htmlPath")
    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    @Basic
    @Column(name = "crawledTime")
    public Timestamp getCrawledTime() {
        return crawledTime;
    }

    public void setCrawledTime(Timestamp crawledTime) {
        this.crawledTime = crawledTime;
    }

    @Basic
    @Column(name = "allWords")
    public String getAllWords() {
        return allWords;
    }

    public void setAllWords(String allWords) {
        this.allWords = allWords;
    }

    @Basic
    @Column(name = "denyWords")
    public String getDenyWords() {
        return denyWords;
    }

    public void setDenyWords(String denyWords) {
        this.denyWords = denyWords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EarthquakeWebpagesEntity that = (EarthquakeWebpagesEntity) o;

        if (id != that.id) return false;
        if (urlHash != null ? !urlHash.equals(that.urlHash) : that.urlHash != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (h1 != null ? !h1.equals(that.h1) : that.h1 != null) return false;
        if (h2 != null ? !h2.equals(that.h2) : that.h2 != null) return false;
        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (htmlPath != null ? !htmlPath.equals(that.htmlPath) : that.htmlPath != null) return false;
        if (crawledTime != null ? !crawledTime.equals(that.crawledTime) : that.crawledTime != null) return false;
        if (allWords != null ? !allWords.equals(that.allWords) : that.allWords != null) return false;
        if (denyWords != null ? !denyWords.equals(that.denyWords) : that.denyWords != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (urlHash != null ? urlHash.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (h1 != null ? h1.hashCode() : 0);
        result = 31 * result + (h2 != null ? h2.hashCode() : 0);
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (htmlPath != null ? htmlPath.hashCode() : 0);
        result = 31 * result + (crawledTime != null ? crawledTime.hashCode() : 0);
        result = 31 * result + (allWords != null ? allWords.hashCode() : 0);
        result = 31 * result + (denyWords != null ? denyWords.hashCode() : 0);
        return result;
    }
}
