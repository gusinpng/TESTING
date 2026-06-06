public class Member {

    private String nama;
    private String noHp;
    private String email;

    public Member(String nama, String noHp, String email) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }
}