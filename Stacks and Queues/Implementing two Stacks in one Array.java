

class twoStacks {
    int[] arr;
    int size1;
    int size2;
    twoStacks() {
        arr = new int[200];
        size1 = 0;
        size2 = 0;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        arr[size1] = x;
        size1++;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        arr[200-size2-1] = x;
        size2++;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(size1 == 0) return -1;
        int a = arr[--size1];
        return a;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(size2 == 0) return -1;
        return arr[200-(--size2)-1];
    }
}
