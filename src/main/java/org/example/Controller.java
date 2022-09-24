package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class Controller {
    public static final SideModel sideModel = SideModel.getInstance();

    @GetMapping(value = "/getSide", consumes ="application/json",produces="application/json")
    public Map<String,String> getSide (@RequestBody Map<String,Integer> degree){
        Map<String,String> result = new HashMap<String,String>();
        result.put("Side", sideModel.checkSide(degree.get("degree")));
        return result;
    }
}
