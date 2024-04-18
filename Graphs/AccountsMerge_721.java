package Graphs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int root = findUPar(parent.get(node));
        parent.set(node, root);
        return root;
    }

    public void unionByRank(int u, int v) {
        int rootU = findUPar(u);
        int rootV = findUPar(v);
        if (rootU == rootV) return;
        if (rank.get(rootU) < rank.get(rootV)) {
            parent.set(rootU, rootV);
        } else if (rank.get(rootV) < rank.get(rootU)) {
            parent.set(rootV, rootU);
        } else {
            parent.set(rootV, rootU);
            rank.set(rootU, rank.get(rootU) + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int rootU = findUPar(u);
        int rootV = findUPar(v);
        if (rootU == rootV) return;
        if (size.get(rootU) < size.get(rootV)) {
            parent.set(rootU, rootV);
            size.set(rootV, size.get(rootV) + size.get(rootU));
        } else {
            parent.set(rootV, rootU);
            size.set(rootU, size.get(rootU) + size.get(rootV));
        }
    }
}
public class AccountsMerge_721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        DisjointSet ds = new DisjointSet(n);
        HashMap<String, Integer> emailToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, i);
                } else {
                    ds.unionBySize(i, emailToIndex.get(email));
                }
            }
        }

        Map<Integer, List<String>> indexToEmails = new HashMap<>();
        for (Map.Entry<String, Integer> entry : emailToIndex.entrySet()) {
            String email = entry.getKey();
            int index = ds.findUPar(entry.getValue());
            indexToEmails.computeIfAbsent(index, x -> new ArrayList<>()).add(email);
        }

        List<List<String>> mergedAccounts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (indexToEmails.containsKey(i)) {
                List<String> emails = indexToEmails.get(i);
                Collections.sort(emails);
                List<String> account = new ArrayList<>();
                account.add(accounts.get(i).get(0));
                account.addAll(emails);
                mergedAccounts.add(account);
            }
        }
        return mergedAccounts;
    }
}
