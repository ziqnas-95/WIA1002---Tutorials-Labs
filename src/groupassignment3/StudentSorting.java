///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package groupassignment3;
//
///**
// *
// * @author Haziq Nasaruddin
// */
//
//import java.util.*;
//
///**
// * Implement two sorting algorithms to sort patient recoreds by Matric ID, Name, Address, Programme, and CGPA
// * Address should be Sortable by State District and Postcode
// * Implement multi field sorting 
// * Add a functionality to compare performance (time) and speed of both sorting algorithms
// * 
// * 
// * 
// * @author Haziq Nasaruddin
// */
//public class StudentSorting {
//    
//}
//
//class Student {
//    String matricID;
//    String name;
//    String state;
//    String district;
//    String postcode;
//    String programme;
//    double cgpa;
//
//    public Student(String matricID, String name, String state, String district, String postcode, String programme, double cgpa) {
//        this.matricID = matricID;
//        this.name = name;
//        this.state = state;
//        this.district = district;
//        this.postcode = postcode;
//        this.programme = programme;
//        this.cgpa = cgpa;
//    }
//    
//    public String getAddress() {
//        return state + "-" + district + "-" + postcode;
//    }
//
//    @Override
//    public String toString() {
//        return matricID + " | " + name + " | " + getAddress() + " | " + programme + " | " + cgpa;
//    }
//    
//}
//    
//class MultiFieldStudentSorter {
//
//    static class SortField {
//        String field;
//        boolean ascending;
//
//        SortField(String field, boolean ascending) {
//            this.field = field;
//            this.ascending = ascending;
//        }
//    }
//
//    public static void bubbleSort(List<Student> students, List<SortField> sortFields) {
//        int n = students.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (compare(students.get(j), students.get(j + 1), sortFields) > 0) {
//                    Collections.swap(students, j, j + 1);
//                }
//            }
//        }
//    }
//
//    public static void insertionSort(List<Student> students, List<SortField> sortFields) {
//        for (int i = 1; i < students.size(); i++) {
//            Student key = students.get(i);
//            int j = i - 1;
//            while (j >= 0 && compare(students.get(j), key, sortFields) > 0) {
//                students.set(j + 1, students.get(j));
//                j--;
//            }
//            students.set(j + 1, key);
//        }
//    }
//
//    public static int compare(Student a, Student b, List<SortField> fields) {
//        for (SortField sf : fields) {
//            int cmp = switch (sf.field.toLowerCase()) {
//                case "matric id" -> a.matricID.compareTo(b.matricID);
//                case "name" -> a.name.compareToIgnoreCase(b.name);
//                case "address" -> a.getAddress().compareToIgnoreCase(b.getAddress());
//                case "programme" -> a.programme.compareToIgnoreCase(b.programme);
//                case "cgpa" -> Double.compare(a.cgpa, b.cgpa);
//                default -> 0;
//            };
//            if (cmp != 0) return sf.ascending ? cmp : -cmp;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
////
////        List<Student> students = new ArrayList<>(List.of(
////            new Student("WHA10081", "TestStudentPleaseIgnore", "Selangor", "Petaling", "47600", "AI", 3.98),
////            new Student("WHA10072", "Mohd Aladdin", "Selangor", "Petaling", "47600", "AI", 3.99),
////            new Student("WHA10022", "Ahmad", "Penang", "Timur Laut", "10200", "SE", 3.75)
////        ));
////        
//        Scanner sc = new Scanner(System.in);
//        List<SortField> sortFields = new ArrayList<>();
//        Set<Integer> selected = new HashSet<>();
//
//        String[] fieldOptions = {"Matric ID", "Name", "Address", "Programme", "CGPA"};
//
//        while (true) {
//            System.out.println("Choose which fields to sort. Current selection " +
//                (sortFields.isEmpty() ? "[None]" : formatSelections(sortFields)));
//
//            for (int i = 0; i < fieldOptions.length; i++) {
//                if (!selected.contains(i)) {
//                    System.out.printf("%d. %s%n", i + 1, fieldOptions[i]);
//                }
//            }
//            System.out.println("0. Done");
//
//            int choice = sc.nextInt();
//            sc.nextLine(); // consume newline
//
//            if (choice == 0) break;
//            if (choice < 1 || choice > fieldOptions.length || selected.contains(choice - 1)) {
//                System.out.println("Invalid or duplicate choice. Try again.");
//                continue;
//            }
//
//            String field = fieldOptions[choice - 1];
//            System.out.printf("You have selected [%s]. Which order to sort?%n1. Ascending%n2. Descending%n", field);
//            int order = sc.nextInt();
//            sc.nextLine();
//
//            boolean ascending = order == 1;
//            sortFields.add(new SortField(field, ascending));
//            selected.add(choice - 1);
//        }
//
//        if (sortFields.isEmpty()) {
//            System.out.println("No sorting selected. Exiting.");
//            return;
//        }
//
//        System.out.println("Choose sorting algorithm: 1. Bubble Sort  2. Insertion Sort");
//        int algo = sc.nextInt();
//        sc.nextLine();
//
//        long start = System.nanoTime();
//        if (algo == 1) {
//            bubbleSort(students, sortFields);
//            System.out.println("Sorted using Bubble Sort.");
//        } else {
//            insertionSort(students, sortFields);
//            System.out.println("Sorted using Insertion Sort.");
//        }
//        long end = System.nanoTime();
//
//        System.out.println("\nSorted student list by " + formatSelections(sortFields) + ":");
//        students.forEach(s -> System.out.println(" - " + s));
//        System.out.printf("Time taken: %d ns%n", (end - start));
//    }
//
//    }
//
//    private static String formatSelections(List<SortField> fields) {
//        StringBuilder sb = new StringBuilder();
//        for (SortField sf : fields) {
//            sb.append("[").append(sf.field).append("] (")
//              .append(sf.ascending ? "Ascending" : "Descending").append("), ");
//        }
//        return sb.substring(0, sb.length() - 2); // remove last comma and space
//    }
//
//
//}
//    
//    
