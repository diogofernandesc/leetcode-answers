// This solution is O(n^2)
class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}

// Solution o(n) with HashMap
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int foundIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2)) {
                foundIndex = map.get(arr[i] * 2);

            } else if (map.containsKey(arr[i])) {
                foundIndex = map.get(arr[i]);

            } else if (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2)) {
                foundIndex = map.get(arr[i] / 2);

            } else {
                map.put(arr[i], i);
            }

            if (foundIndex != -1 && foundIndex != i) {
                // Also handling edge case of [0,0]
                if (arr[foundIndex] != arr[i] || arr[i] == 0 && arr[foundIndex] == 0) {
                    return true;
                }
                foundIndex = -1;
            }


        }
        return false;



    }
}
// Best leetcode solution:
 public boolean checkIfExist(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    for (int i : arr) {
        if (seen.contains(2 * i) || i % 2 == 0 && seen.contains(i / 2))
            return true;
        seen.add(i);
    }
    return false;
 }
