public class PenDistribute {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        System.out.println("The pen per student is " + (totalPens / students)
                + " and the remaining pen not distributed is " + (totalPens % students));
    }
}
