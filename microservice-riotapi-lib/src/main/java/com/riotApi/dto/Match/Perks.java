package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;


@Data
public class Perks {
  private StatPerks statPerks;
  private List<Style> styles;

  @JsonProperty("statPerks")
  public StatPerks getStatPerks() { return statPerks; }
  @JsonProperty("statPerks")
  public void setStatPerks(StatPerks value) { this.statPerks = value; }

  @JsonProperty("styles")
  public List<Style> getStyles() { return styles; }
  @JsonProperty("styles")
  public void setStyles(List<Style> value) { this.styles = value; }
}
