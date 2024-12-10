package com.riotApi.dto.Match;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Baron {

  @JsonProperty("first")
  private boolean first;

  @JsonProperty("kills")
  private long kills;
}
