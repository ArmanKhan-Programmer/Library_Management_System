import java.util.Scanner;

public class Main_Menu {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("\t1. Add Books ");
            System.out.println("\t2. Add Member ");
            System.out.println("\t3. Display Books ");
            System.out.println("\t4. Display Members ");
            System.out.println("\t5. Issue Books ");
            System.out.println("\t6. Display Issued Books ");
            System.out.println("\t7. Return Books");
            System.out.println("\t0. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Title of the Book : ");
                    String title = input.nextLine();
                    System.out.println("Enter Author of the Book :");
                    String author = input.nextLine();
                    System.out.println("Enter ISBN Code : ");
                    String isbn = input.nextLine();
                    System.out.println("Enter Quantity of the Book : ");
                    int qty = input.nextInt();
                    input.nextLine();
                    library.addBooks(new Book(title, author, isbn, qty));
                    break;

                case 2:
                    System.out.println("Enter Name of the Member : ");
                    String name = input.nextLine();
                    System.out.println("Enter Member's ID : ");
                    String memberID = input.nextLine();
                    System.out.println("Enter Contact Number : ");
                    String contact = input.nextLine();
                    library.addMember(new Member(name, memberID, contact));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayMembers();
                    break;

                case 5:
                    System.out.println("Enter Member's ID : ");
                    memberID = input.nextLine();
                    System.out.println("Enter ISBN to issue : ");
                    isbn = input.nextLine();
                    library.issueBook(memberID,isbn);
                    break;

                case 6:
                    library.displayIssuedBooks();
                    break;

                case 7:
                    System.out.println("Enter ISBN to return: ");
                    isbn = input.nextLine();
                    System.out.println("Enter Member's ID: ");
                    memberID = input.nextLine();
                    library.returnBook(memberID,isbn);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice !!!");
            }

        }while (choice != 0) ;
    }
}
