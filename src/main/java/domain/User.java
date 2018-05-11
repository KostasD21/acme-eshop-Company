package domain;


public class User {

    //Unique id for each domain (DATABASE) //
    // private Long Id;
   private Long userId;
   private String userName;
   private String password;
   private String name;
   private String surname;
   private String email;
   private String phoneNumber;
   private String adress;
   private String postCode;
   // AFTO TO ATTRIBUTE EINAI ENUM //
   private String role;


   public User (){}

   public User(Long userId, String userName, String password,
               String name, String surname, String email,
               String phoneNumber, String adress, String postCode, String role) {
      this.userId = userId;
      this.userName = userName;
      this.password = password;
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.adress = adress;
      this.postCode = postCode;
      this.role = role;
   }

   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getAdress() {
      return adress;
   }

   public void setAdress(String adress) {
      this.adress = adress;
   }

   public String getPostCode() {
      return postCode;
   }

   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }
}
