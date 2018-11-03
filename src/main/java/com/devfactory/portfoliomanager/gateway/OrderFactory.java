package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.RequestParameter;
import com.devfactory.portfoliomanager.web.request.Sort;
import com.devfactory.portfoliomanager.web.request.SortOrder;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

@Service
public class OrderFactory {
    public OrderFactory(){}
    public Order create(CriteriaBuilder builder, Sort sort, Root<Model> root) {
        Order order = null;
        SortOrder requestedSortOrder = sort.getSortOrder();
        RequestParameter requestedSortProperty = sort.getSortBy();
        String modelFieldName = RequestParameter.getModelFieldName(requestedSortProperty);
        switch (requestedSortOrder) {
            case ASC:
                order = builder.asc(root.get(modelFieldName));
                break;
            case DESC:
                order = builder.desc(root.get(modelFieldName));
                break;
        }
        return order;
    }
}
