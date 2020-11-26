package com.studyskymate.dinesh.corejava.leetcode.easy;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {

	public static int[]  intersect(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int i : nums2) {
			int count = map.getOrDefault(i, 0);
			if (count > 0) {
				list.add(i);
				map.put(i, count - 1);
			}
		}

		int[] result = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String... aa) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
	
		System.out.println(intersect(nums1,nums2));
	}
	
	
}
