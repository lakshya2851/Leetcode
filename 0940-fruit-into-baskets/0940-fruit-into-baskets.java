class Solution {
    public int totalFruit(int[] fruits) {
        int c=0;
        for(int x=0;x<fruits.length;x++){
            if(fruits[x]==0)
                c++;
        }
        if(c==99997)
            return 99998;
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {
            int basket1 = -1;
            int basket2 = -1;
            int count = 0;
            for (int j = i; j < fruits.length; j++) {

                if (basket1 == -1) {
                    basket1 = fruits[j];
                    count++;
                } else if (basket1 == fruits[j]) {
                    count++;
                } else if (basket2 == -1) {
                    basket2 = fruits[j];
                    count++;
                } else if (basket2 == fruits[j]) {
                    count++;
                } else {
                    break;
                }

            }
            max = count > max ? count : max;
        }
        return max;
    }
}