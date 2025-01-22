package day11.morning;
//15번
public class MemberService {

    Member member;

    public MemberService(Member member) {
        this.member = member;
    }

    public boolean login(String id, String password){
        return member.getName().equals(id) && member.getPassword().equals(password);

    }
    public void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
