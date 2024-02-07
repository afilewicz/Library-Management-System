package org.pap.project.book;

import jakarta.persistence.*;
import lombok.*;
import org.pap.project.genre.Genre;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@Data
public class  Book {
    @Id
    private String isbn;
    private String title;
    private String author;
    @ManyToOne
    private Genre genre;

    public Book(String isbn, String title, String author, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
