package ngpanwei.bdd.stepdefs;

import java.util.List;

import backlog.Backlog;
import backlog.Task;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BacklogStepDefs {
	
	Backlog backlog = null;

	@Before
	public void setup() {
		backlog = new Backlog();
	}

	@Given("^Backlog 有 任务 \"(.*?)\"$")
	public void backlog_有_任务(String taskName) throws Throwable {
		Task newTask = backlog.add(taskName);
		assertNotNull(newTask);
	}

	@When("^我完成 \"(.*?)\"$")
	public void 我完成(String taskName) throws Throwable {
		Task task = backlog.setTaskStatus(taskName, Task.STATUS_DONE);
		assertNotNull("task should exist in backlog", task);
	}

	@Then("^未完成任务是 \"(.*?)\"$")
	public void 未完成任务是(String taskName) throws Throwable {
		List<Task> tasks = backlog.getUnompleteTask();
		Task task = tasks.get(0);
		assertEquals(task.getName(), taskName);
	}

}
