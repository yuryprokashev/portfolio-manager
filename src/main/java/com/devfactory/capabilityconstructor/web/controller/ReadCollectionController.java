package com.devfactory.capabilityconstructor.web.controller;

import com.devfactory.capabilityconstructor.interactor.InteractorFactory;
import com.devfactory.capabilityconstructor.web.request.*;
import com.devfactory.capabilityconstructor.web.response.ExceptionResponseFactory;
import com.devfactory.capabilityconstructor.web.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class ReadCollectionController extends Controller {

    private QueryFactory queryFactory;
    private ReadCollectionRequestFactory collectionRequestFactory;

    @Autowired
    public ReadCollectionController(InteractorFactory interactorFactory,
                                    ExceptionResponseFactory exceptionResponseFactory,
                                    ReadCollectionRequestFactory collectionRequestFactory,
                                    QueryFactory queryFactory) {
        super(interactorFactory, exceptionResponseFactory);
        this.collectionRequestFactory = collectionRequestFactory;
        this.queryFactory = queryFactory;
    }

    @InitBinder
    public void inputPropertiesTransformer(final WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(ResourceName.class, new ResourceNameConverter());
        webDataBinder.registerCustomEditor(RequestParameter.class, new RequestParameterConverter());
        webDataBinder.registerCustomEditor(SortOrder.class, new SortOrderConverter());
        webDataBinder.registerCustomEditor(UUID.class, new UUIDConverter());
    }

//    TODO What I can do here is very interesting thing. I can use custom type instead of Strings for name and parent_id
//    TODO And create converters for each type, which is cute.
//    TODO And Converter may do the validation. Once he is not able to convert String from Query String to the given type, Spring will throw exception and return 400
//    TODO So I may get rid of the Pattern annotations here. Which is kinds cute.
    @RequestMapping(method = RequestMethod.GET,
            value={"/api/{resourceName}", "/api/templates/{resourceName}"})
    public Response listAll(@PathVariable(value = "resourceName") ResourceName resourceName,
                            @RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "parent_id", required = false) UUID parentId,
                            @RequestParam(value = "sort_by", required = false) RequestParameter sortBy,
                            @RequestParam(value = "sort_order", required = false) SortOrder sortOrder) {

        Map<RequestParameter, String> queryMap = new HashMap<>();
        if(name != null) queryMap.put(RequestParameter.NAME, name);
        if(parentId != null) queryMap.put(RequestParameter.PARENT_ID, parentId.toString());
        if(sortBy == null) sortBy = RequestParameter.NAME;
        if(sortOrder == null) sortOrder = SortOrder.ASC;

        Query query = queryFactory.create(queryMap);

        Sort sort = new CollectionSort(sortOrder, sortBy);

        Request request = collectionRequestFactory.create(resourceName, query, sort);
        return handleRequest(request);
    }
}