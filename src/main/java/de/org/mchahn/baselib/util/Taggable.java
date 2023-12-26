package de.org.mchahn.baselib.util;

public interface Taggable {
    Object getTag(String name);
    void   setTag(String name, Object tag);
}
