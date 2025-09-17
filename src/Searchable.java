public interface Searchable {
    Book searchByTitle(String title);
    Book searchByISBN(String isbn);
    public Member searchMemberById(String memberID);
}
