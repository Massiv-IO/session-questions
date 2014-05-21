/*
 * Copyright IBM Corp. 2014
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
package net.bluemix.questions.services;

import org.springframework.cloud.service.BaseServiceInfo;

public class TwilioServiceInfo extends BaseServiceInfo {
  
  private String accountId;
  private String authToken;
  private String url;

  public TwilioServiceInfo(String id, String accountId, String authToken, String url) {
    super(id);
    this.accountId = accountId;
    this.authToken = authToken;
    this.url = url;
  }

  @ServiceProperty
  public String getUrl() {
    return url;
  }

  @ServiceProperty
  public String getAccountId() {
    return accountId;
  }

  @ServiceProperty
  public String getAuthToken() {
    return authToken;
  }
}

