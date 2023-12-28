package com.example.flow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.flow.dao.PeopleDao;
import com.example.flow.domain.ResponseResult;
import com.example.flow.entity.People;
import com.example.flow.service.PeopleService;
import com.example.flow.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import static com.example.flow.constants.PeopleConstants.*;

/**
 * (People)表服务实现类
 *
 * @author makejava
 * @since 2023-10-29 12:50:34
 */
@Service("peopleService")
public class PeopleServiceImpl extends ServiceImpl<PeopleDao, People> implements PeopleService {
    @Autowired
    PeopleDao peopleDao;
    @Override
    public ResponseResult getUserList() {
        LambdaQueryWrapper<People> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        List<People> people = peopleDao.selectList(lambdaQueryWrapper);
        return ResponseResult.okResult(people);
    }

    @Override
    public ResponseResult addPeople(People people) {
        //校验空字段
        if(Objects.isNull(people.getName())){
            String defaultName=DEFALUT_PEOPLE_NAME;
            people.setName(defaultName);
        }
        if(Objects.isNull(people.getRelationship())){
            int defaulRelationship=DEFALUT_PEOPLE_RELATIONSHIP;
            people.setRelationship(defaulRelationship);
        }
        if(Objects.isNull(people.getLevel())){
            int defaulLevekp=DEFALUT_PEOPLE_LEVEL;
            people.setLevel(defaulLevekp);
        }
        int insert = peopleDao.insert(people);
        return  ResponseResult.okResult(insert);
    }

    public void addScore(int id,Double score){
        People people = peopleDao.selectById(id);
        people.setScore(people.getScore()+score);
    }
    @Override
    public ResponseResult addLittleScore(int id) {
        Random random = new Random();
        double v = random.nextDouble();
        addScore(id,v);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult addMuchScore(int id) {
        Random random = new Random();
        double v = random.nextDouble();
        addScore(id,v);
        return ResponseResult.okResult();
    }
}

