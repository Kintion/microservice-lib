package com.riotApi.dto.Match;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Ban {

  @JsonProperty("championId")
  private long championID;

  @JsonProperty("pickTurn")
  private long pickTurn;
}

