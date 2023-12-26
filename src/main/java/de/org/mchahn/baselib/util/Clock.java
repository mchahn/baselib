package de.org.mchahn.baselib.util;

@FunctionalInterface
public interface Clock {
    long now();

    final static Clock _system = () -> System.currentTimeMillis();
}
