// Assign cookies is same as the below the solution

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int j=0 , count=0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        for(int i=0; i<trainers.length; i++){
            if(j<players.length && players[j]<=trainers[i]){
                count++;
                j++;
            }
        }

        return count;
    }
}