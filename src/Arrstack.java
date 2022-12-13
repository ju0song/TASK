import java.util.Arrays;

public class Arrstack {
    int pointer =-1 ;
    int max =11;
    int[] stacks = new int[max];

    public void push(int data) {
        pointer++;
        stacks[pointer] = data;
        System.out.println(stacks[pointer]);

    }

    public void pop() {
        System.out.println(stacks[pointer--]);
    }

    public void peek() {
        System.out.println(stacks[pointer]);
    }

    public boolean empty() {
        if (pointer == -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        return false;
    }

    public void show () {
        for (int i = 0; i <= pointer; i++) {
            System.out.print(stacks[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrstack arrstack = new Arrstack();
        System.out.println("===스택이 비었냐===");
        arrstack.empty();
        System.out.println();

        System.out.println("===stack push===");
        for (int i = 0; i < 11; i++) {
            arrstack.push(i);
        }
        System.out.println("===현재 스택 상태===");
        arrstack.show();

        System.out.println("===stack pop ==");
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        System.out.println("===현재 스택 상태===");
        arrstack.show();

        System.out.println("===stack peek===");
        arrstack.peek();

        System.out.println("===stack pop ==");
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();
        arrstack.pop();

        System.out.println("===스택이 비었냐===");
        arrstack.empty();
    }
}
