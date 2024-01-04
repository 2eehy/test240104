import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();


    public BookMenu() {}

    public void menu() {
        while (true) {
            int menu = 0;
            System.out.println("도서관리 프로그램 입니다.");
            System.out.println("1.책 추가 하기");
            System.out.println("2.책 삭제 하기");
            System.out.println("3.책 제목으로 검색 하기");
            System.out.println("4.책 정보 출력하기");
            System.out.println("5.전체 도서목록 출력하기");
            System.out.print("선택하실 메뉴번호를 입력해주세요 : ");
            menu=sc.nextInt();

            switch (menu){
                case 1 :bm.addBook(inputBook()); break;
                case 2 :
                    System.out.println("삭제하실 책의 번호를 입력해주세요 : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    bm.deleteBook(num-1); break;
                case 5 :bm.displayAll(); break;




            }

        }

    }

    public BookDTO inputBook() {


        System.out.println("도서분류코드를 입력해 주세요 :(1.인문), (2.자연과학), (3.의료), (4.기타) ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.println("도서 저자를 입력해 주세요 : ");
        String author = sc.nextLine();
        BookDTO book = new BookDTO(category,title,author);
        return book;


    }

    public String inputBookTitle() {
        System.out.println("검색하실 도서제목을 입력해주세요 : ");
        String title = sc.nextLine();
        return title;


    }









}
