package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.Query;
import com.devfactory.portfoliomanager.web.request.RequestParameter;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Service
public class PredicateFactory {
    public PredicateFactory(){}

    public Collection<Predicate> create(CriteriaBuilder builder, Query query, Root<Model> root) {
        Collection<Predicate> predicateCollection = new ArrayList<>();
        query.getKeys().forEach(key -> {
            String modelFieldNameName = RequestParameter.getModelFieldName(key);
            switch (key) {
                case NAME:
                    predicateCollection.add(builder.like(
                            builder.lower(
                                    root.get(modelFieldNameName))
                            , "%" + query.get(RequestParameter.NAME).toLowerCase() + "%"));
                    break;
                case PARENT_ID:
                    Expression<String> targetUUID = root.get(modelFieldNameName);
                    UUID queryUUID = UUID.fromString(query.get(RequestParameter.PARENT_ID));
                    predicateCollection.add(builder.equal(targetUUID, queryUUID));
                    break;
            }
        });
        return predicateCollection;
    }
}
