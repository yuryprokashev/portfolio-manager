package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.Query;
import com.devfactory.portfoliomanager.web.request.Sort;

import java.util.Collection;

public interface Gateway {
    Collection<Model> read(Query query, Sort sort);
}
