package array;

public class array_2 {

	public static void main(String[] args) {

		
		String[] members = { "������", "������", "���̶�" };
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "�� ����� �޾ҽ��ϴ�");
        }
        for (String e : members) {
            System.out.println(e + "�� ����� �޾ҽ��ϴ�");
        }

    }


}


