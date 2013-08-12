/*
 * Copyright 2013 Olivier Croisier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.thecodersbreakfast.restangular.server.rest.application;

import com.google.common.base.Optional;
import restx.server.simple.simple.SimpleWebServer;

public class RestangularComponent {

    public static void main(String[] args) throws Exception {
        int port = Integer.valueOf(Optional.fromNullable(System.getenv("PORT")).or("8000"));
        SimpleWebServer simpleWebServer = SimpleWebServer.builder()
                .setPort(port)
                // Needing to set an empty string here, in order to be able to manage both
                // /rest/* resources for "standard" routers, and /web/* for resources router
                // Drawback : having to add a "/rest" prefix on every existing routes, which sounds weird
                // Don't see how to be better here...
                .setRouterPath("")
                .build();
        simpleWebServer.startAndAwait();

        System.out.println("Server started on port 8000.");
        System.out.println("Application is now available on http://localhost:8000/index.html");
    }
}
