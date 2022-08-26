package np.com.pantbinod.employeeManagementSystem.controller.user;


import np.com.pantbinod.employeeManagementSystem.model.User;
import np.com.pantbinod.employeeManagementSystem.model.dto.UserDto;
import np.com.pantbinod.employeeManagementSystem.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<UserDto> getUserList() {
        return userService.findAll();
    }


    @PostMapping("/")
    public UserDto save(@Valid @RequestBody UserDto userDto) throws Exception {
        if(userDto == null) ResponseEntity.internalServerError().body(userDto);
        return userService.save(userDto);


    }
}
