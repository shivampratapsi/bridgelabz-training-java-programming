public class AverageMarks {
    static float getAverageMarks(int maths, int physics, int chemistry, int total) {
        return ((float) (maths + physics + chemistry) / total) * 100;

    }

    public static void main(String[] args) {
        System.out.println("Average percent marks in PCM " + getAverageMarks(94, 95, 96, 300));
    }

}
