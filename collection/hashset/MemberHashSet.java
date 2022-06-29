package collection.hashset;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet(){
        this.hashSet = new HashSet<Member>();

    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember(){
        for(Member m : hashSet){
            System.out.println(m.getMemberName());
        }
        System.out.println( );
    }


}
