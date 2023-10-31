
public class Solution {

    public Solution() {
    }

    public int solution(Tree T) {
        int counter = 0;

        // start at 1st level, 1/3 complete

        // check 2nd level left
        if (T.l != null) {
            // 2/3 complete

            // check 3rd level left
            if (T.l.l != null) {
                // 3/3 complete
                counter++;
                // check 4th level left
                if (T.l.l.l != null) {
                    // another possible combination
                    counter++;
                }
                // check 4th level right
                if (T.l.l.r != null) {
                    // another possible combination
                    counter++;
                }
            }
            // check 3rd level right
            if (T.l.r != null) {
                // 3/3 complete
                counter++;
                // check 4th level left
                if (T.l.r.l != null) {
                    // another possible combination
                    counter++;
                }
                // check 4th level right
                if (T.l.r.r != null) {
                    // another possible combination
                    counter++;
                }
            }
        }

        // check 2nd level right
        if (T.r != null) {
            // 2/3 complete

            // check 3rd level left
            if (T.r.l != null) {
                // 3/3 complete
                counter++;
                // check 4th level left
                if (T.r.l.l != null) {
                    // another possible combination
                    counter++;
                }
                // check 4th level right
                if (T.r.l.r != null) {
                    // another possible combination
                    counter++;
                }
            }
            // check 3rd level right
            if (T.r.r != null) {
                counter++;
                // check 4th level left
                if (T.r.r.l != null) {
                    // another possible combination
                    counter++;
                }
                // check 4th level right
                if (T.r.r.r != null) {
                    // another possible combination
                    counter++;
                }
            }
        }

        return counter;

    }
}
