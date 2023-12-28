package com.example.flow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.flow.domain.ResponseResult;
import com.example.flow.entity.People;
import org.springframework.stereotype.Service;

/**
 * (People)表服务接口
 *
 * @author makejava
 * @since 2023-10-29 12:50:33
 */
@Service
public interface PeopleService extends IService<People> {
    ResponseResult getUserList();


    ResponseResult addPeople(People people);

    ResponseResult addLittleScore(int id);
    ResponseResult addMuchScore(int id);

}

