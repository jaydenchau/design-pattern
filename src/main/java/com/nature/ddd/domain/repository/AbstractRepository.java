package com.nature.ddd.domain.repository;

import com.nature.ddd.domain.types.ChangeDetector;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:43
 */
public abstract class AbstractRepository<AR, ID> {

    @Autowired
    private List<ChangeDetector<AR, ?, ?>> changeDetectors;

    protected void processChanges(AR aggregateRoot) {
        this.changeDetectors.forEach(detector -> this.processChangeDetector(aggregateRoot, detector));
    }

    private <E> void processChangeDetector(AR aggregateRoot, ChangeDetector<AR, E, ?> detector) {
        List<E> original = this.loadOriginalState(aggregateRoot, detector);
        List<E> current = this.getCurrentState(aggregateRoot, detector);

        ChangeDetector.ChangeSet<E> changeSet = detector.detectChanges(aggregateRoot, original, current);
        this.handleAdded(aggregateRoot, changeSet.getAdded());
        this.handleModified(aggregateRoot, changeSet.getModified());
        this.handleRemoved(aggregateRoot, changeSet.getRemoved());

    }

    protected abstract <E> List<E> loadOriginalState(AR aggregateRoot, ChangeDetector<AR, E, ?> detector);
    protected abstract <E> List<E> getCurrentState(AR aggregateRoot, ChangeDetector<AR, E, ?> detector);
    protected abstract <E> void handleAdded(AR aggregateRoot, List<E> added);
    protected abstract <E> void handleModified(AR aggregateRoot, List<E> modified);
    protected abstract <E> void handleRemoved(AR aggregateRoot, List<E> removed);
}
