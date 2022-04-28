package com.zenghao.mybatisplus;

import com.zenghao.mybatisplus.mapper.UserMapper;
import com.zenghao.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        //通过条件构造器查询一个List集合,若没有条件可以设置null为参数
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        //实现新增用户信息
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("2283134780@qq.com");
        int insert = userMapper.insert(user);
        System.out.println("result:"+insert);
        System.out.println("id="+user.getId());
    }

    @Test
    public void testDelete(){
        //通过id删除用户信息
       /* int result = userMapper.deleteById(1511973062102372354L);
        System.out.println("result:"+result);*/
        //根据map集合中所设置的条件来删除数据
        /*Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",23);
        int i = userMapper.deleteByMap(map);
        System.out.println("result:"+i);*/
        //通过多个id实现批量删除
        List<Long> list = Arrays.asList(4L,5L);
        int i = userMapper.deleteBatchIds(list);
        System.out.println("result:"+i);
    }
    @Test
    public void testUpdateById(){
        User user = new User(4L, "admin", 22, null);
       //UPDATE user SET name=?, age=? WHERE id=?
        int result = userMapper.updateById(user);
        System.out.println("受影响行数："+result);
    }

    @Test
    public void testSelectById(){
    //根据id查询用户信息
      //SELECT id,name,age,email FROM user WHERE id=?
        /*User user = userMapper.selectById(4L);
        System.out.println(user);*/
        //通过多个id 查询
        //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? )
        /*List<Long> idList = Arrays.asList(4L, 5L);
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);*/
        //根据Map查询
        /*Map<String,Object> map = new HashMap<>();
        map.put("name","jack");
        map.put("age","20");
        List<User> list1 = userMapper.selectByMap(map);
        list1.forEach(System.out::println);*/

        //查询所有
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);


    }
}
