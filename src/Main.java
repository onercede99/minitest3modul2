//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("101", "Javascript", 60, "Hieu", "Java", "8");
        books[1] = new ProgrammingBook("102", "Ceecongcong", 80, "Hung", "C++", "15");
        books[2] = new ProgrammingBook("103", "Python", 100, "Tam", "Python", "12");

        books[3] = new FictionBook("201", "Sachhay", 50, "HoaTam", "Vien tuong 1");
        books[4] = new FictionBook("202", "Hoasotam", 105, "Khanhbeo", "Vien tuong 2");
        books[5] = new FictionBook("203", "Mavantai", 120, "HoaTam", "Vien tuong 1");

        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
        System.out.println(books[3].toString());
        System.out.println(books[4].toString());
        System.out.println(books[5].toString());

        int sumPrice = 0;
        for (Book book : books) {
            sumPrice += book.getPrice();
        }
        System.out.println("\nTotal Price Book= " + sumPrice + "$");

        int countLanguage = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook){
                ProgrammingBook pb = (ProgrammingBook) book;
                if (pb.getLanguage().equals("Java")) {
                    countLanguage++;
                }
            }
        }
        System.out.println("Total Book language is Java: " + countLanguage + " Book");

        int countCategory = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fb = (FictionBook) book;
                if (fb.getCategory().equals("Vien tuong 1")) {
                    countCategory++;
                }
            }
        }
            System.out.println("Total Book Category is Vien tuong 1: " + countCategory + " Book");

            int countPrice=0;
            for (Book book : books) {
                if(book.getPrice()<100&&book instanceof FictionBook) {
                    countPrice++;
                }
            }
            System.out.println("Total Book price is less than 100  " + countPrice + " Book");
    }
}