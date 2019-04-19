package packagefirst;

public class operations {
	
	public String GetBinarySum(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int sum = left + right;
        return Integer.toBinaryString(sum);
    }

    public String GetBinaryDiff(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int diff = left - right;
        return Integer.toBinaryString(diff);
    }

    public String GetBinaryProd(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int prod = left * right;
        return Integer.toBinaryString(prod);
    }

    public String GetBinaryQuotient(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int quotient = left / right;
        return Integer.toBinaryString(quotient);
    }
}

