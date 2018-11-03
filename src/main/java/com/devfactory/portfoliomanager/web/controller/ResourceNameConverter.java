package com.devfactory.portfoliomanager.web.controller;

import com.devfactory.portfoliomanager.web.request.ResourceName;

import java.beans.PropertyEditorSupport;

public class ResourceNameConverter extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(ResourceName.fromValue(text));
    }
}
