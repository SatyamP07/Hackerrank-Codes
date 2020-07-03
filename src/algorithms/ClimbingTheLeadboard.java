package algorithms;

public class ClimbingTheLeadboard {

	public static void main(String[] args) {
		int[] scores = { 1 };
		int[] alice = { 1, 1 };
		int[] ranks = climbingLeaderboard(scores, alice);
		for (int r : ranks)
			System.out.println("R is " + r);
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] ranks = new int[alice.length];
		for (int i = 0; i < alice.length; i++) {
			int curRank = 1;
			int lastScore = scores[0];
			if (scores.length == 1) {
				if(alice[i] >= scores[0])
					ranks[i] = curRank;
				else
					ranks[i] = curRank + 1;
			} else {
				for (int j = 1; j < scores.length; j++) {
					if (alice[i] >= lastScore) {
						ranks[i] = curRank;
						break;
					}
					if (lastScore != scores[j]) {
						lastScore = scores[j];
						curRank++;
					}
					if (j == scores.length - 1) {
						if (alice[i] >= lastScore) {
							ranks[i] = curRank;
						} else
							ranks[i] = curRank + 1;
					}
				}
			}
		}
		return ranks;
	}
}
