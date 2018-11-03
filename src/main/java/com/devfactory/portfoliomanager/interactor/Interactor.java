package com.devfactory.portfoliomanager.interactor;

import com.devfactory.portfoliomanager.exception.MyException;
import com.devfactory.portfoliomanager.web.request.Request;
import com.devfactory.portfoliomanager.web.response.Response;

public interface Interactor {
    Response execute(Request request) throws MyException;
}
