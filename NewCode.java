public static void main(String args[]) {
    int branchVar = 1;
    System.out.println("New file!")

    for (int i = 0; i < 4; i++) {
        System.out.println("This file is cool.")
    }

    int branchLoop = 10;
    while (branchLoop > 0) {
        System.out.println("This is the new loop, 
            only in the branch.");
        branchLoop--;
        branchVar *= 2;
    }

    if (branchVar > 12) {
        System.out.println("This is a large branch
            variable.");
    } else {
        System.out.println("This is a smaller branch
            variables.");
    }
}