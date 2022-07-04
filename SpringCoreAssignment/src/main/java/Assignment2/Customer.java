package Assignment2;



public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	public void disp()
	{
		System.out.println("Customer id is: "+this.customerId);
		System.out.println("Customer Name is: "+ this.customerName);
		System.out.println("Customer Contact is: "+this.customerContact);
		System.out.println("Customer Address is: "+this.customerAddress);
	}

}

