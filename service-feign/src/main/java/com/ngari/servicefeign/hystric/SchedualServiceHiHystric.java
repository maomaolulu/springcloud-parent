package com.ngari.servicefeign.hystric;

import com.ngari.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description
 * @Author maoLy
 * @Date 2021/1/6
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name){
        return "sorry "+name;
    }
}
