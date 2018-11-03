package com.devfactory.portfoliomanager.web.request;

import java.util.Collection;

public interface Query {
    String get(RequestParameter key);
    boolean has(RequestParameter key);
    Collection<RequestParameter> getKeys();
}
