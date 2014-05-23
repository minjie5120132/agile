Feature: 管理团队的任务

	description
	
		In order to 保证开发进度
		
		As a Scrum Master
		
		I want to 查询未完成任务

Scenario: 未完成任务

	Given 团队有任务"Task123"
	
	Given 团队 有任务"Test456"
	
	When 团队完成"Test123"
	
	Then 我的未完成任务有"Test123"
