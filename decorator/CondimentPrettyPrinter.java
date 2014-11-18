import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CondimentPrettyPrinter {
	public static void print(Beverage b) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		ArrayList<String> list = b.getDescription();
		for (int i = 1; i < list.size(); i++) {
			String s = list.get(i);
			if (m.containsKey(s)) {
				m.put(s, m.get(s)+1);
			} else {
				m.put(s, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.get(0));
		for (Map.Entry<String, Integer> entry: m.entrySet()) {
			if (entry.getKey().equals(list.get(0)))
				continue;
			if (entry.getValue() == 2) {
				sb.append(", Double ");
				sb.append(entry.getKey());
			} else {
				for (int i = 0; i < entry.getValue(); i++)
					sb.append(", " + entry.getKey());
			}
		}
		System.out.println(sb.toString());
	}
}
