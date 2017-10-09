package fr.univtln.bruno.tp.tp3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapAnimalTatoue implements Map<Tatouage, AnimalTatoue> {
    private final Map<Tatouage, AnimalTatoue> animalTatoueMap;

    public MapAnimalTatoue() {
        this.animalTatoueMap = new HashMap<>();
    }

    public MapAnimalTatoue(Map<Tatouage, AnimalTatoue> animalTatoueMap) {
        this.animalTatoueMap = animalTatoueMap;
    }

    @Override
    public int size() {
        return animalTatoueMap.size();
    }

    @Override
    public boolean isEmpty() {
        return animalTatoueMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return animalTatoueMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return animalTatoueMap.containsValue(value);
    }

    @Override
    public AnimalTatoue get(Object key) {
        return animalTatoueMap.get(key);
    }

    public AnimalTatoue put(AnimalTatoue value) {
        return put(value.getTatouage(), value);
    }

    @Override
    public AnimalTatoue put(Tatouage key, AnimalTatoue value) {
        return animalTatoueMap.put(key, value);
    }

    @Override
    public AnimalTatoue remove(Object key) {
        return animalTatoueMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends Tatouage, ? extends AnimalTatoue> m) {
        animalTatoueMap.putAll(m);
    }

    @Override
    public void clear() {
        animalTatoueMap.clear();
    }

    @Override
    public Set<Tatouage> keySet() {
        return animalTatoueMap.keySet();
    }

    @Override
    public Collection<AnimalTatoue> values() {
        return animalTatoueMap.values();
    }

    @Override
    public Set<Entry<Tatouage, AnimalTatoue>> entrySet() {
        return animalTatoueMap.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        return animalTatoueMap.equals(o);
    }

    @Override
    public int hashCode() {
        return animalTatoueMap.hashCode();
    }

    @Override
    public AnimalTatoue getOrDefault(Object key, AnimalTatoue defaultValue) {
        return animalTatoueMap.getOrDefault(key, defaultValue);
    }

    @Override
    public void forEach(BiConsumer<? super Tatouage, ? super AnimalTatoue> action) {
        animalTatoueMap.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super Tatouage, ? super AnimalTatoue, ? extends AnimalTatoue> function) {
        animalTatoueMap.replaceAll(function);
    }

    @Override
    public AnimalTatoue putIfAbsent(Tatouage key, AnimalTatoue value) {
        return animalTatoueMap.putIfAbsent(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return animalTatoueMap.remove(key, value);
    }

    @Override
    public boolean replace(Tatouage key, AnimalTatoue oldValue, AnimalTatoue newValue) {
        return animalTatoueMap.replace(key, oldValue, newValue);
    }

    @Override
    public AnimalTatoue replace(Tatouage key, AnimalTatoue value) {
        return animalTatoueMap.replace(key, value);
    }

    @Override
    public AnimalTatoue computeIfAbsent(Tatouage key, Function<? super Tatouage, ? extends AnimalTatoue> mappingFunction) {
        return animalTatoueMap.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public AnimalTatoue computeIfPresent(Tatouage key, BiFunction<? super Tatouage, ? super AnimalTatoue, ? extends AnimalTatoue> remappingFunction) {
        return animalTatoueMap.computeIfPresent(key, remappingFunction);
    }

    @Override
    public AnimalTatoue compute(Tatouage key, BiFunction<? super Tatouage, ? super AnimalTatoue, ? extends AnimalTatoue> remappingFunction) {
        return animalTatoueMap.compute(key, remappingFunction);
    }

    @Override
    public AnimalTatoue merge(Tatouage key, AnimalTatoue value, BiFunction<? super AnimalTatoue, ? super AnimalTatoue, ? extends AnimalTatoue> remappingFunction) {
        return animalTatoueMap.merge(key, value, remappingFunction);
    }
}
