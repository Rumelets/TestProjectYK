package gpt_practice;

public class Contact {
//    private Long contactId;
    private String firstname;
    private String lastname;
    private String email;
    private long number;

    public Contact(/*Long contactId, */String firstname, String lastname, String email, long number) {
  //      this.contactId = contactId;
        this.firstname = firstname;
        this.lastname = lastname;
        while(!email.contains("@")||!email.contains(".")){
            System.out.println("Email должно содержать @ и .");
        }
        this.email = email;
        this.number = number;
    }
 /*   public Long getContacId(){
        return contactId;
    }
    public void setContactId(Long contactId){
        this.contactId = contactId;
    }
    */
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        while(!email.contains("@")||!email.contains(".")){
            System.out.println("Email должно содержать @ и .");
        }
        this.email = email;
    }
    public long getNumber(){
        return number;
    }
    public void setNumber(long number){
        this.number = number;
    }
}
