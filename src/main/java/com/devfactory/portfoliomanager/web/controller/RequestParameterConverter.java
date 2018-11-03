package com.devfactory.portfoliomanager.web.controller;

import com.devfactory.portfoliomanager.web.request.RequestParameter;

import java.beans.PropertyEditorSupport;

public class RequestParameterConverter extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(RequestParameter.fromValue(text));
    }
}
