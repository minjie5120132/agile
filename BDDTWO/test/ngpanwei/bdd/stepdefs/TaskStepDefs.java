package ngpanwei.bdd.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import backLog.BackLog;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.Task;

public class TaskStepDefs {
	
	BackLog backlog = null;

	@Before
	public void setup() {
		backlog = new BackLog();
	}
	
	@Given("^团队有任务\"(.*?)\"$")
	public void 团队有任务(String taskName) throws Throwable {
		Task newTask = backlog.add(taskName);
		assertNotNull(newTask);
	}

	@When("^团队完成\"(.*?)\"$")
	public void 团队完成(String taskName) throws Throwable {
		Task task = backlog.setTaskStatus(taskName, Task.STATUS_DONE);
		assertNotNull("task should exist in backlog", task);
	}

	@Then("^团队的未完成任务是\"(.*?)\"$")
	public void 团队的未完成任务是(String taskName) throws Throwable {
		List<Task> tasks = backlog.getUnompleteTask();
		Task task = tasks.get(0);
		assertEquals(task.getName(), taskName);
	}

	@Given("^团队有优先级\"(.*?)\"的任务\"(.*?)\"$")
	public void 团队有优先级_的任务(String taskName, String priority) throws Throwable {
		Task newTask = backlog.add(taskName);
		newTask.setPriority(priority);
		assertNotNull(newTask);
	}

	@Then("^团队的未完成\"(.*?)\"优先级任务是\"(.*?)\"$")
	public void 团队的未完成_优先级任务是(String taskName, String priority) throws Throwable {
		List<Task> tasks = backlog.getUnompleteTask();
		Task task = tasks.get(0);
		assertEquals(task.getName(), taskName);
		assertEquals(task.getPriority(),priority);
	}

}
