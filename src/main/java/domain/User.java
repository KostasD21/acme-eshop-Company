package domain;

/**
 * This domain class represents a user
 */
public class User {

    // private Long Id;
   /**
    * the user id
    */
   private Long id;
   private String username;
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

   /**
    *
    * @param id
    * @param username
    * @param password
    * @param name
    * @param surname
    * @param email
    * @param phoneNumber
    * @param adress
    * @param postCode
    * @param role
    */
   public User(Long id, String username, String password,
               String name, String surname, String email, String phoneNumber,
               String adress, String postCode, String role) {
      this.id = id;
      this.username = username;
      this.password = password;
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.adress = adress;
      this.postCode = postCode;
      this.role = role;
   }

   /**
    * this method gets the user id
    *
    * @return the unique id
    */
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   /**
    * {@link Order}
    */
   public String getusername() {
      return username;
   }

   public void setusername(String username) {
      this.username = username;
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
