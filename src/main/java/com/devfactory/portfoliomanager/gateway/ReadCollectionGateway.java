package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.Query;
import com.devfactory.portfoliomanager.web.request.Sort;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.*;
import java.util.Collection;

public class ReadCollectionGateway implements Gateway {

    private Class<Model> modelClass;
    private SessionFactory sessionFactory;
    private CriteriaFactory criteriaFactory;

    @Autowired
    public ReadCollectionGateway(Class<Model> modelClass,
                                 SessionFactory sessionFactory,
                                 CriteriaFactory criteriaFactory) {
        this.modelClass = modelClass;
        this.sessionFactory = sessionFactory;
        this.criteriaFactory = criteriaFactory;
    }

    @Override
    public Collection<Model> read(Query query, Sort sort) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = sessionFactory.getCriteriaBuilder();

        CriteriaQuery<Model> criteriaQuery = criteriaFactory.create(builder, this.modelClass, query, sort);

        return session.createQuery(criteriaQuery).getResultList();
    }
}