package com.blackcoffer.controller;

import com.blackcoffer.entities.VisualizationDashboard;
import com.blackcoffer.service.VisualizationDashboardService;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisualizationDashboardController {

    @Autowired
    private VisualizationDashboardService visualizationDashboardService;


    //for add all data in database
    @RequestMapping(path = "feedVisualizationDashboardData")
    public void setDataInDB(){
        visualizationDashboardService.saveVisualizationDashboardData();
    }

    // for find intensity with help of ID
    @GetMapping(path = "intensity/{id}")
    public ResponseEntity<List<VisualizationDashboard>> getByIntensityController(@PathVariable("id")String intensity){

        List<VisualizationDashboard>list=visualizationDashboardService.getByIntensity(intensity);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
//    @GetMapping(path = "/intensi")
//    public ResponseEntity<List<VisualizationDashboard>> getAllIntensityController(String inten){
//
//        List<VisualizationDashboard>list=visualizationDashboardService.getAlLByIntensity(inten);
//        return new ResponseEntity<>(list, HttpStatus.OK);
//    }

    //for find Likelihood with help of id

    @GetMapping(path = "likelihood/{id}")
    public ResponseEntity<List<VisualizationDashboard>>getByLikelihoodController(@PathVariable("id")String likelihood)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByLikelihood(likelihood);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    //for find Relevance with help of id
    @GetMapping(path = "relevance/{id}")
    public ResponseEntity<List<VisualizationDashboard>>getByRelevanceController(@PathVariable("id")String relevance)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByRelevance(relevance);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    // for find Country
    @GetMapping(path = "country/{name}")
    public ResponseEntity<List<VisualizationDashboard>>getByCountryController(@PathVariable("name")String country)
    {
       List<VisualizationDashboard>list=visualizationDashboardService.getByCountry(country);
       return new ResponseEntity<>(list,HttpStatus.OK);
    }
    // for find Topics
    @GetMapping(path = "topic/{name}")
    public ResponseEntity<List<VisualizationDashboard>>getByTopicController(@PathVariable("name")String topic)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByTopic(topic);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    // for find Region
    @GetMapping(path = "region/{name}")
    public ResponseEntity<List<VisualizationDashboard>>getByRegionController(@PathVariable("name")String region)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByRegion(region);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    //for find City
    @GetMapping(path = "city/{name}")
    public ResponseEntity<List<VisualizationDashboard>>getByCityController(@PathVariable("name")String city)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByCity(city);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    // for find end_year
    @GetMapping(path = "end_year/{id}")
    public ResponseEntity<List<VisualizationDashboard>>getByEnd_yearController(@PathVariable("id")String end_year)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByEnd_year(end_year);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    // for find start_year
    @GetMapping(path = "start_year/{id}")
    public ResponseEntity<List<VisualizationDashboard>>getByStart_yearController(@PathVariable("id")String start_year)
    {
        List<VisualizationDashboard>list=visualizationDashboardService.getByStart_year(start_year);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}


