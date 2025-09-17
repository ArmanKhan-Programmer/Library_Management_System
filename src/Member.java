public class Member {
    private String name;
    private String memberID;
    private String contact;

    public Member(String name, String memberID, String contact) {
        this.name = name;
        this.memberID = memberID;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return this.memberID;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString(){
        return name+" | ID:"+memberID+" | Contact: "+contact;
    }
}
