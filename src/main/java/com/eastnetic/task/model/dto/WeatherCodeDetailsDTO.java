package com.eastnetic.task.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherCodeDetailsDTO {

   @JsonProperty("day")
   Day day;

   @JsonProperty("night")
   Night night;
    
}