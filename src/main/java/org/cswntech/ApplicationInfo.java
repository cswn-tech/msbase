package org.cswntech;

public class ApplicationInfo {
    private final String serviceName;
    private final String applicationName;

    public ApplicationInfo(String serviceName, String applicationName) {
        this.serviceName = serviceName;
        this.applicationName = applicationName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
