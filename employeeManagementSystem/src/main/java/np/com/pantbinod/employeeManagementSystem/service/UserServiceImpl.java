package np.com.pantbinod.employeeManagementSystem.service;

import np.com.pantbinod.employeeManagementSystem.converter.UserConverter;
import np.com.pantbinod.employeeManagementSystem.converter.user.UserMapper;
import np.com.pantbinod.employeeManagementSystem.model.dto.UserDto;
import np.com.pantbinod.employeeManagementSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto save(UserDto userDto) throws Exception {
        return userMapper.convertToDto(userRepository.save(userMapper.convertToEntity(userDto)));
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.convertToDtoList(userRepository.findAll());
    }

    @Override
    public UserDto update(String id, UserDto userDto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
