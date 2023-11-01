import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> comboList;

    public Solution() {
        this.comboList = new ArrayList<>();
    }

    public int solution(Tree tree) {
        this.comboList.clear();
        checkAllNodes(tree);
        return this.comboList.size();
    }

    private void checkAllNodes(Tree tree) {
        if (tree != null) {
            checkNextTwoNodes(tree);
            if (tree.l != null) {
                checkAllNodes(tree.l);
            }
            if (tree.r != null) {
                checkAllNodes(tree.r);
            }
        }
    }

    private void checkNextTwoNodes(Tree tree) {
        StringBuffer sb = new StringBuffer();
        // append 1 of 3 digits
        sb.append(tree.x);

        if (tree.l != null) {
            // append 2 of 3 digits
            sb.append(tree.l.x);

            if (tree.l.l != null) {
                // append 3 of 3 digits
                sb.append(tree.l.l.x);
                verifyUniqueCombo(sb.toString());
            }

            if (tree.l.r != null) {
                secondSublevelRightNode(tree.l.r, sb);
            }

        }

        if (tree.r != null) {
            // reset sb back to first digit
            sb.delete(1, sb.length());
            // append 2 of 3 digits
            sb.append(tree.r.x);

            if (tree.r.l != null) {
                // append 3 of 3 digits
                sb.append(tree.r.l.x);
                verifyUniqueCombo(sb.toString());
            }

            if (tree.r.r != null) {
                // append 3 of 3 digits
                secondSublevelRightNode(tree.r.r, sb);
            }
        }

    }

    private void secondSublevelRightNode(Tree tree, StringBuffer sb) {

        if (sb.length() > 2) {
            sb.delete(2, sb.length());
        }

        sb.append(tree.x);
        verifyUniqueCombo(sb.toString());
    }

    private void verifyUniqueCombo(String combo) {
        if (!this.comboList.contains(combo)) {
            this.comboList.add(combo);
        }
    }
}
