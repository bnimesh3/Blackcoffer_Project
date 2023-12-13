package com.blackcoffer.repo;

import com.blackcoffer.entities.VisualizationDashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VisualizationDashboardDto extends JpaRepository<VisualizationDashboard,Integer> {


    // for intensity
    public List<VisualizationDashboard>findByIntensity(String intensity);

//    public List<VisualizationDashboard> findAllByIntensity(String inten);

//    public List<VisualizationDashboard> findAllByIntensity(String inten);

    //for Likelihood
    public List<VisualizationDashboard>findByLikelihood(String likelihood);

    // for Relevance
    public List<VisualizationDashboard>findByRelevance(String relevance);

    // for Country
    public List<VisualizationDashboard>findByCountry(String country);

    // for Topic
    public List<VisualizationDashboard>findByTopic(String topic);

    // for Region
    public List<VisualizationDashboard>findByRegion(String region);

    //for  City
    public List<VisualizationDashboard>findByCity(String city);

    //for end_year
    @Query("from VisualizationDashboard v where v.end_year=:year")
    public List<VisualizationDashboard>findByEnd_year(@Param("year") String end_year);

    // for start_year
    @Query("from VisualizationDashboard v where v.start_year=:year")
    public List<VisualizationDashboard>findByStart_year(@Param("year") String start_year);

}
