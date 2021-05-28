package com.zone.restAPI.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zone.restAPI.common.BCApiException;

import java.util.regex.Pattern;

public class HelperUtil
{
     public static String splitString(String text, String symbol)
     {
         String[] parts = text.split(Pattern.quote(symbol));
         return parts[0];
     }

    public static int getArrayIndexFromResponseObject(String response, String arrayName, String key, String valueToMatch) throws BCApiException {
        int index = 0;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response);
            JsonNode dataArray = jsonNode.at(arrayName);

            for (final JsonNode objNode : dataArray) {
                if (objNode.get(key).asText().equals(valueToMatch)) {
                    return index;
                }
                index++;
            }
            throw new BCApiException("Index not found");
        }
        catch (Exception ex)
        {
            throw new BCApiException("Invalid String");
        }

    }
}
