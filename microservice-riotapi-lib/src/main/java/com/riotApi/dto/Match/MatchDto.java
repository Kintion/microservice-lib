package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.riotApi.utils.Dto;
import lombok.Data;

@Data
public class MatchDto  implements Dto {

//  @JsonProperty("metadata")
//  private Metadata metadata;

  @JsonProperty("info")
  private Info info;

}
