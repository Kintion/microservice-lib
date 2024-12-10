package com.riotApi.dto.Match;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;


@Data
public class Challenges {

  @JsonProperty("12AssistStreakCount")
  private long the12AssistStreakCount;

  @JsonProperty("HealFromMapSources")
  private double healFromMapSources;

  @JsonProperty("InfernalScalePickup")
  private long infernalScalePickup;

  @JsonProperty("SWARM_DefeatAatrox")
  private long swarmDefeatAatrox;

  @JsonProperty("SWARM_DefeatBriar")
  private long swarmDefeatBriar;

  @JsonProperty("SWARM_DefeatMiniBosses")
  private long swarmDefeatMiniBosses;

  @JsonProperty("SWARM_EvolveWeapon")
  private long swarmEvolveWeapon;

  @JsonProperty("SWARM_Have3Passives")
  private long swarmHave3Passives;

  @JsonProperty("SWARM_KillEnemy")
  private long swarmKillEnemy;

  @JsonProperty("SWARM_PickupGold")
  private long swarmPickupGold;

  @JsonProperty("SWARM_ReachLevel50")
  private long swarmReachLevel50;
  
  @JsonProperty("SWARM_Survive15Min")
  private long swarmSurvive15Min;

@JsonProperty("SWARM_WinWith5EvolvedWeapons")
  private long swarmWinWith5EvolvedWeapons;

@JsonProperty("abilityUses")
  private long abilityUses;

@JsonProperty("acesBefore15Minutes")
  private long acesBefore15Minutes;

@JsonProperty("alliedJungleMonsterKills")
  private long alliedJungleMonsterKills;

@JsonProperty("baronTakedowns")
  private long baronTakedowns;

@JsonProperty("blastConeOppositeOpponentCount")
  private long blastConeOppositeOpponentCount;

@JsonProperty("bountyGold")
  private long bountyGold;

@JsonProperty("buffsStolen")
  private long buffsStolen;

@JsonProperty("completeSupportQuestInTime")
  private long completeSupportQuestInTime;

@JsonProperty("controlWardTimeCoverageInRiverOrEnemyHalf")
  private Double controlWardTimeCoverageInRiverOrEnemyHalf;

@JsonProperty("controlWardsPlaced")
  private long controlWardsPlaced;

@JsonProperty("damagePerMinute")
  private double damagePerMinute;

@JsonProperty("damageTakenOnTeamPercentage")
  private double damageTakenOnTeamPercentage;

@JsonProperty("dancedWithRiftHerald")
  private long dancedWithRiftHerald;

@JsonProperty("deathsByEnemyChamps")
  private long deathsByEnemyChamps;

@JsonProperty("dodgeSkillShotsSmallWindow")
  private long dodgeSkillShotsSmallWindow;

@JsonProperty("doubleAces")
  private long doubleAces;

@JsonProperty("dragonTakedowns")
  private long dragonTakedowns;

@JsonProperty("earlyLaningPhaseGoldExpAdvantage")
  private long earlyLaningPhaseGoldExpAdvantage;

@JsonProperty("effectiveHealAndShielding")
  private double effectiveHealAndShielding;

@JsonProperty("elderDragonKillsWithOpposingSoul")
  private long elderDragonKillsWithOpposingSoul;

@JsonProperty("elderDragonMultikills")
  private long elderDragonMultikills;

@JsonProperty("enemyChampionImmobilizations")
  private long enemyChampionImmobilizations;

@JsonProperty("enemyJungleMonsterKills")
  private long enemyJungleMonsterKills;

@JsonProperty("epicMonsterKillsNearEnemyJungler")
  private long epicMonsterKillsNearEnemyJungler;

@JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
  private long epicMonsterKillsWithin30SecondsOfSpawn;

@JsonProperty("epicMonsterSteals")
  private long epicMonsterSteals;

@JsonProperty("epicMonsterStolenWithoutSmite")
  private long epicMonsterStolenWithoutSmite;

@JsonProperty("firstTurretKilled")
  private long firstTurretKilled;

@JsonProperty("fistBumpParticipation")
  private long fistBumpParticipation;

@JsonProperty("flawlessAces")
  private long flawlessAces;

@JsonProperty("fullTeamTakedown")
  private long fullTeamTakedown;

@JsonProperty("gameLength")
  private double gameLength;

@JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
  private Long getTakedownsInAllLanesEarlyJungleAsLaner;

@JsonProperty("goldPerMinute")
  private double goldPerMinute;

@JsonProperty("hadOpenNexus")
  private long hadOpenNexus;

@JsonProperty("immobilizeAndKillWithAlly")
  private long immobilizeAndKillWithAlly;

@JsonProperty("initialBuffCount")
  private long initialBuffCount;

@JsonProperty("initialCrabCount")
  private long initialCrabCount;

@JsonProperty("jungleCsBefore10Minutes")
  private double jungleCSBefore10Minutes;

@JsonProperty("junglerTakedownsNearDamagedEpicMonster")
  private long junglerTakedownsNearDamagedEpicMonster;

@JsonProperty("kTurretsDestroyedBeforePlatesFall")
  private long kTurretsDestroyedBeforePlatesFall;

@JsonProperty("kda")
  private double kda;

@JsonProperty("killAfterHiddenWithAlly")
  private long killAfterHiddenWithAlly;

@JsonProperty("killParticipation")
  private double killParticipation;

@JsonProperty("killedChampTookFullTeamDamageSurvived")
  private long killedChampTookFullTeamDamageSurvived;

@JsonProperty("killingSprees")
  private long killingSprees;

@JsonProperty("killsNearEnemyTurret")
  private long killsNearEnemyTurret;

@JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
  private Long killsOnOtherLanesEarlyJungleAsLaner;

@JsonProperty("killsOnRecentlyHealedByAramPack")
  private long killsOnRecentlyHealedByAramPack;

@JsonProperty("killsUnderOwnTurret")
  private long killsUnderOwnTurret;

@JsonProperty("killsWithHelpFromEpicMonster")
  private long killsWithHelpFromEpicMonster;

@JsonProperty("knockEnemyIntoTeamAndKill")
  private long knockEnemyIntoTeamAndKill;

@JsonProperty("landSkillShotsEarlyGame")
  private long landSkillShotsEarlyGame;

@JsonProperty("laneMinionsFirst10Minutes")
  private long laneMinionsFirst10Minutes;

@JsonProperty("laningPhaseGoldExpAdvantage")
  private long laningPhaseGoldExpAdvantage;

@JsonProperty("legendaryCount")
  private long legendaryCount;

@JsonProperty("legendaryItemUsed")
  private List<Long> legendaryItemUsed;

@JsonProperty("lostAnInhibitor")
  private long lostAnInhibitor;

@JsonProperty("maxCsAdvantageOnLaneOpponent")
  private double maxCSAdvantageOnLaneOpponent;

@JsonProperty("maxKillDeficit")
  private long maxKillDeficit;

@JsonProperty("maxLevelLeadLaneOpponent")
  private long maxLevelLeadLaneOpponent;

@JsonProperty("mejaisFullStackInTime")
  private long mejaisFullStackInTime;

@JsonProperty("moreEnemyJungleThanOpponent")
  private double moreEnemyJungleThanOpponent;

@JsonProperty("multiKillOneSpell")
  private long multiKillOneSpell;

@JsonProperty("multiTurretRiftHeraldCount")
  private long multiTurretRiftHeraldCount;

@JsonProperty("multikills")
  private long multikills;

@JsonProperty("multikillsAfterAggressiveFlash")
  private long multikillsAfterAggressiveFlash;

@JsonProperty("outerTurretExecutesBefore10Minutes")
  private long outerTurretExecutesBefore10Minutes;

@JsonProperty("outnumberedKills")
  private long outnumberedKills;

@JsonProperty("outnumberedNexusKill")
  private long outnumberedNexusKill;

@JsonProperty("perfectDragonSoulsTaken")
  private long perfectDragonSoulsTaken;

@JsonProperty("perfectGame")
  private long perfectGame;

@JsonProperty("pickKillWithAlly")
  private long pickKillWithAlly;

@JsonProperty("playedChampSelectPosition")
  private long playedChampSelectPosition;

@JsonProperty("poroExplosions")
  private long poroExplosions;

@JsonProperty("quickCleanse")

