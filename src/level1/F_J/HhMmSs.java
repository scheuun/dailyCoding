package level1.F_J;

public class HhMmSs {
    public String solution(String A, String B) {
        int s = Integer.parseInt(B) % 60;
        int m = Integer.parseInt(B) / 60;

        String hh = A.substring(0, 2);
        String mm = A.substring(2, 4);
        String ss = A.substring(4, 6);

        if (Integer.parseInt(ss) + s >= 60) {
            ss = Integer.toString(Integer.parseInt(ss) + s - 60);
            m += 1;
        } else ss = Integer.toString(Integer.parseInt(ss) + s);

        if (Integer.parseInt(mm) + m >= 60) {
            mm = 0 + Integer.toString(Integer.parseInt(mm) + m - 60);
            hh = Integer.toString(Integer.parseInt(hh) + 1);
        } else mm = Integer.toString(Integer.parseInt(mm) + m);

        if (Integer.parseInt(hh) >= 24) {
            hh = 0 + Integer.toString(Integer.parseInt(hh) - 24);
        }

        return hh + mm + ss;
    }

    public static void main(String[] args) {
        HhMmSs hhMmSs = new HhMmSs();

        System.out.println(hhMmSs.solution("235030", "700"));
        System.out.println(hhMmSs.solution("115030", "700"));
        System.out.println(hhMmSs.solution("115030", "70"));
        System.out.println(hhMmSs.solution("115030", "7"));
    }
}
