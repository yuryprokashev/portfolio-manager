package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.Query;
import com.devfactory.portfoliomanager.web.request.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Collection;

@Service
public class CriteriaFactory {
    private final PredicateFactory predicateFactory;
    private final OrderFactory orderFactory;

    @Autowired
    public CriteriaFactory(PredicateFactory predicateFactory, OrderFactory orderFactory){
        this.predicateFactory = predicateFactory;
        this.orderFactory = orderFactory;
    }

    public CriteriaQuery<Model> create(CriteriaBuilder builder, Class<Model> modelClass, Query query, Sort sort) {
        CriteriaQuery<Model> criteriaQuery = builder.createQuery(modelClass);

        Root<Model> root = criteriaQuery.from(modelClass);

        Collection<Predicate> filters = predicateFactory.create(builder, query, root);

        filters.forEach(filter -> criteriaQuery.select(root).where(filter));

        Order order = orderFactory.create(builder, sort, root);
        criteriaQuery.select(root).orderBy(order);

        return criteriaQuery;
    }
}
