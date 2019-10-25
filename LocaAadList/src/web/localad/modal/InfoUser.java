package web.localad.modal;

public class InfoUser {
private String name;
private String email;
private String phone;
private String city;
private String postalcode;
private String description;
private String postingtitle;

public InfoUser(){

}

public InfoUser(String name, String email, String phone, String city, String postalcode, String description,
		String postingtitle) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.city = city;
	this.postalcode = postalcode;
	this.description = description;
	this.postingtitle = postingtitle;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPostalcode() {
	return postalcode;
}

public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPostingtitle() {
	return postingtitle;
}

public void setPostingtitle(String postingtitle) {
	this.postingtitle = postingtitle;
}




}
