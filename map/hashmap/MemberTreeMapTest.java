package map.hashmap;

import collection.Member;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1, "A");
        Member member3 = new Member(3, "B");
        Member member2 = new Member(2, "C");
        Member member4 = new Member(4, "D");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();
    }
}
