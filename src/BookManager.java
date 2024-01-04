public class BookManager {


    BookDTO[] barr = new BookDTO[3];{
        barr[0] = new BookDTO();
        barr[1] = new BookDTO();
        barr[2] = new BookDTO();
    }

    int i =0;




    public void addBook(BookDTO book){
        barr[i] = book;
        ++i;
    }

    public void deleteBook(int i){

        barr[i]= null;
        --this.i;

    }

//    public int searchBook(String bTitle) {
//
//    }

    public void printBook(int index){



    }

    public void displayAll() {

       for(BookDTO arr : barr){

            if(arr==null)
            {
                System.out.println("-------출력완료----------");
                break;}

           System.out.println(arr.toString());
       }



    }

//    public BookDTO[] sortedBookList(int select){
//
//
//    }

    public void printBookList(BookDTO[] br){



    }













}
