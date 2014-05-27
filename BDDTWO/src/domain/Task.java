package domain;

public class Task {
	
	public static final String STATUS_TODO = "TODO" ;
    public static final String STATUS_DOING = "DOING" ;
    public static final String STATUS_DONE = "DONE" ;
    
    public static final String PRIORITY_HIGH = "HIGH";
    public static final String PRIORITY_NULL  = "NULL";

    private String name ;
    private String status ;
    private String priority;
    
    public Task(String taskName) {
        name = taskName ;
        status = STATUS_TODO ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

    
}
