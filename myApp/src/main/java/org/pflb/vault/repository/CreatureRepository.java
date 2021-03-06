package org.pflb.vault.repository;

import org.pflb.vault.model.Creature;
import org.pflb.vault.model.RaceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreatureRepository extends JpaRepository<Creature, Long>{

    Creature getCreatureByName(String name);
    List<Creature> getAllByDamagePerSecondGreaterThan(Integer damagePerSecondLimit);
    List<Creature> getAllByRace(RaceType type);
    List<Creature> getAllByHitPointsGreaterThanAndLevelEquals(int hitPoints, int level);
    //void deleteAllByLevel();
}

