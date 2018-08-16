package com.devfactory.capabilityconstructor.interactor;

import com.devfactory.capabilityconstructor.exception.MyException;
import com.devfactory.capabilityconstructor.web.request.Request;
import com.devfactory.capabilityconstructor.web.response.Response;

public interface Interactor {
    Response execute(Request request) throws MyException;
}
