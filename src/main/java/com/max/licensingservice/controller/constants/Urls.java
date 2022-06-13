package com.max.licensingservice.controller.constants;

public interface Urls {

    String DELIMITER = "/";
    String SERVICE_NAME = "licensing-service";
    String SERVICE_DESCRIPTION = "Microservice - licensing service.";
    String ROOT = Api.NAME + "/" + Api.VERSION + "/" + SERVICE_NAME;

    interface Api {
        String NAME = "api";
        String VERSION = "v1";
    }

    interface Organization {
        String PART = "organization";
        String FULL = ROOT + DELIMITER + PART;

        interface OrganizationId {
            String PART = "{organizationId}";
            String FULL = Organization.FULL + DELIMITER + PART;

            interface License {
                String PART = "license";
                String FULL = OrganizationId.FULL + DELIMITER + PART;

                interface LicenseId {
                    String PART = "{licenseId}";
                    String FULL = License.FULL + DELIMITER + PART;
                }
            }
        }
    }
}
