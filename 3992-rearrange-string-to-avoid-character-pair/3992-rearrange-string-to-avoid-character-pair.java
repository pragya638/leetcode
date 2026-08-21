class Solution {
    public String rearrangeString(String s, char x, char y) {
        String yPart = "";
String middle = "";
String xPart = "";

for(int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if(ch == y) {
        yPart += ch;
    }
    else if(ch == x) {
        xPart += ch;
    }
    else {
        middle += ch;
    }
}

return yPart + middle + xPart;
    }
}