  private long quickCleanse;

@JsonProperty("quickFirstTurret")
  private long quickFirstTurret;

@JsonProperty("quickSoloKills")
  private long quickSoloKills;

@JsonProperty("riftHeraldTakedowns")
  private long riftHeraldTakedowns;

@JsonProperty("saveAllyFromDeath")
  private long saveAllyFromDeath;

@JsonProperty("scuttleCrabKills")
  private long scuttleCrabKills;

@JsonProperty("skillshotsDodged")
  private long skillshotsDodged;

@JsonProperty("skillshotsHit")
  private long skillshotsHit;

@JsonProperty("snowballsHit")

  private long snowballsHit;

@JsonProperty("soloBaronKills")

  private long soloBaronKills;

@JsonProperty("soloKills")

  private long soloKills;

@JsonProperty("stealthWardsPlaced")

  private long stealthWardsPlaced;

@JsonProperty("survivedSingleDigitHpCount")

  private long survivedSingleDigitHPCount;

@JsonProperty("survivedThreeImmobilizesInFight")

  private long survivedThreeImmobilizesInFight;

@JsonProperty("takedownOnFirstTurret")

  private long takedownOnFirstTurret;

@JsonProperty("takedowns")

  private long takedowns;

@JsonProperty("takedownsAfterGainingLevelAdvantage")
  private long takedownsAfterGainingLevelAdvantage;

@JsonProperty("takedownsBeforeJungleMinionSpawn")
  private long takedownsBeforeJungleMinionSpawn;

@JsonProperty("takedownsFirstXMinutes")
  private long takedownsFirstXMinutes;

@JsonProperty("takedownsInAlcove")
  private long takedownsInAlcove;

@JsonProperty("takedownsInEnemyFountain")
  private long takedownsInEnemyFountain;

@JsonProperty("teamBaronKills")
  private long teamBaronKills;

@JsonProperty("teamDamagePercentage")

