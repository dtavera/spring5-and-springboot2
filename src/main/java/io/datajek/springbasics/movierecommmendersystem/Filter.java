package io.datajek.springbasics.movierecommmendersystem;

public interface Filter {
    public String[] getRecommendations(String movie);
}
