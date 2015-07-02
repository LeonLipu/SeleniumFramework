package testnglistener;

import org.testng.IExecutionListener;

public class CustomExecutionListener implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		System.out.println("Execution is started   ...");
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("execution finished and mail get sent");
		
	}

}
