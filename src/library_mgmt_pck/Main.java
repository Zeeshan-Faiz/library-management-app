package library_mgmt_pck;

import java.util.Scanner;

public class Main {

	static BookService service = new BookService();
	
	static void menu() {
		System.out.println("1. Add Book."
				+ "\n2. Show All Books."
				+ "\n3. Show Available Books."
				+ "\n4. Borrow Books."
				+ "\n5. Return Books"
				+ "\n6. Exit."
				);
	}
		
	public static void main(String[] arguments) {
			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome to Book Management Application******");
		boolean flag=true;
		
		do {
			menu();
			System.out.print("Please enter your choice:");
			int choice = sc.nextInt();		
			switch(choice) {
			
			case 1:
				service.addBook();
                break;
            case 2:
                service.showAllBooks();
                break;
            case 3:
                service.showAllAvailableBooks();
                break;
            case 4:
                service.borrowBook();
                break;
            case 5:
                service.returnBook();
                break;
			
			case 6:
				System.out.println("Thanks for using the Application!!!");
				flag=false;
				break;
			
			default:
				System.out.println("Please choose the correct option.");
				break;
				
			}
		}while(flag);
		
		}
}
