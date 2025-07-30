class Employee {
    // declare the variables
    int emp_id = 101;
    String emp_name = "Jeelan";
    static String companyName = "Wipro";

    // create function
    // modifiers + returnType + name of method/function + parameters
    public void showEmpDetails() {
        System.out.println("Emp ID: " + emp_id);
        System.out.println("Emp Name: " + emp_name);
        System.out.println("Company Name: " + companyName);
    }

    // main method
    public static void main(String[] args) {
        // creating the object
        Employee employee = new Employee();

        // calling the method
        employee.showEmpDetails();
    }
}