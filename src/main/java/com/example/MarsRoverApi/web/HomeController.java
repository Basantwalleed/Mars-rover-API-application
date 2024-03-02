package com.example.MarsRoverApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import com.example.MarsRoverApi.response.MarsRoverApiResponse;
import com.example.MarsRoverApi.service.MarsRoverApiService;


@Controller
public class HomeController {

  @Autowired
  private MarsRoverApiService roverService;
  
  @GetMapping("/home")
  public String getHomeView (ModelMap model, @RequestParam(required=false) String marsApiRoverData) {
    // if request param is empty, then set a default value
    if (StringUtils.isEmpty(marsApiRoverData)) {
      marsApiRoverData = "opportunity";
    }
    MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
    model.put("roverData", roverData);
    
    return "index";
  }
  @GetMapping("/opportunity")
  public String getOpportunityView (ModelMap model) {
    MarsRoverApiResponse roverData = roverService.getRoverData("opportunity");
    model.put("roverData", roverData);
    return "opportunity";
  }
  @GetMapping("/curiosity")
  public String getCuriosityView (ModelMap model) {
    MarsRoverApiResponse roverData = roverService.getRoverData("curiosity");
    model.put("roverData", roverData);
    return "curiosity";
  }
  @GetMapping("/spirit")
  public String getSpiritView (ModelMap model) {
    MarsRoverApiResponse roverData = roverService.getRoverData("spirit");
    model.put("roverData", roverData);
    return "spirit";
  }
  
}