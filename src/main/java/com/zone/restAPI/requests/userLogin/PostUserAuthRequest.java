
package com.zone.restAPI.requests.userLogin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.zone.restAPI.utils.RequestBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "agent",
    "password",
    "userId"
})
public class PostUserAuthRequest extends RequestBase {

    @JsonProperty("agent")
    public String agent;
    @JsonProperty("password")
    public String password;
    @JsonProperty("userId")
    public String userId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostUserAuthRequest() {
    }

    /**
     * 
     * @param agent
     * @param password
     * @param userId
     */
    public void setPostUserAuthRequest(String agent, String password, String userId) {
        this.agent = agent;
        this.password = password;
        this.userId = userId;
    }
}
