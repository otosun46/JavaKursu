/**
 * @Author:Otosun Tarih :27/07/2020
 */
package Gun46.task.task1;
/*
1. filedlari id,username,password, active(bolean), signedIn(bolean) olan bir class tanimlayiniz
2. Butun filedlari parametre alan bir constracture tanimlayiniz
3. Butun fieldlar icin geter seter metodlarini olusturunuz
4. UserMain isminde bir class olusturun
5. Kullanicidan 2 adet user bilgisi isteyerek bir Arrayliste doldurunuz
6. eger password 6 dan kucuk olursa yeniden useri girsin
passwordun 6 karakterden kucuk olup olmadigini classin icinde kontroledin


 */
public class User {
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;
    static int sayac=1;
    public User(String username, String password) {
        setId();
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);

    }

    public int getId() {

        return id;
    }

    public void setId() {
        this.id = sayac++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6)
            throw new RuntimeException("Password 6 karakterden az olamaz");
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
