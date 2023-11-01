public class SandboxSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Tree tree1 = new Tree(1, new Tree(2, new Tree(5, new Tree(3, null, null), null), new Tree(9, null, null)),
                new Tree(7, new Tree(4, null, null), null));
        Tree tree2 = (new Tree(9, new Tree(9, new Tree(2, null, null), new Tree(9, null, null)),
                new Tree(5, new Tree(9, new Tree(5, new Tree(9, null, null), null), new Tree(9, null, null)),
                        new Tree(9, null, null))));
        System.out.println("Problem 1 answer: " + solution.solution(tree1));
        System.out.println("Problem 2 answer: " + solution.solution(tree2));
    }
}
