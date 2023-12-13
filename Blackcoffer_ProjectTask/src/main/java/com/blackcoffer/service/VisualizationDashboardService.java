package com.blackcoffer.service;


import com.blackcoffer.entities.VisualizationDashboard;
import com.blackcoffer.repo.VisualizationDashboardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class VisualizationDashboardService {

    @Autowired
    private VisualizationDashboardDto visualizationDashboardDto;
    String line="";

//    public void save(MultipartFile file)
//    {
//       try{
//        List<VisualizationDashboard> visualizationDashboards =  Helper.convertExcelToListOfVisualizationDashboard(file.getInputStream());
//
//
//           System.out.println(visualizationDashboards);
//
//        this.visualizationDashboardRepo.saveAll(visualizationDashboards);
//       }catch (IOException e){
//           e.printStackTrace();
//       }
//    }
//    public List<VisualizationDashboard> getAllVisualizationDashboard(){
//        return this.visualizationDashboardRepo.findAll();
//
//
//    }


    public void saveVisualizationDashboardData(){


            try {
                BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Data.csv"));
//                int count=1;

                while((line=br.readLine())!=null) {

//                    if(count==1)
//                        continue;
//                    codunt++;

                    String [] data=line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                    VisualizationDashboard v=new VisualizationDashboard();
                    v.setEnd_year(data[0]);
                    v.setCitylng(data[1]);
                    v.setCitylat(data[2]);
                    v.setIntensity(data[3]);
                    v.setSector(data[4]);
                    v.setTopic(data[5]);
                    v.setInsight(data[6]);
                    v.setSwot(data[7]);
                    v.setUrl(data[8]);
                    v.setRegion(data[9]);
                    v.setStart_year(data[10]);
                    v.setImpact(data[11]);
                    v.setAdded(data[12]);
                    v.setPublished(data[13]);
                    v.setCity(data[14]);
                    v.setCountry(data[15]);
                    v.setRelevance(data[16]);
                    v.setPestle(data[17]);
                    v.setSource(data[18]);
                    v.setTitle(data[19]);
                    v.setLikelihood(data[20]);
                    visualizationDashboardDto.save(v);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }


    }
    // for intensity
    public List<VisualizationDashboard>getByIntensity(String intensity)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByIntensity(intensity);
        return list;
    }

//    public List<VisualizationDashboard>getAlLByIntensity(String inten)
//    {
//        List<VisualizationDashboard>list=visualizationDashboardDto.findAllByIntensity(inten);
//        return list;
//    }

    // for Likelihood
    public List<VisualizationDashboard>getByLikelihood(String likelihood)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByLikelihood(likelihood);
        return list;
    }

    // for Relevance
    public List<VisualizationDashboard>getByRelevance(String relevance)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByRelevance(relevance);
        return list;
    }

    //for Country
    public List<VisualizationDashboard>getByCountry(String country)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByCountry(country);
        return list;
    }

    // for Topics
    public List<VisualizationDashboard>getByTopic(String topics)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByTopic(topics);
        return list;
    }

    //for Region
    public List<VisualizationDashboard>getByRegion(String region)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByRegion(region);
        return list;
    }

    //for City
    public List<VisualizationDashboard>getByCity(String city)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByCity(city);
        return list;
    }

    // for end_year
    public List<VisualizationDashboard>getByEnd_year(String end_year)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByEnd_year(end_year);
        return list;
    }

    // for start_year
    public List<VisualizationDashboard>getByStart_year(String start_year)
    {
        List<VisualizationDashboard>list=visualizationDashboardDto.findByStart_year(start_year);
        return list;
    }
}
