public class SandboxSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Tree tree = new Tree(1, new Tree(2, new Tree(5, new Tree(3, null, null), new Tree(9, null, null)), null),
                new Tree(7, new Tree(4, null, null), null));
        System.out.println(solution.solution(tree));
    }
}
