package com.riotApi.requestResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class RequestResponseModel<T> implements IRequestResponseModel<T> {

  private T data;

  private String message;

  public RequestResponseModel(T data, String message){
    this.data = data;
    this.message = message;
  }

  @Override
  public T getData() {
    return this.data;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}
