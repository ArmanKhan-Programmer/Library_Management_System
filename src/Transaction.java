public class Transaction {
    private Member member;
    private Book book;

    public Transaction(Member member, Book book) {
        this.member = member;
        this.book = book;
    }

    public Member getMember(){
        return member;
    }
    public Book getBook(){
        return book;
    }

    @Override
    public String toString(){
        return "Book: "+book.getTitle()+
                " by "+book.getAuthor()+
                " | ISBN: "+book.getIsbn()+
                " | Issued to: "+member.getName()+
                " (ID:"+member.getMemberID()+")";
    }
}
