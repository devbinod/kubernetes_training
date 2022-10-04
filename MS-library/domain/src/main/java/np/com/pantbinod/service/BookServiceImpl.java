package np.com.pantbinod.entity.service;

import np.com.pantbinod.data.BookDto;
import np.com.pantbinod.ports.api.BookPersistencePort;
import np.com.pantbinod.ports.spi.BookServicePort;

import java.util.List;

public class BookServiceImpl implements BookServicePort {

    private BookPersistencePort bookPersistencePort;
    public BookServiceImpl(BookPersistencePort bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public BookDto addBook(BookDto bookDto) {
        return bookPersistencePort.addBook(bookDto);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return bookPersistencePort.updateBook(bookDto);
    }

    @Override
    public List<BookDto> getBooks() {
        return bookPersistencePort.getBooks();
    }

    @Override
    public BookDto getBookById(Long bookId) {
        return bookPersistencePort.getBookById(bookId);
    }
}
