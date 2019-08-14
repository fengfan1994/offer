package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] p = path.split("/");
        for (String t : p) {
            if (!s.isEmpty() && t.equals("..")) {
                s.pop();
            } else if (!t.equals(".") && !t.equals("") && !t.equals("..")) {
                s.push(t);
            }
        }
        List<String> list = new ArrayList<>(s);
        return "/" + String.join("/", list);
    }
}
