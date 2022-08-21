package np.com.pantbinod.dockerdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartupController {


    @GetMapping("/")
    public String index() {
        return  "Hello World";
    }
}
