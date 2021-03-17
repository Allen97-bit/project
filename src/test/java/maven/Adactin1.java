package maven;

public class Adactin1  extends  BaseClass{

	public static void main(String[] args) {
browserConfig();
openBrowser("http://adactinhotelapp.com/");
maximizeWindow();
AdactinPOM a = new AdactinPOM();
type(a.getTxtUserName(), "harishdurai123");
type(a.getTxtPassword(), "12345678909");
click(a.getBtnLogin());
AdactinPOM1 b= new AdactinPOM1();
selectByIndex(b.getLnkLocation(), 3);
selectByIndex(b.getLnkHotels(), 2);
selectByIndex(b.getLnkRoom(), 2);
selectByIndex(b.getLnkRoomNUmber(), 2);
selectByIndex(b.getLnkNumber(), 1);
selectByIndex(b.getLnkNumber1(), 2);
click(b.getBtnSubmit());
click(b.getBtnClick1());
click(b.getBtnSubmit1());
Adactin2 c = new Adactin2();
type(c.getTxtFirst(), "Allen");
type(c.getTxtLast(), "Akash");
type(c.getTxtAddress(), "Greens,Omr");
type(c.getTxtCard(), "6574675435438765");
selectByIndex(c.getLnkCard(), 2);
selectByIndex(c.getLnkMonth(), 7);
selectByIndex(c.getLnkYear(), 12);
type(c.getTxtYear(), "456");
click(c.getBtnBook());
		
		
		
	}

}
