package io.datajek.springbasics.movierecommmendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //@Autowired //field injection is unsafe because Spring can set private fields of objects
    private Filter filter;

    @Autowired //the use of the @Autowired annotation is optional when using constructors.
    public RecommenderImplementation (@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
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
