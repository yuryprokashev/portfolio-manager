package com.devfactory.portfoliomanager.interactor;

import com.devfactory.portfoliomanager.exception.MyException;
import com.devfactory.portfoliomanager.gateway.Gateway;
import com.devfactory.portfoliomanager.gateway.GatewayFactory;
import com.devfactory.portfoliomanager.model.Model;
import com.devfactory.portfoliomanager.web.request.Request;
import com.devfactory.portfoliomanager.web.response.CollectionResponse;
import com.devfactory.portfoliomanager.web.response.ObjectResponse;
import com.devfactory.portfoliomanager.web.response.ObjectResponseFactory;
import com.devfactory.portfoliomanager.web.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class ReadCollectionInteractor implements Interactor {

    private GatewayFactory gatewayFactory;
    private ObjectResponseFactory objectResponseFactory;

    @Autowired
    public ReadCollectionInteractor(GatewayFactory gatewayFactory, ObjectResponseFactory objectResponseFactory) {
        this.gatewayFactory = gatewayFactory;
        this.objectResponseFactory = objectResponseFactory;
    }

    @Override
    public Response execute(Request request) throws MyException {
        Gateway gateway = this.gatewayFactory.create(request);
        Collection<Model> modelCollection = gateway.read(request.getQuery(), request.getSort());
        Collection<ObjectResponse> objectResponseCollection = this.objectResponseFactory.create(request, modelCollection);
        return new CollectionResponse(objectResponseCollection);
    }
}
