package ngpanwei.bdd.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import backlog.Backlog;
import backlog.Task;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class TaskStepDefs {

Backlog backlog = null;
	
	@Before
	public void setup()
	{
		backlog = new Backlog();
	}
	@Given("^团队有任务\"(.*?)\"$")
	public void 团队有任务(String taskName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Task newTask = backlog.add(taskName);
		assertNotNull(newTask);
	}

	@Given("^团队 有任务\"(.*?)\"$")
	public void 团队_有任务(String taskName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Task newTask = backlog.add(taskName);
		assertNotNull(newTask);
	}

	@When("^团队完成\"(.*?)\"$")
	public void 团队完成(String taskName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Task task = backlog.setTaskStatus(taskName, Task.STATUS_DONE);
		assertNotNull("task should exist in backlog", task);
	}

	@Then("^我的未完成任务有\"(.*?)\"$")
	public void 我的未完成任务有(String taskName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<Task> tasks = backlog.getUnompleteTask();
		Task task = tasks.get(0);
		assertEquals(task.getName(), taskName);
	}
}
