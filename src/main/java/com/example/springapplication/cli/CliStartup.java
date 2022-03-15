package com.example.springapplication.cli;

import com.example.springapplication.entity.Author;
import com.example.springapplication.entity.Book;
import com.example.springapplication.entity.Publisher;
import com.example.springapplication.repository.AuthorRepository;
import com.example.springapplication.repository.BookRepository;
import com.example.springapplication.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CliStartup  implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public CliStartup(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Publisher dcBooks = new Publisher("DCBooks", "Kochi", "Kerala");
        Author asimov = new Author("Issac", "Assimov");
        Book robot = new Book("Robot", "52481");
//        asimov.getBooks().add(robot);
//        robot.getAuthors().add(asimov);
//        dcBooks.getBooks().add(robot);

        authorRepository.save(asimov);
        bookRepository.save(robot);
        publisherRepository.save(dcBooks);


        Author shakespheare = new Author("William", "Shakespeare");
        Book hamlet = new Book("Hamlet", "68532");
//        shakespheare.getBooks().add(hamlet);
//        hamlet.getAuthors().add(shakespheare);
//        dcBooks.getBooks().add(hamlet);

        authorRepository.save(shakespheare);
        bookRepository.save(hamlet);
        publisherRepository.save(dcBooks);

        System.err.println("Started in CLI");
        System.err.println("Number of Books: " + bookRepository.count());
        System.err.println("Number of Publishers: " + publisherRepository.count());
    }
}
