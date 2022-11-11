import java.util.Arrays;

@SuppressWarnings("unused")
public class ProductForm {
	private String productId;
	private String productName;
	private String productIntroduction;
	private String productClasses;
	private String productSellPrice;
	private String productOrderPrice;
	private String[] sellersShopName;
	private String addedYear;
	private String addedMonth;
	private String addedDay;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductIntroduction() {
		return productIntroduction;
	}
	public void setProductIntroduction(String productIntroduction) {
		this.productIntroduction = productIntroduction;
	}
	public String getProductClasses() {
		return productClasses;
	}
	public void setProductClasses(String productClasses) {
		this.productClasses = productClasses;
	}
	public String getProductSellPrice() {
		return productSellPrice;
	}
	public void setProductSellPrice(String productSellPrice) {
		this.productSellPrice = productSellPrice;
	}
	public String getProductOrderPrice() {
		return productOrderPrice;
	}
	public void setProductOrderPrice(String productOrderPrice) {
		this.productOrderPrice = productOrderPrice;
	}
	public String[] getSellersShopName() {
		return sellersShopName;
	}
	public void setSellersShopName(String[] sellersShopName) {
		this.sellersShopName = sellersShopName;
	}
	public String getAddedYear() {
		return addedYear;
	}
	public void setAddedYear(String addedYear) {
		this.addedYear = addedYear;
	}
	public String getAddedMonth() {
		return addedMonth;
	}
	public void setAddedMonth(String addedMonth) {
		this.addedMonth = addedMonth;
	}
	public String getAddedDay() {
		return addedDay;
	}
	public void setAddedDay(String addedDay) {
		this.addedDay = addedDay;
	}
	public String getAddedDate() {
		return getAddedYear() + "年"
				+ getAddedMonth() + "月"
				+ getAddedDay() + "日";
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductForm [productId=").append(productId)
		.append(", productName=").append(productName)
		.append(", productIntroduction=").append(productIntroduction)
		.append(", productClasses=").append(productClasses)
		.append(", productSellPrice=").append(productSellPrice)
		.append(", productOrderPrice=").append(productOrderPrice)
		.append(", sellersShopName=").append(Arrays.toString(sellersShopName))
		.append(", addedYear=").append(addedYear)
		.append(", addedMonth=").append(addedMonth)
		.append(", addedDay=").append(addedDay).append("]");
		return builder.toString();
	}
	
	
	
}
