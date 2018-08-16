package com.devfactory.capabilityconstructor.web.controller;

import com.devfactory.capabilityconstructor.web.request.RequestParameter;

import java.beans.PropertyEditorSupport;

public class RequestParameterConverter extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(RequestParameter.fromValue(text));
    }
}
