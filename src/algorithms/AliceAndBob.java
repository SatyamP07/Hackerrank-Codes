package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AliceAndBob {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int alice = 0;
		int bob = 0;
		for(int i =0; i < 3; i++)
			if(a.get(i) > b.get(i))
				alice++;
			else
				if(b.get(i) > a.get(i))
					bob++;
		List<Integer> list = new ArrayList();
		list.add(alice);
		list.add(bob);
		return list;
	}
}
