package book;

class Book {
    public String name;
    public String author;
    public String an;

    Book(String name, String author, String an) {
        this.name = name;
        this.author = author;
        this.an = an;
    }

    void bookDetails() {
        System.out.println("-----------------------------" + "\n"
                + "Book Name:\t" + name + "\n"
                + "Author Name:\t" + author + "\n"
                + "ISBN:\t" + an + "\n"
                + "-----------------------------");
    }

}
}