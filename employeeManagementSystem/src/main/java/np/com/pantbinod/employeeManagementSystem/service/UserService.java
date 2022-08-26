package np.com.pantbinod.employeeManagementSystem.service;

import np.com.pantbinod.employeeManagementSystem.model.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto) throws Exception;
    List<UserDto> findAll();
    UserDto update(String id,UserDto userDto);
    void  delete(String id);
}
