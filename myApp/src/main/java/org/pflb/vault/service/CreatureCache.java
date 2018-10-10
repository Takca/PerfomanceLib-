package org.pflb.vault.service;

import org.pflb.vault.model.Creature;

import java.util.List;

public interface CreatureCache {

    void safeCreature(Creature creature);
    Creature getCreatureByName(String name);
    List<Creature> getAllByDamagePerSecondGreaterThan(Integer damagePerSecondLimit);

}
