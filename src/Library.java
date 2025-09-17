import java.util.ArrayList;

public class Library implements Searchable{
    private ArrayList<Book>books = new ArrayList<>();
    private ArrayList<Member>members = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addBooks(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    @Override
    public Book searchByTitle(String title) {
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    @Override
    public Book searchByISBN(String isbn) {
        for (Book book: books){
            if (book.getIsbn().trim().equalsIgnoreCase(isbn.trim())){
                return book;
            }
        }
        return null;
    }

    public Member searchMemberById(String memberID){
        for (Member member : members){
            if (member.getMemberID().trim().equals(memberID.trim())){
                return member;
            }
        }
        return null;
    }

    public void issueBook(String memberID, String isbn){

        System.out.println("[DEBUG] Searching for Member ID: '" + memberID + "'");
        System.out.println("[DEBUG] Searching for ISBN: '" + isbn + "'");

        Member member = searchMemberById(memberID);
        Book book = searchByISBN(isbn);

        if (book ==  null){
            System.out.println("Book Not Found...");
        } else if (member==null) {
            System.out.println("Member Not Found...");
        } else if (book.getQuantity()<=0) {
            System.out.println("Book Not Available...");
        }else {
            book.setQuantity(book.getQuantity()-1);
            transactions.add(new Transaction(member,book));
            System.out.println("Book issued: "+book.getTitle()+" |Issued to:  "+member.getName());
        }
    }

    public void returnBook(String memberId, String isbn){
//        Book book = searchByISBN(isbn);
        Transaction toRemove = null;

        for (Transaction t :  transactions){
            if (t.getBook().getIsbn().equals(isbn) && t.getMember().getMemberID().equals(memberId)){
                toRemove = t;
                break;
            }
        }

        if (toRemove != null){
            Book book = toRemove.getBook();
            book.setQuantity(book.getQuantity()+1);
            transactions.remove(toRemove);
            System.out.println("Book returned: "+book.getTitle() + " by "+toRemove.getMember().getName());
        }else {
            System.out.println("No such transaction found.");
        }
    }

    public void displayBooks(){
        System.out.println("Books in Library:");
        for (Book book : books){
            System.out.println(book);
        }
    }

    public void displayMembers(){
        System.out.println("Library Members:");
        for (Member member: members){
            System.out.println(member);
        }
    }

    public void displayIssuedBooks(){
        System.out.println("Issued Books: ");
        if (transactions.isEmpty()){
            System.out.println("No books are currently issued.");
        }else {
            for (Transaction t : transactions){
                System.out.println(t);
            }
        }
    }

}

