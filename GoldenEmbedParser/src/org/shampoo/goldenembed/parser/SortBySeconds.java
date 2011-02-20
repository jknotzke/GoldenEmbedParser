package org.shampoo.goldenembed.parser;

public class SortBySeconds implements java.util.Comparator<GoldenCheetah> {
    public int compare(GoldenCheetah aGC, GoldenCheetah anotherGC) {
        int secDiff = (int) (aGC.getSecs() - anotherGC.getSecs());
        return secDiff;
    }
