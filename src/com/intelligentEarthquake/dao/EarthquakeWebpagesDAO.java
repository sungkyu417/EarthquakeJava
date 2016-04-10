package com.intelligentEarthquake.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by flylu on 2016/4/10.
 */
@Repository
public class EarthquakeWebpagesDAO {
    /**
     * 全文查询
     * @return  结果list
     */
    public List webpagesList(){
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        String hql = "from EarthquakeWebpagesEntity";
        Query query = session.createQuery(hql);
        return query.list();
    }

    /**
     * 带where条件过滤查询
     * @param propList  where条件map
     * @return  结果list
     */
    public List webpagesList(HashMap<String, String> propList){
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        String hql = "from EarthquakeWebpagesEntity where ";
        for (Map.Entry<String, String> entry : propList.entrySet()) {
            hql += entry.getKey() + "=" + entry.getValue() + "and ";
        }
        hql.substring(0,hql.lastIndexOf("and "));
        Query query = session.createQuery(hql);
        return query.list();
    }

    /**
     * 带select条件过滤
     * @param columns   select字段list
     * @return
     */
    public List webpagesList(ArrayList<String> columns, HashMap<String, String> propList){
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        String hql = "select ";
        for(String column : columns){
            hql += column+",";
        }
        hql.substring(0,hql.lastIndexOf(","));
        hql += " from EarthquakeWebpagesEntity";
        Query query = session.createQuery(hql);
        return query.list();
    }

    /**
     * 带select,where条件过滤查询
     * @param columns   select字段list
     * @param propList  where条件map
     * @return
     */
    public List webpagesList(ArrayList<String> columns, HashMap<String, String> propList){
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        String hql = "select ";
        for(String column : columns){
            hql += column+",";
        }
        hql.substring(0,hql.lastIndexOf(","));
        hql += " from EarthquakeWebpagesEntity where ";
        for (Map.Entry<String, String> entry : propList.entrySet()) {
            hql += entry.getKey() + "=" + entry.getValue() + "and ";
        }
        hql.substring(0,hql.lastIndexOf("and "));
        Query query = session.createQuery(hql);
        return query.list();
    }

}
