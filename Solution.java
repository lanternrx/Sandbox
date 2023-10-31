
public class Solution {
    private int depthLimit;
    private int comboCount;

    public Solution(int depthLimit) {
        this.depthLimit = depthLimit;
        this.comboCount = 0;
    }

    public int solution(Tree tree) {
        checkNodes(tree, 0);
        return this.comboCount;
    }

    private void checkNodes(Tree tree, int level) {
        if (level <= depthLimit) {
            if (level > 1) {
                this.comboCount++;
            }
            if (tree.l != null) {
                checkNodes(tree.l, level + 1);
            }
            if (tree.r != null) {
                checkNodes(tree.r, level + 1);
            }
        }
    }
}
