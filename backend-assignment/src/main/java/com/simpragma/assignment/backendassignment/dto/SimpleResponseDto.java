package com.simpragma.assignment.backendassignment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.simpragma.assignment.backendassignment.constants.ApplicationConstants;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class SimpleResponseDto {

  @JsonProperty("data")
  private Map<String, Object> data;

  public SimpleResponseDto() {
    data = new HashMap<>();
  }

  public void put(String key, Object value) {
    data.put(key, value);
  }

  public Object get(String key) {
    return data.get(key);
  }

  public Boolean containsKey(String key) {
    return data.containsKey(key);
  }

  public String getResponse() {
    return (String) data.get(ApplicationConstants.RESPONSE.getValue());
  }

  public void setResponse(String responseValue) {
    put(ApplicationConstants.RESPONSE.getValue(), responseValue);
  }
}
