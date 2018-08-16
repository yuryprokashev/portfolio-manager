package com.devfactory.capabilityconstructor.web.controller;

import com.devfactory.capabilityconstructor.web.request.SortOrder;

import java.beans.PropertyEditorSupport;

public class SortOrderConverter extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(SortOrder.fromValue(text));
    }
}