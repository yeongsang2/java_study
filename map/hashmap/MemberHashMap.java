package map.hashmap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        this.hashMap = new HashMap<Integer, Member>();

    }

    public void addMember(Member member){ //hashMap.put
        hashMap.put(member.getMemberId(), member ); // key - value 쌍
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }else return false;

    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); //haspmap 에 keyset 에 iterateer()
        while(ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member.getMemberName());
        }
        System.out.println( );
    }



}
