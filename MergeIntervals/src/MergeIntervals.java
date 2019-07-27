import java.util.*;
class Interval{
	int start;
	int end;
	
	Interval(){
		start = 0;
		end = 0;
	}
	Interval(int s, int e){
		start = s;
		end = e;
	}
}
public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals){
		List<Interval> result = new ArrayList<>();
		
		if(Interval.size()==0)
			return result;
		
		Collections.sort(intervals, new Comparator<Interval>(){
			@Override
			public int compare(Interval l1, Interval l2){
				if(l1.start!=l2.start)
					return (l1.start - l2.start);
				else
					return (l1.end - l2.end);
			}
		});
		
		Interval pre = intervals.get(0);
		for(int i=0; i<intervals.size(); i++){
			Interval current = intervals.get(i);
			if(pre.end >= current.start){
				Interval merged = new Interval(pre.start, Math.max(pre.end, current.end));
				pre = merged;
			}
			else{
				result.add(pre);
				pre = current;
			}
		}
		result.add(pre);
		return result;
	}
	public static void main(){
		
	}
}
