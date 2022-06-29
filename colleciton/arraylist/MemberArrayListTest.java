package colleciton.arraylist;
import collection.Member;

public class MemberArrayListTest {

    public static void main(String[] args){
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "A");
        Member member2 = new Member(1002, "B");
        Member member3 = new Member(1003, "C");
        Member member4 = new Member(1004, "D");


        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);
        memberArrayList.removeMember(member1.getMemberId());

        memberArrayList.showAllMember();

    }
}
