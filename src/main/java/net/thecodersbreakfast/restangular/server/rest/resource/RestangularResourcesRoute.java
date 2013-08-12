package net.thecodersbreakfast.restangular.server.rest.resource;

import com.google.common.collect.ImmutableMap;
import restx.ResourcesRoute;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

/**
 * @author fcamblor
 */
@Component @RestxResource @PermitAll
public class RestangularResourcesRoute extends ResourcesRoute {
    public RestangularResourcesRoute() {
        super("restangularResources", "web", "static");
    }
}
