public class HelloWorld {
    public static void main(String args[]){
            System.out.println("I'm dancing");
	        }
		}
		// Execute Thru Jenkins
		//1. Go to configuration page of your job/project
		//2. Select "Execute Windows batch command" from "Add build step" combo
		//3. Type the following on Command field: javac Hello.java java Hello
		//4 Save configuration
		//5 Keep Hello.java on the folder /Jenkins/workspace/
		//6. Build the project/job by clicking "Build Now" link and see the Console Output

		//http://paxcel.net/blog/automation-of-warear-deployment-using-jenkins/
