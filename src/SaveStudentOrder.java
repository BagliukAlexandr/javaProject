public class SaveStudentOrder {
    public static void main(String[] args) {
//        byte a1;
//        short a2 = 12000;
//        int a3; // 4_b
//        long a4;
//
//        float d1;
//        double d2;
//
//        char r = 'f';
//
//        boolean isTrue = true;

        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        StudentOrder so1;
        so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Сидоров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Сидоров";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);

        return answer;
    }
}
