package com.nature.ddd.domain.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:28
 */
public abstract class AbstractChangeDetector<AR, E, ID> implements ChangeDetector<AR, E, ID> {

    @Override
    public ChangeSet<E> detectChanges(AR aggregateRoot, List<E> origin, List<E> current) {
        Map<ID, E> originMap = origin.stream().collect(Collectors.toMap(this::extractId, Function.identity()));
        Map<ID, E> currentMap = current.stream().collect(Collectors.toMap(this::extractId, Function.identity()));
        List<E> added = new ArrayList<>();
        List<E> modified = new ArrayList<>();
        List<E> removed = new ArrayList<>();
        // find added and modified
        current.forEach(e -> {
            E originEntity = originMap.get(extractId(e));
            if (originEntity == null) {
                added.add(e);
            } else if (!isSameBusinessContent(aggregateRoot, originEntity, e)) {
                modified.add(e);
            }
        });
        // find deleted
        origin.forEach(e -> {
            if (!currentMap.containsKey(extractId(e))) {
                removed.add(e);
            }
        });
        return new defaultChangeSet<>(added, modified, removed);
    }

    protected abstract ID extractId(E entity);

    protected abstract boolean isSameBusinessContent(AR aggregateRoot, E origin, E current);

    private static class defaultChangeSet<E> implements ChangeSet<E> {

        private final List<E> added;
        private final List<E> modified;
        private final List<E> removed;

        private defaultChangeSet(List<E> added, List<E> modified, List<E> removed) {
            this.added = added;
            this.modified = modified;
            this.removed = removed;
        }

        @Override
        public List<E> getAdded() {
            return added;
        }

        @Override
        public List<E> getModified() {
            return modified;
        }

        @Override
        public List<E> getRemoved() {
            return removed;
        }
    }
}
