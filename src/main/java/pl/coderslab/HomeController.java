package pl.coderslab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home(){

        log.info("asdasd {}", 12);
        return "home";
    }
    @RequestMapping("/theme")
    public String theme(){

        log.info("asdasd {}", 12);
        return "index";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() { return "Here you can find some details for logged users"; }
}
