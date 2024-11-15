package com.juzipi.iojbackenduserservice.controller.inner;

import com.juzipi.ibackendmodel.entity.User;
import com.juzipi.iojbackendserviceclient.service.UserFeignClient;
import com.juzipi.iojbackenduserservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName: UserInnerController
 * @Description: 该服务仅内部调用，不是给前端的
 * @Author: 橘子皮
 * @Date: 2024-11-14 20:18
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {

    @Resource
    private UserService userService;

    /**
     * 根据 id 获取用户
     * @param userId
     * @return
     */
    @Override
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") long userId) {
        return userService.getById(userId);
    }

    /**
     * 根据 id 获取用户列表
     * @param idList
     * @return
     */
    @Override
    @GetMapping("/get/ids")
    public List<User> listByIds(@RequestParam("idList") Collection<Long> idList) {
        return userService.listByIds(idList);
    }

}
