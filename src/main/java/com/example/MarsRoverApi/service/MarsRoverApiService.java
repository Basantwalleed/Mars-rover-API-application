package com.example.MarsRoverApi.service;

import com.example.MarsRoverApi.response.MarsRoverApiResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class MarsRoverApiService {

  private static final String API_KEY = "f7HYj19tL9KJxtwtRPBTW7FXLDTiP1h9l6rxRy0O";
  
  public MarsRoverApiResponse getRoverData(String roverType) {
    RestTemplate rt = new RestTemplate();
    
    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=2&api_key=" + API_KEY, MarsRoverApiResponse.class);
    
    return response.getBody();
  }
}
