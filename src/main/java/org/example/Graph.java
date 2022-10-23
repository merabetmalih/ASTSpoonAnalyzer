package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {

    private Map<String, Map<String, Map<String, String>>> sourceClassesInvocations = new HashMap<>();

    public Map<String, Map<String, Map<String, String>>> getSourceClassesInvocations() {
        return sourceClassesInvocations;
    }

    public long getNbInvocations() {
        return sourceClassesInvocations.keySet()
                .stream()
                .map(source -> sourceClassesInvocations.get(source))
                .map(Map::values)
                .flatMap(Collection::stream)
                .map(Map::keySet)
                .mapToLong(Collection::size)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Static Call Graph");
        builder.append("\nInvocations: "+getNbInvocations()+".");
        builder.append("\n");

        for (String source: sourceClassesInvocations.keySet()) {
            builder.append(source + ":\n");

            for (String destination: sourceClassesInvocations.get(source).keySet()) {
                builder.append("\t---> " + destination + ":\n");

                for (String dest : sourceClassesInvocations.get(source).get(destination).keySet()) {

                    builder.append("\t      " + sourceClassesInvocations.get(source).get(destination).get(dest)
                            + "::" + dest );
                    builder.append("\n");
                }

            }
        }

        return builder.toString();
    }



}
