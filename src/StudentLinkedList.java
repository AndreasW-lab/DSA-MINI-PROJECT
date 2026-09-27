public class StudentLinkedList {

    private StudentNode head;

    public StudentLinkedList() {
        head = null;
    }

    
    public void insertAtBeginning(Student student) {

        StudentNode newNode = new StudentNode(student);

        newNode.next = head;
        head = newNode;

        System.out.println(student.name + " inserted at the beginning.");
    }

    
    public void insertAtEnd(Student student) {

        StudentNode newNode = new StudentNode(student);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println(student.name + " inserted at the end.");
    }

    
    public void insertAtPosition(Student student, int position) {

        if (position <= 1) {
            insertAtBeginning(student);
            return;
        }

        StudentNode newNode = new StudentNode(student);
        StudentNode current = head;

        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println(
            student.name + " inserted at position " + position + "."
        );
    }

    
    public Student searchStudent(String studentNumber) {

        StudentNode current = head;

        while (current != null) {

            if (current.data.studentNumber.equals(studentNumber)) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    
    public void deleteStudent(String studentNumber) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        
        if (head.data.studentNumber.equals(studentNumber)) {

            System.out.println(head.data.name + " deleted.");

            head = head.next;
            return;
        }

        StudentNode current = head;

        while (current.next != null &&
               !current.next.data.studentNumber.equals(studentNumber)) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println(current.next.data.name + " deleted.");

        current.next = current.next.next;
    }

    
    public void displayStudents() {

        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        StudentNode current = head;

        System.out.println("\n--- STUDENT SERVICE RECORDS ---");

        while (current != null) {

            current.data.displayStudent();

            current = current.next;
        }
    }
}