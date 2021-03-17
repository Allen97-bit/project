package maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin2 extends BaseClass  {
	public Adactin2() {
PageFactory.initElements(driver, this);	
	}
@FindBy(id="first_name")
private WebElement txtFirst;
@FindBy(id="last_name")
private WebElement txtLast;
@FindBy(id="address")
private WebElement txtAddress;
@FindBy(id="cc_num")
private WebElement txtCard;
@FindBy(id="cc_type")
private WebElement lnkCard;
@FindBy(id="cc_exp_month")
private WebElement lnkMonth;
@FindBy(id="cc_exp_year")
private WebElement lnkYear;
@FindBy(id="cc_cvv")
private WebElement txtYear;
@FindBy(id="book_now")
private WebElement btnBook;
public WebElement getBtnBook() {
	return btnBook;
}
public WebElement getTxtFirst() {
	return txtFirst;
}
public WebElement getTxtLast() {
	return txtLast;
}
public WebElement getTxtAddress() {
	return txtAddress;
}
public WebElement getTxtCard() {
	return txtCard;
}
public WebElement getLnkCard() {
	return lnkCard;
}
public WebElement getLnkMonth() {
	return lnkMonth;
}
public WebElement getLnkYear() {
	return lnkYear;
}
public WebElement getTxtYear() {
	return txtYear;
}








}
