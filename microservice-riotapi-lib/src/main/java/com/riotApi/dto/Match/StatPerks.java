package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StatPerks {
  @JsonProperty("defense")
  private long defense;
  @JsonProperty("flex")
  private long flex;
  @JsonProperty("offense")
  private long offense;
}
