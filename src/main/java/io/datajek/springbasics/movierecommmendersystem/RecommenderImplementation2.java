package io.datajek.springbasics.movierecommmendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    //@Autowired //field injection is unsafe because Spring can set private fields of objects
    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    public String[] recommendMovies(String movie) {
        /*ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendation("Finding Dory");*/

        /*CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations("Finding Dory");*/

        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}
