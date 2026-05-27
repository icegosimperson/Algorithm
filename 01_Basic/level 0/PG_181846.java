import java.math.*;
class PG_181846 {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        return numA.add(numB).toString();
    }
}