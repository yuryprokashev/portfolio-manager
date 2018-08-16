package com.devfactory.capabilityconstructor.web.request;

import java.util.Arrays;

public enum ResourceName {
    COMPANIES("companies"),
    PRODUCTS("products"),
    FEATURES("features"),
    MILESTONES("milestones"),
    RELEASES("releases"),
    CAPABILITIES("capabilities"),
    CAPABILITY("capability"),
    REQUIREMENTS("requirements"),
    REQUIREMENT("requirement");

    private final String name;

    ResourceName(String resourceName) {
        this.name = resourceName;
    }

    public String getName() {
        return this.name;
    }

    public static ResourceName fromValue(String value) {
        for (ResourceName resourceName : values()) {
            if (resourceName.toString().equalsIgnoreCase(value)) {
                return resourceName;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }
}
