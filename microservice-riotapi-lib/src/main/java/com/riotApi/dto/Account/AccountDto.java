package com.riotApi.dto.Account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.riotApi.utils.Dto;
import lombok.Data;

import lombok.Setter;


@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto implements Dto {

  @JsonProperty("puuid")
  private String puuid;

  @JsonProperty("gameName")
  private String gameName;

  @JsonProperty("tagLine")
  private String tagLine;

  public AccountDto(String puuid, String gameName, String tagLine){
    this.puuid = puuid;
    this.gameName = gameName;
    this.tagLine = tagLine;
  }
  public AccountDto(){
  }
  public String getPuuid(){
    return this.puuid;
  }



}
