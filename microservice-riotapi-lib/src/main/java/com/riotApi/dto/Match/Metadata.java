package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;


@Data
public class Metadata {

  @JsonProperty("dataVersion")
  private String dataVersion;

  @JsonProperty("matchId")
  private String matchID;

  @JsonProperty("participants")
  private List<String> participants;
}