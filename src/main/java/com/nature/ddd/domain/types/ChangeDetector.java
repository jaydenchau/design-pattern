package com.nature.ddd.domain.types;

import java.util.List;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:25
 */
public interface ChangeDetector<AR, E, ID> {

    ChangeSet<E> detectChanges(AR aggregateRoot, List<E> origin, List<E> current);

    interface ChangeSet<E> {
        List<E> getAdded();

        List<E> getModified();

        List<E> getRemoved();
    }
}
