package com.devfactory.capabilityconstructor.interactor;

import com.devfactory.capabilityconstructor.exception.MyException;
import com.devfactory.capabilityconstructor.gateway.Gateway;
import com.devfactory.capabilityconstructor.gateway.GatewayFactory;
import com.devfactory.capabilityconstructor.model.Model;
import com.devfactory.capabilityconstructor.web.request.Request;
import com.devfactory.capabilityconstructor.web.response.CollectionResponse;
import com.devfactory.capabilityconstructor.web.response.ObjectResponse;
import com.devfactory.capabilityconstructor.web.response.ObjectResponseFactory;
import com.devfactory.capabilityconstructor.web.response.Response;
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
