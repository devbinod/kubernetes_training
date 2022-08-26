package np.com.pantbinod.employeeManagementSystem.converter;

import np.com.pantbinod.employeeManagementSystem.model.User;
import np.com.pantbinod.employeeManagementSystem.model.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends Converter<User, UserDto> {
//
//
//    @Override
//    public User convertToEntity(UserDto dto) throws Exception {
//
//        if (dto == null) throw new RuntimeException();
//        User user = new User();
//        user.setFirstName(dto.getFirstName());
//        user.setLastName(dto.getLastName());
//        user.setJoinDate(dto.getJoinDate());
//        user.setCourse(dto.getCourse());
//        return user;
//    }
//
//
//    @Override
//    public UserDto convertToDto(User entity) throws Exception {
//        if (entity == null) throw new RuntimeException();
//        UserDto userDto = new UserDto(
//                entity.getFirstName(),
//                entity.getLastName(),
//                entity.getJoinDate(),
//                entity.getCourse());
//        return userDto;
//    }
}
