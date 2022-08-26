package np.com.pantbinod.employeeManagementSystem.converter;

import java.util.List;

public interface IListConverter<E,D> {

    List<E> convertToEntityList(List<D> dtoList);

    List<D> convertToDtoList(List<E> entityList);
}
