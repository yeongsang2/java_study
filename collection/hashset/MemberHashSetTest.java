package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args){
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1,"A");
        Member member2 = new Member(2,"B");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);

        Member member3 = new Member(3,"C");
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();

    }
}
