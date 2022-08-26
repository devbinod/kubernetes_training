package np.com.pantbinod.employeeManagementSystem.converter.user;

import np.com.pantbinod.employeeManagementSystem.model.User;
import np.com.pantbinod.employeeManagementSystem.model.dto.UserDto;
import org.mapstruct.Mapper;

import org.mapstruct.MappingConstants;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserDto convertToDto(User user);

    User convertToEntity(UserDto userDto);

    List<User> convertToEntityList (List<User> users);

    List<UserDto> convertToDtoList(List<User> entityList);


}
