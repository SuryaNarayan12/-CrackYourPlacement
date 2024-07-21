class Solution {
    
    String[] symbols = new String[3001];
    {
        symbols[0] = "";
        symbols[1] = "I";
        symbols[5] = "V";
        symbols[10] = "X";
        symbols[50] = "L";
        symbols[100] = "C";
        symbols[500] = "D";
        symbols[1000] = "M";
        symbols[2] = "II";
        symbols[3] = "III";
        symbols[4] = "IV";
        symbols[6] = "VI";
        symbols[7] = "VII";
        symbols[8] = "VIII";
        symbols[9] = "IX";
        symbols[20] = "XX";
        symbols[30] = "XXX";
        symbols[40] = "XL";
        symbols[60] = "LX";
        symbols[70] = "LXX";
        symbols[80] = "LXXX";
        symbols[90] = "XC";
        symbols[200] = "CC";
        symbols[300] = "CCC";
        symbols[400] = "CD";
        symbols[600] = "DC";
        symbols[700] = "DCC";
        symbols[800] = "DCCC";
        symbols[900] = "CM";
        symbols[2000] = "MM";
        symbols[3000] = "MMM";
    }
    public String intToRoman(int num) {
        String ans = "";
        int i = 0;
        while(num > 0){
            int cur = num % 10;
            String curString = getString(cur*((int)Math.pow(10,i)));
            ans = curString + ans;
            num = num / 10;
            i++;
        }
        return ans;
    }
     
    public String getString(int num){
        return symbols[num];
    }
}
