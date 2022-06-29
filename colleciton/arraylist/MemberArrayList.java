package colleciton.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){


        for(int i=0; i<=arrayList.size(); i++){
            Member member = arrayList.get(i);
            if(member.getMemberId() == memberId){
                arrayList.remove(i);
            }
        }


        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next(); //다음 회원 member
            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }
    public void showAllMember(){
        for(Member member: arrayList){
            System.out.println(member.getMemberName());
        }
    }
}
