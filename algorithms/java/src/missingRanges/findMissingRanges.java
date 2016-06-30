public List<String> findMissingRanges(int[] vals, int start, int end) {
    List<String> range = new ArrayList<>()
    if (vals.length == 0) {
        range.add(getRange(start, end));
        return range;
    }
    int prev = start - 1;
    for (int i = 0; i <= vals.length; i ++) {
        int curr = (i == vals.length)? end + 1 : vals[i];
        if (curr - prev >= 2) {
            range.add(getRange(prev + 1, curr - 1));
        }
        prev = curr;
    }
    return range;
}

private String getRange(int from, int to) {
    return (from == to)? String.valueOf(from): from + "->" + to;
}