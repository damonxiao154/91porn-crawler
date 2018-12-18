package club.bluetroy.crawler91.web.controller;

import club.bluetroy.crawler.Crawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2018-07-21
 * Time: 下午5:40
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Crawler crawler;

    @RequestMapping("/login")
    public void login(@NotNull String username, @NotNull String password, @RequestParam("captcha_input") @NotNull String captchaInput) throws Exception {
        crawler.login(username, password, captchaInput);
    }
}