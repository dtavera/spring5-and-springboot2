package io.datajek.springbasics.movierecommmendersystem;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter{
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
