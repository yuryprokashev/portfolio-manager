package com.devfactory.portfoliomanager.web.controller;

import java.beans.PropertyEditorSupport;
import java.util.UUID;

public class UUIDConverter extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(UUID.fromString(text));
    }
}