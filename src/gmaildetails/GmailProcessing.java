package gmaildetails;

public class GmailProcessing {
    public void Login() {
        ToAccount ta=new ToAccount();
        GmailLogin gmailLogin=new GmailLogin();
         String userName="sravania2002@gmail.com";
         String password="Sravs@14";

        if (userName.equals(gmailLogin.userName)&&password.equals(gmailLogin.password)) {
             ta.inbox=gmailLogin.message;
            System.out.println(ta.inbox);
        }
        else
        {
            System.out.println("invalid");
        }

    }

}
