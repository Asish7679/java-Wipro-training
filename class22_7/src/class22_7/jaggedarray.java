package class22_7;
public class jaggedarray {
    public static void main(String[] args) {
        String[][] employeeProjects = new String[3][];

     
        employeeProjects[0] = new String[] {"ProjectA", "ProjectB"};        
        employeeProjects[1] = new String[] {"ProjectX"};                    
        employeeProjects[2] = new String[] {"ProjectM", "ProjectN", "ProjectO"}; 

       
        for (int i = 0; i < employeeProjects.length; i++) {
            System.out.print("Employee " + i + " projects: ");
            for (int j = 0; j < employeeProjects[i].length; j++) {
                System.out.print(employeeProjects[i][j] + " ");
            }
            System.out.println();
        }
    }
}
