package com.hotel.hotel.controllers;

import com.hotel.hotel.models.HotelFacilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HotelFacilities facilities;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testing")
    public String test() {
        return "Testing 1, 2, 3!";
    }

    @GetMapping("/hotels")
    public ResponseEntity<?> getRates() {

        String url = "https://booking-com.p.rapidapi.com/v1/hotels/facilities?locale=en-gb&hotel_id=1676161";
//        String url = "booking-com.p.rapidapi.com";

        HotelFacilities response = restTemplate.getForObject(url, HotelFacilities.class);

        return ResponseEntity.ok(response);
    }
}
