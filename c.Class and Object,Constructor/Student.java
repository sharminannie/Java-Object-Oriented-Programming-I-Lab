
public class Student {

	    String name;
	    String id;
	    double creditCompleted;
	    double cgpa;
	    public Student(String name,String id,double creditCompleted,double cgpa) 
	    {
	        this.name=name;
	        this.id=id;
	        this.creditCompleted=creditCompleted;
	        this.cgpa=cgpa;
	    }

	    public void updateCgpa(double courseCredit, double courseGpa) 
	    {
	    	double totalcgpa=this.cgpa*this.creditCompleted;
	        totalcgpa+=courseCredit*courseGpa;
	        this.creditCompleted+=courseCredit;
	        this.cgpa=totalcgpa/this.creditCompleted;
	    }
	    
	    
	    
	    public void display() 
	    {
	    	System.out.printf("Name:%s\nId:%s\nCredit Completed:%.2f\nCGPA:%.2f\n",name,id,creditCompleted,cgpa);
		        
	    }
}



