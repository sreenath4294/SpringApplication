//package com.example.SpringApplication.cli;
//
//import com.example.SpringApplication.vo.AuthorVO;
//import com.example.SpringApplication.vo.BookVO;
//import com.example.SpringApplication.vo.PublisherVO;
//import com.example.SpringApplication.repositories.AuthorRepository;
//import com.example.SpringApplication.repositories.BookRepository;
//import com.example.SpringApplication.repositories.PublisherRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CliStartup  implements CommandLineRunner {
//    private final AuthorRepository authorRepository;
//    private final BookRepository bookRepository;
//    private final PublisherRepository publisherRepository;
//
//    public CliStartup(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
//        this.authorRepository = authorRepository;
//        this.bookRepository = bookRepository;
//        this.publisherRepository = publisherRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception{
//        AuthorVO asimov = new AuthorVO("Issac", "Assimov");
//        BookVO robot = new BookVO("Robot", "52481");
//        PublisherVO dcBooks = new PublisherVO("DCBooks", "Kochi", "Kerala");
////        asimov.getBooks().add(robot);
////        robot.getAuthors().add(asimov);
////        dcBooks.getBooks().add(robot);
//
//        authorRepository.save(asimov);
//        bookRepository.save(robot);
//        publisherRepository.save(dcBooks);
//
//
//        AuthorVO shakespheare = new AuthorVO("William", "Shakespeare");
//        BookVO hamlet = new BookVO("Hamlet", "68532");
////        shakespheare.getBooks().add(hamlet);
////        hamlet.getAuthors().add(shakespheare);
////        dcBooks.getBooks().add(hamlet);
//
//        authorRepository.save(shakespheare);
//        bookRepository.save(hamlet);
//        publisherRepository.save(dcBooks);
//
//        System.out.println("Started in CLI");
//        System.out.println("Number of Books: " + bookRepository.count());
//        System.out.println("Number of Publishers: " + publisherRepository.count());
////        System.out.println("Number of Books in Publisher: " + dcBooks.getBooks().size());
//    }
//}
