package np.com.pantbinod.employeeManagementSystem.converter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Converter<E,D> implements IConverter<E,D>, IListConverter<E,D> {
    @Override
    public E convertToEntity(D dto) throws Exception {
        return null;
    }

    @Override
    public D convertToDto(E entity) throws Exception {
        return null;
    }

    @Override
    public List<E> convertToEntityList(List<D> dtoList) {

        if(dtoList == null || dtoList.isEmpty()) {
            return List.of();
        }
    return null;


    }

    @Override
    public List<D> convertToDtoList(List<E> entityList) {
        return null;
    }
}
