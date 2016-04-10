package com.intelligentEarthquake.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by flylu on 2016/4/10.
 */
@Repository
public class LeftNavDAO {
    /**
     * 全文查询
     * @return  结果list
     */
    public List leftNavList(){
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        String hql = "from LeftnavEntity";
        Query query = session.createQuery(hql);
        return query.list();
    }
}
