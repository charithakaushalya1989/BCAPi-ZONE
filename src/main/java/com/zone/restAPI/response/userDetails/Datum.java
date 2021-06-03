package com.zone.restAPI.response.userDetails;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "userId",
        "userCode",
        "userName",
        "firstName",
        "lastName",
        "userGroupList",
        "notificationGroupList",
        "homeLocation",
        "isActive"
})

public class Datum {

    @JsonProperty("userId")
    public Integer userId;
    @JsonProperty("userCode")
    public String userCode;
    @JsonProperty("userName")
    public String userName;
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("userGroupList")
    public List<Object> userGroupList = null;
    @JsonProperty("notificationGroupList")
    public Object notificationGroupList;
    @JsonProperty("homeLocation")
    public String homeLocation;
    @JsonProperty("isActive")
    public Boolean isActive;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param notificationGroupList
     * @param homeLocation
     * @param userGroupList
     * @param userName
     * @param isActive
     * @param userId
     * @param userCode
     */
    public Datum(Integer userId, String userCode, String userName, String firstName, String lastName, List<Object> userGroupList, Object notificationGroupList, String homeLocation, Boolean isActive) {
        super();
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userGroupList = userGroupList;
        this.notificationGroupList = notificationGroupList;
        this.homeLocation = homeLocation;
        this.isActive = isActive;
    }
}
