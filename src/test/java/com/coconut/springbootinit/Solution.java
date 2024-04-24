package com.coconut.springbootinit;

import io.swagger.models.auth.In;

import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class Solution {
    public class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;


        TreeNode() {
        }


        TreeNode(int val) {
            this.val = val;
        }


        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        back(n,k,1);
        return res;
    }

    private void back(int n, int k, int cur) {
        if(list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(cur);
        for(int i=cur+1; i<=n;i++) {
            back(n,k,i);
            list.remove(list.size()-1);
        }
    }
}
