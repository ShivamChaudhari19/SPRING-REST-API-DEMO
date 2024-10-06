package com.demo.demo.controller;

import com.demo.demo.model.Cloud;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud")
public class CloudApiService {
    Cloud cloud;
    @GetMapping("{venderId}")
    public Cloud getClouddetail(String venderId){
        return cloud;
//                new Cloud("c1","cloud","xyz","xxxx");
    }

    @PostMapping
    public String createColudDetail(@RequestBody Cloud cloud){
        this.cloud=cloud;
        return "cloud created successfully";
    }
    @PutMapping
    public String updateCloudDetail(@RequestBody Cloud cloud){
        this.cloud=cloud;
        return "updated cloud detail successfully";
    }
}
