package com.zone.restAPI.response.userDetails;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalRowCount",
        "data",
        "currentPageNumber",
        "pageSize",
        "numberOfPages"
})
public class GetUserDetailsResponse {

    @JsonProperty("totalRowCount")
    public Integer totalRowCount;
    @JsonProperty("data")
    public List<Datum> data = null;
    @JsonProperty("currentPageNumber")
    public Integer currentPageNumber;
    @JsonProperty("pageSize")
    public Integer pageSize;
    @JsonProperty("numberOfPages")
    public Integer numberOfPages;

    /**
     * No args constructor for use in serialization
     */
    public GetUserDetailsResponse() {
    }

    /**
     * @param data
     * @param numberOfPages
     * @param currentPageNumber
     * @param pageSize
     * @param totalRowCount
     */
    public GetUserDetailsResponse(Integer totalRowCount, List<Datum> data, Integer currentPageNumber, Integer pageSize, Integer numberOfPages) {
        super();
        this.totalRowCount = totalRowCount;
        this.data = data;
        this.currentPageNumber = currentPageNumber;
        this.pageSize = pageSize;
        this.numberOfPages = numberOfPages;
    }
}

