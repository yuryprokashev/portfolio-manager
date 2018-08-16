package com.devfactory.capabilityconstructor.gateway;

import com.devfactory.capabilityconstructor.model.Model;
import com.devfactory.capabilityconstructor.web.request.Query;
import com.devfactory.capabilityconstructor.web.request.Sort;

import java.util.Collection;

public interface Gateway {
    Collection<Model> read(Query query, Sort sort);
}
