/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
 
* http://www.apache.org/licenses/LICENSE-2.0

* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.directory.scim.compliance.server.tests;

import io.restassured.path.json.JsonPath;
import org.apache.directory.scim.spec.schema.ServiceProviderConfiguration;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ServiceProviderConfigIT extends ScimTestSupport {

  @Test
  public void getToServiceProviderConfig() {
    JsonPath jsonPath = jsonGet("/ServiceProviderConfig");
    assertThat(jsonPath.get("schemas"), hasItem(ServiceProviderConfiguration.SCHEMA_URI));
  }
}