  private double teamDamagePercentage;

@JsonProperty("teamElderDragonKills")

  private long teamElderDragonKills;

@JsonProperty("teamRiftHeraldKills")

  private long teamRiftHeraldKills;

@JsonProperty("tookLargeDamageSurvived")

  private long tookLargeDamageSurvived;

@JsonProperty("turretPlatesTaken")

  private long turretPlatesTaken;

@JsonProperty("turretTakedowns")

  private long turretTakedowns;

@JsonProperty("turretsTakenWithRiftHerald")

  private long turretsTakenWithRiftHerald;

@JsonProperty("twentyMinionsIn3SecondsCount")

  private long twentyMinionsIn3SecondsCount;

@JsonProperty("twoWardsOneSweeperCount")

  private long twoWardsOneSweeperCount;

@JsonProperty("unseenRecalls")

  private long unseenRecalls;

@JsonProperty("visionScoreAdvantageLaneOpponent")
  private double visionScoreAdvantageLaneOpponent;

@JsonProperty("visionScorePerMinute")
  private double visionScorePerMinute;

@JsonProperty("voidMonsterKill")
  private long voidMonsterKill;

@JsonProperty("wardTakedowns")
  private long wardTakedowns;

@JsonProperty("wardTakedownsBefore20M")
  private long wardTakedownsBefore20M;

@JsonProperty("wardsGuarded")
  private long wardsGuarded;

@JsonProperty("junglerKillsEarlyJungle")
  private Long junglerKillsEarlyJungle;

@JsonProperty("killsOnLanersEarlyJungleAsJungler")
private Long killsOnLanersEarlyJungleAsJungler;

@JsonProperty("highestCrowdControlScore")
  private Long highestCrowdControlScore;

@JsonProperty("earliestBaron")
private Double earliestBaron;

@JsonProperty("earliestDragonTakedown")
private Double earliestDragonTakedown;

@JsonProperty("firstTurretKilledTime")
  private Double firstTurretKilledTime;

@JsonProperty("soloTurretsLategame")
  private Long soloTurretsLategame;

@JsonProperty("shortestTimeToAceFromFirstTakedown")
  private Double shortestTimeToAceFromFirstTakedown;

@JsonProperty("highestChampionDamage")
  private Long highestChampionDamage;

@JsonProperty("highestWardKills")
  private Long highestWardKills;
}

