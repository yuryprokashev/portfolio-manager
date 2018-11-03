package com.devfactory.portfoliomanager.interactor;

import com.devfactory.portfoliomanager.gateway.GatewayFactory;
import com.devfactory.portfoliomanager.web.request.Request;
import com.devfactory.portfoliomanager.web.response.ObjectResponseFactory;
import org.springframework.stereotype.Service;

@Service
public class InteractorFactory {

    private GatewayFactory gatewayFactory;
    private ObjectResponseFactory objectResponseFactory;

    public InteractorFactory(GatewayFactory gatewayFactory, ObjectResponseFactory objectResponseFactory) {
        this.gatewayFactory = gatewayFactory;
        this.objectResponseFactory = objectResponseFactory;
    }

    public Interactor create(Request request) {
        Interactor interactor = null;
        switch (request.getType()) {
            case READ_COLLECTION:
                interactor = new ReadCollectionInteractor(this.gatewayFactory, this.objectResponseFactory);
                break;
        }
        return interactor;
    }
}
