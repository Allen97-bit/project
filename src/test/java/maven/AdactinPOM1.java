package maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPOM1 extends BaseClass {
	public AdactinPOM1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement lnkLocation;
	@FindBy(id = "hotels")
	private WebElement lnkHotels;
	@FindBy(id = "room_type")
	private WebElement lnkRoom;
	@FindBy(id = "room_nos")
	private WebElement lnkRoomNUmber;
	@FindBy(id = "adult_room")
	private WebElement lnkNumber;
	@FindBy(id = "child_room")
	private WebElement lnkNumber1;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(id = "radiobutton_0")
	private WebElement btnClick1;

	public WebElement getBtnClick1() {
		return btnClick1;
	}

	public WebElement getBtnSubmit1() {
		return btnSubmit1;
	}

	@FindBy(id = "continue")
	private WebElement btnSubmit1;

	public WebElement getLnkLocation() {
		return lnkLocation;
	}

	public WebElement getLnkHotels() {
		return lnkHotels;
	}

	public WebElement getLnkRoom() {
		return lnkRoom;
	}

	public WebElement getLnkRoomNUmber() {
		return lnkRoomNUmber;
	}

	public WebElement getLnkNumber() {
		return lnkNumber;
	}

	public WebElement getLnkNumber1() {
		return lnkNumber1;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
