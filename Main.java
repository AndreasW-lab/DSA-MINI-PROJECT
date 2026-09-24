public class Main {

    public static void main(String[] args) {

        StudentQueue waitingQueue = new StudentQueue(10);

        // Six students arrive
        Student s1 = new Student(
            "221045678", "Maria", "Registration", 12);

        Student s2 = new Student(
            "222034512", "Tomas", "Student Card", 5);

        Student s3 = new Student(
            "223041876", "Ndapewa", "Fees", 8);

        Student s4 = new Student(
            "221067341", "Simon", "Documents", 4);

        Student s5 = new Student(
            "224056789", "Anna", "Academic Enquiry", 10);

        Student s6 = new Student(
            "225078912", "John", "Registration", 7);

        waitingQueue.enqueue(s1);
        waitingQueue.enqueue(s2);
        waitingQueue.enqueue(s3);
        waitingQueue.enqueue(s4);
        waitingQueue.enqueue(s5);
        waitingQueue.enqueue(s6);

       Student nextStudent = waitingQueue.peek();

if (nextStudent != null) {
    System.out.println("\nNext student to be served: " + nextStudent.name);
}
        waitingQueue.displayQueue();

    
        System.out.println("\n--- SERVING STUDENTS ---");

        for (int i = 0; i < 3; i++) {

            Student servedStudent = waitingQueue.dequeue();

            if (servedStudent != null) {
                System.out.println(
                    "Now serving: " + servedStudent.name
                );
            }
        }

        
        waitingQueue.displayQueue();
       
        System.out.println("\n==============================");
        System.out.println("SINGLY LINKED LIST TEST");
        System.out.println("==============================");

        StudentLinkedList records = new StudentLinkedList();

        records.insertAtBeginning(s1);

        records.insertAtEnd(s2);
        records.insertAtEnd(s3);

        System.out.println("\nList after beginning and end insertions:");
        records.displayStudents();
        System.out.println("\n--- INSERT AT POSITION 2 ---");
        records.insertAtPosition(s5, 2);

        records.displayStudents();



        System.out.println("\n--- SEARCH STUDENT ---");

        Student foundStudent = records.searchStudent("222034512");

        if (foundStudent != null) {
            System.out.println("Student found:");
            foundStudent.displayStudent();
        } else {
            System.out.println("Student not found.");
        }
       

        System.out.println("\n--- DELETE STUDENT ---");

        records.deleteStudent("222034512");

        System.out.println("\nList after deletion:");
        records.displayStudents();

        System.out.println("\n==============================");
        System.out.println("POSTFIX STACK TEST");
        System.out.println("==============================");

        String expression = "5 3 + 2 *";

        double result = PostfixEvaluator.evaluate(expression);

        System.out.println("\nFinal Result: " + result);


        System.out.println("\n==============================");
        System.out.println("ARRAY DAILY STATISTICS TEST");
        System.out.println("==============================");

        int[] serviceTimes = {12, 5, 8, 4, 10, 7};

        DailyStatistics.displayStatistics(serviceTimes);


        System.out.println("\n==============================");
        System.out.println("SELECTION SORT TEST");
        System.out.println("==============================");

        int[] selectionArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

        System.out.print("Original Array: ");

        for (int i = 0; i < selectionArray.length; i++) {
            System.out.print(selectionArray[i] + " ");
        }

        System.out.println();

        
        SelectionSort.sort(selectionArray);

        System.out.print("Sorted Array: ");

        for (int i = 0; i < selectionArray.length; i++) {
            System.out.print(selectionArray[i] + " ");
        }

        System.out.println();

        System.out.println("\n==============================");
        System.out.println("INSERTION SORT TEST");
        System.out.println("==============================");

        int[] insertionArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

        System.out.print("Original Array: ");

        for (int i = 0; i < insertionArray.length; i++) {
            System.out.print(insertionArray[i] + " ");
        }

        System.out.println();

        InsertionSort.sort(insertionArray);

        System.out.print("Sorted Array: ");

        for (int i = 0; i < insertionArray.length; i++) {
            System.out.print(insertionArray[i] + " ");
        }

        System.out.println();

        System.out.println("\n==============================");
        System.out.println("MERGE SORT TEST");
        System.out.println("==============================");

        int[] mergeArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

        System.out.print("Original Array: ");

        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

        System.out.println();

        MergeSort.sort(mergeArray);

        System.out.print("Sorted Array: ");

        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

        System.out.println();

        System.out.println("\n==============================");
        System.out.println("QUICK SORT TEST");
        System.out.println("==============================");

        int[] quickArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

        System.out.print("Original Array: ");

        for (int i = 0; i < quickArray.length; i++) {
            System.out.print(quickArray[i] + " ");
        }

        System.out.println();

        QuickSort.sort(quickArray);

        System.out.print("Sorted Array: ");

        for (int i = 0; i < quickArray.length; i++) {
            System.out.print(quickArray[i] + " ");
        }

        System.out.println();

    }
}