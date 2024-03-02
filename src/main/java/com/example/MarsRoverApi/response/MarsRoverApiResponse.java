package com.example.MarsRoverApi.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
    List<Marsphotos> photos = new ArrayList<>();

    public List<Marsphotos> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Marsphotos> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "MarsRoverApiResponse{" +
                "photos=" + photos +
                '}';
    }
}
