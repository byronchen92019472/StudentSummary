/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsummary;

/**
 *
 * @author 92019472
 */
public class StudentSummary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] subjectNames = new String[6];
        subjectNames[0] = "Math";
        subjectNames[1] = "Science";
        subjectNames[2] = "English";
        subjectNames[3] = "P.E.";
        subjectNames[4] = "Social Studies";
        subjectNames[5] = "Economics";
        
        float[][] grades = new float[6][4];
        grades[0][0] = 45;
        grades[0][1] = 78;
        grades[0][2] = 67;
        grades[0][3] = 99;
        grades[1][0] = 78;
        grades[1][1] = 96;
        grades[1][2] = 98;
        grades[1][3] = 95;
        grades[2][0] = 94;
        grades[2][1] = 97;
        grades[2][2] = 85;
        grades[2][3] = 87;
        grades[3][0] = 84;
        grades[3][1] = 83;
        grades[3][2] = 79;
        grades[3][3] = 79;
        grades[4][0] = 56;
        grades[4][1] = 34;
        grades[4][2] = 23;
        grades[4][3] = 55;
        grades[5][0] = 74;
        grades[5][1] = 82;
        grades[5][2] = 1;
        grades[5][3] = 34;
        
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.println(subjectNames[i] + ": grades (" + grades[i][0] + ", " +
                    grades[i][1] + ", " + grades[i][2] + ", " + grades[i][3] + ")");
            
        }
        
        
        
        
        
        
    }
    
}
