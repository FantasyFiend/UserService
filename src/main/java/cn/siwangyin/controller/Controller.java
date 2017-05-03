package cn.siwangyin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/3.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String Hello() {
        return "Hello UserService";
    }
}
