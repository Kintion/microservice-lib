package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;

public enum Description {
  PRIMARY_STYLE, SUB_STYLE;

  @JsonValue
  public String toValue() {
    switch (this) {
      case PRIMARY_STYLE: return "primaryStyle";
      case SUB_STYLE: return "subStyle";
    }
    return null;
  }

  @JsonCreator
  public static Description forValue(String value) throws IOException {
    if (value.equals("primaryStyle")) return PRIMARY_STYLE;
    if (value.equals("subStyle")) return SUB_STYLE;
    throw new IOException("Cannot deserialize Description");
  }
}
