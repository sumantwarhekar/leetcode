class Solution {
    public boolean squareIsWhite(String coordinates) {
        int givenNumber = coordinates.charAt(1);
        char givenCharacter = coordinates.charAt(0);
        if (givenNumber % 2 == 0) {
            switch (givenCharacter) {
                case 'a':
                case 'c':
                case 'e':
                case 'g':
                    return true;
            }
        } else {
            switch (givenCharacter) {
                case 'b':
                case 'd':
                case 'f':
                case 'h':
                    return true;
            }
        }
        return false;
    }
}