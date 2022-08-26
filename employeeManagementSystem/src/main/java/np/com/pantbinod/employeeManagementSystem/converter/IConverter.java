package np.com.pantbinod.employeeManagementSystem.converter;

public interface IConverter<E,D> {

    E convertToEntity(D dto) throws Exception;

    D convertToDto(E entity) throws Exception;
}
