package 챕터6.templateCallbackPattern;

public class refactoringClient {
    public static void main(String[] args) {
        RefacoringSoldier rambo = new RefacoringSoldier();

        rambo.runContext("총! 초초초총!");

        System.out.println();

        rambo.runContext("칼! 카카카칼!");

        System.out.println();

        rambo.runContext("도끼! 슈슈슉");
    }
}
