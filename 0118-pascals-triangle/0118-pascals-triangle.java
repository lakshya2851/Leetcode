class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows >= 1) {
            list.add(new ArrayList<>(Arrays.asList(1)));
        }
        
        if (numRows >= 2) {
            list.add(new ArrayList<>(Arrays.asList(1, 1)));
        }

        for(int i=2; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> stored = list.get(list.size()-1);

            for(int j=0; j<=i; j++) {
                if(j == 0) {
                    temp.add(stored.get(0));
                }
                else if(j == i) {
                    temp.add(stored.get(stored.size()-1));
                }
                else {
                    temp.add(stored.get(j-1) + stored.get(j));
                }
            }
            list.add(new ArrayList(temp));
        }

        return list;
    }
}