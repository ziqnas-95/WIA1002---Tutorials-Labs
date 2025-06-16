/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupassignment3;

import java.util.*;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Sorted {
    
}

class Student {
    String matricID, name, state, district, postcode, programme;
    double cgpa;

    Student(String matricID, String name, String state, String district, String postcode, String programme, double cgpa) {
        this.matricID = matricID;
        this.name = name;
        this.state = state;
        this.district = district;
        this.postcode = postcode;
        this.programme = programme;
        this.cgpa = cgpa;
    }

    public String getAddress() {
        return state + "-" + district + "-" + postcode;
    }

    @Override
    public String toString() {
        return "Matric ID: " + matricID + "\tName: " + name + "\t\tProgramme: " + programme + "\tCGPA: " + cgpa + "\tAddress: " + getAddress();
    }
    
    
    
}

class MultiFieldStudentSorter {
    
    static class SortField {
        String field;
        boolean ascending;

        SortField(String field, boolean ascending) {
            this.field = field;
            this.ascending = ascending;
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(List<Student> students, List<SortField> sortFields) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(students.get(j), students.get(j + 1), sortFields) > 0) {
                    Collections.swap(students, j, j + 1);
                }
            }
        }
    }

    // Insertion Sort Algorithm
    public static void insertionSort(List<Student> students, List<SortField> sortFields) {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && compare(students.get(j), key, sortFields) > 0) {
                students.set(j + 1, students.get(j));
                j--;
            }
            students.set(j + 1, key);
        }
    }

//    
    
    public static int compare(Student a, Student b, List<SortField> fields) {
        for (SortField sf : fields) {
            int cmp;
            switch (sf.field.toLowerCase()) {
                case "matric id" -> cmp = a.matricID.compareTo(b.matricID);
                case "name" -> cmp = a.name.compareToIgnoreCase(b.name);
                case "state" -> cmp = a.state.compareToIgnoreCase(b.state);
                case "postcode" -> cmp = a.postcode.compareTo(b.postcode);
                case "district" -> cmp = a.district.compareToIgnoreCase(b.district);
                case "address" -> {
                    // Compare state, then postcode, then district
                    cmp = a.state.compareToIgnoreCase(b.state);
                    if (cmp == 0) {
                        cmp = a.postcode.compareTo(b.postcode);
                        if (cmp == 0) {
                            cmp = a.district.compareToIgnoreCase(b.district);
                        }
                    }
                }
                case "programme" -> cmp = a.programme.compareToIgnoreCase(b.programme);
                case "cgpa" -> cmp = Double.compare(a.cgpa, b.cgpa);
                default -> cmp = 0;
            }
            if (cmp != 0) return sf.ascending ? cmp : -cmp;
        }
        return 0;
    }


    public static void main(String[] args) {
        
        // Sample List of Students
        List<Student> students = new ArrayList<>(List.of(
            new Student("WHA10081", "Haziq Nasa", "Selangor", "Petaling", "47600", "AI", 3.98),
            new Student("WHA10042", "Aqil Amani", "Selangor", "Petaling", "47600", "AI", 3.99),
            new Student("WHA10022", "Ahmad Mubin", "Penang", "Timur Laut", "10200", "SE", 3.75),
            new Student("WHA10022", "Mohd Aladdi", "Selangor", "Petaling", "47600", "AI", 3.99),
            new Student("WHA10012", "Edlan Nabil", "Penang", "Timur Laut", "10200", "SE", 3.75)
        ));

        // For User Input
        Scanner sc = new Scanner(System.in);
        List<SortField> sortFields = new ArrayList<>();
        Set<Integer> selected = new HashSet<>();

        // Field Options For Sortinh
        String[] fieldOptions = {"Matric ID", "Name", "Address", "Programme", "CGPA"};
//        String[] fieldOptions = {"Matric ID", "Name", "State", "Postcode", "District", "Address", "Programme", "CGPA"};

        while (true) {
            System.out.println("Choose which fields to sort. Current selection " +
                (sortFields.isEmpty() ? "[None]" : formatSelections(sortFields)));

            for (int i = 0; i < fieldOptions.length; i++) {
                if (!selected.contains(i)) {
                    System.out.printf("%d. %s%n", i + 1, fieldOptions[i]);
                }
            }
            System.out.println("0. Done");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            // To Allow Users To Pick A Choice And Delete A Choice Which Have Been Chosen Before
            if (choice == 0) break;
            if (choice < 1 || choice > fieldOptions.length || selected.contains(choice - 1)) {
                System.out.println("Invalid or duplicate choice. Try again.");
                continue;
            }

            String field = fieldOptions[choice - 1];
            System.out.printf("You have selected [%s]. Which order to sort?%n1. Ascending%n2. Descending%n", field);
            int order = sc.nextInt();
            sc.nextLine();

            boolean ascending = order == 1;
            sortFields.add(new SortField(field, ascending));
            selected.add(choice - 1);
        }

        if (sortFields.isEmpty()) {
            System.out.println("No sorting selected. Exiting.");
            return;
        }

        // Input To Choose Sorting Algorithm
        System.out.println("Choose sorting algorithm: 1. Bubble Sort  2. Insertion Sort");
        int algo = sc.nextInt();
        sc.nextLine();
        
        
        long start = System.nanoTime(); // Start Time for The Sorting Algorithm
        if (algo == 1) {
            bubbleSort(students, sortFields);
            System.out.println("Sorted using Bubble Sort.");
        } else {
            insertionSort(students, sortFields);
            System.out.println("Sorted using Insertion Sort.");
        }
        long end = System.nanoTime(); // End Time for The Sorting Algorithm

        System.out.println("\nSorted student list by " + formatSelections(sortFields) + ":");
       
        // A Type of For Loop to Print Out All The Details
        students.forEach(s -> System.out.println(" - " + s));
        System.out.printf("Time taken: %d ns%n", (end - start));
    }

    // Formatting for a Good Final Output of the Sorted List
    private static String formatSelections(List<SortField> fields) {
        StringBuilder sb = new StringBuilder();
        for (SortField sf : fields) {
            sb.append("[").append(sf.field).append("] (")
              .append(sf.ascending ? "Ascending" : "Descending").append("), ");
        }
        return sb.substring(0, sb.length() - 2); // remove last comma and space
    }
}

