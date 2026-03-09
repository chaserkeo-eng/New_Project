public static void main(String args[]) {
    System.out.println("New file!")

    for (int i = 0; i < 4; i++) {
        System.out.println("This file is cool.")
    }

    int branchLoop = 10;
    while (branchLoop > 0) {
        System.out.println("This is the new loop, 
            only in the branch.");
        branchLoop--;
    }
}