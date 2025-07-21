class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> previousList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        previousList.add(1);
        result.add(previousList);

        

        while(result.size()<numRows){
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);

            for(int i=1; i<previousList.size(); i++){
                currentList.add(previousList.get(i)+previousList.get(i-1));
            }

            currentList.add(1);

            result.add(currentList);

            previousList = currentList;
        }

        return result;
    }
}