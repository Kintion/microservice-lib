package com.riotApi.dto.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@lombok.Data
public class Info {

//  @JsonProperty("endOfGameResult")
//  private String endOfGameResult;

//  @JsonProperty("gameCreation")
//  private long gameCreation;

  @JsonProperty("gameDuration")
  private long gameDuration;

  @JsonProperty("gameEndTimestamp")
  private long gameEndTimestamp;

//  @JsonProperty("gameId")
//  private long gameID;
//
//  @JsonProperty("gameMode")
//  private String gameMode;
//
//  @JsonProperty("gameName")
//  private String gameName;
//
//  @JsonProperty("gameStartTimestamp")
//  private long gameStartTimestamp;
//
//  @JsonProperty("gameType")
//  private String gameType;

  @JsonProperty("gameVersion")
  private String gameVersion;

//  @JsonProperty("mapId")
//  private long mapID;

  @JsonProperty("participants")
  private List<Participant> participants;

  @JsonProperty("platformId")
  private String platformID;

  @JsonProperty("queueId")
  private long queueID;

  @JsonProperty("teams")
  private List<Team> teams;

//  @JsonProperty("tournamentCode")
//  private String tournamentCode;
}