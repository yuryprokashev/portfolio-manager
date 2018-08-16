package com.devfactory.capabilityconstructor.interactor;

import com.devfactory.capabilityconstructor.gateway.GatewayFactory;
import com.devfactory.capabilityconstructor.web.request.Request;
import com.devfactory.capabilityconstructor.web.response.ObjectResponseFactory;
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
