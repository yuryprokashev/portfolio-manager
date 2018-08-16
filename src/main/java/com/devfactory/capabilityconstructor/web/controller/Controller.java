package com.devfactory.capabilityconstructor.web.controller;

import com.devfactory.capabilityconstructor.exception.MyException;
import com.devfactory.capabilityconstructor.interactor.Interactor;
import com.devfactory.capabilityconstructor.interactor.InteractorFactory;
import com.devfactory.capabilityconstructor.web.request.Request;
import com.devfactory.capabilityconstructor.web.response.ExceptionResponseFactory;
import com.devfactory.capabilityconstructor.web.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private InteractorFactory interactorFactory;
    private ExceptionResponseFactory exceptionResponseFactory;

    @Autowired
    public Controller(InteractorFactory interactorFactory, ExceptionResponseFactory exceptionResponseFactory) {
        this.interactorFactory = interactorFactory;
        this.exceptionResponseFactory = exceptionResponseFactory;
    }

    Response handleRequest(Request request) {
        Interactor interactor = interactorFactory.create(request);
        try {
            return interactor.execute(request);
        } catch (MyException exception) {
            return onException(exception);
        }
    }

    Response onException(MyException exception) {
        return exceptionResponseFactory.create(exception);
    }
}
