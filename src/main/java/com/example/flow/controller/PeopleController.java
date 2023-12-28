package com.example.flow.controller;



import com.baomidou.mybatisplus.extension.api.ApiController;

import com.example.flow.domain.ResponseResult;
import com.example.flow.entity.People;
import com.example.flow.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (People)表控制层
 *
 * @author makejava
 * @since 2023-10-29 12:50:25
 */
@RestController
@RequestMapping("/people")
public class PeopleController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private PeopleService peopleService;

    @GetMapping("/peopleList")
    ResponseResult getPeopleList()
    {
        return peopleService.getUserList();
    }
    @GetMapping("/addPeople")
    ResponseResult addPeople(@RequestBody People people)
    {
        return peopleService.addPeople(people);
    }

}

