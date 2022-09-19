package com.training.oops;

import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Logger;


public class JavaTraining {
	
			String TraineeName;
			String EmpId;
			String NoOfSystemRequired;
			String NoOfChairs;
			String traineeposition;
			String penName;
			
			static Logger log=Logger.getLogger(JavaTraining.class.getName());
			
//			 void addingTraineeDetails(String TraineeName,String EmpId,String NoOfSystemRequired,String NoOfChairs)
//			{
//				this.TraineeName=TraineeName;
//				this.EmpId=EmpId;
//				this.NoOfSystemRequired=NoOfSystemRequired;
//				this.NoOfChairs=NoOfChairs;
//			}
			 
			 void addingTraineeDetails(String TraineeName,String EmpId,String NoOfSystemRequired,String NoOfChairs,String traineeposition,String penName)
			 {
				 this.TraineeName=TraineeName;
					this.EmpId=EmpId;
					this.NoOfSystemRequired=NoOfSystemRequired;
					this.NoOfChairs=NoOfChairs;
				 this.traineeposition=traineeposition;
				 this.penName=penName;
				 log.info("Input has been taken");
			 }
			
			 
			LinkedList<String> displayingTraineeDetails()
			{
				LinkedList<String> listOfData= new LinkedList<>();
				listOfData.add(TraineeName);
				listOfData.add(EmpId);
				listOfData.add(NoOfSystemRequired);
				listOfData.add(NoOfChairs);
				listOfData.add(traineeposition);
				listOfData.add(penName);
				
				return listOfData;
			}
			
			public static void main(String args[])
			{
				
//				JavaTraining obj = new JavaTraining();
//				obj.addingTraineeDetails("Harsh", "1", "20", "20");
//				System.out.println(obj.displayingTraineeDetails());
				
				JavaTraining obj1 = new JavaTraining();
				obj1.addingTraineeDetails("Harsh", "2", "30", "30", "trainee", "luxi");
				System.out.println(obj1.getClass());
//				System.out.println(obj1.displayingTraineeDetails());
				
				JavaTraining obj2 = new JavaTraining();
				obj2.addingTraineeDetails("Harsh", "2", "30", "30", "trainee", "luxi");
				
				System.out.println(obj1.equals(obj2));
				System.out.println(obj1==obj2);	
			}


			@Override
			public int hashCode() {
				return Objects.hash(EmpId, NoOfChairs, NoOfSystemRequired, TraineeName, penName, traineeposition);
			}


			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				JavaTraining other = (JavaTraining) obj;
				return Objects.equals(EmpId, other.EmpId) && Objects.equals(NoOfChairs, other.NoOfChairs)
						&& Objects.equals(NoOfSystemRequired, other.NoOfSystemRequired)
						&& Objects.equals(TraineeName, other.TraineeName) && Objects.equals(penName, other.penName)
						&& Objects.equals(traineeposition, other.traineeposition);
			}



			
}
