import java.util.*;
import java.util.regex.*;
class PG_17686 {
    public String[] solution(String[] files) {
        String regex = "^([^0-9]+)([0-9]{1,5}).*$";
        Pattern p = Pattern.compile(regex);
        Arrays.sort(files, (s1, s2) -> {
            Matcher m1 = p.matcher(s1);
            Matcher m2 = p.matcher(s2);
            m1.find(); m2.find();
            String h1 = m1.group(1).toLowerCase();
            String h2 = m2.group(1).toLowerCase();
            int hCompare = h1.compareTo(h2);
            if(hCompare !=0) return hCompare;

            int n1 = Integer.parseInt(m1.group(2));
            int n2 = Integer.parseInt(m2.group(2));
            return n1 - n2;
        });
        return files;
    }
}