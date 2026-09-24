public class StudentQueue {

    private Student[] queue;
    private int front;
    private int rear;
    private int size;

    public StudentQueue(int capacity) {
        queue = new Student[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Student student) {

        if (size == queue.length) {
            System.out.println("Queue is full.");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = student;
        size++;

        System.out.println(student.name + " joined the waiting queue.");
    }

    public Student dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        Student student = queue[front];
        queue[front] = null;

        front = (front + 1) % queue.length;
        size--;

        return student;
    }

    
    public Student peek() {

        if (isEmpty()) {
            return null;
        }

        return queue[front];
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public void displayQueue() {

        if (isEmpty()) {
            System.out.println("Waiting queue is empty.");
            return;
        }

        System.out.println("\n--- WAITING QUEUE ---");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % queue.length;

            System.out.print((i + 1) + ". ");
            queue[index].displayStudent();
        }
    }
}