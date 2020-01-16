package com.newegg.ec.redis.entity;



/**
 * @author Kyle.K.Zhao
 * @date 1/8/2020 16:26
 */
public class RDBAnalyzeResult {
	private Long id;
	private Long scheduleId;
	private Long clusterId;
	private String analyzeConfig;

	private String result;

	private String clusterName;

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public Long getClusterId() {
		return clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getAnalyzeConfig() {
		return analyzeConfig;
	}

	public void setAnalyzeConfig(String analyzeConfig) {
		this.analyzeConfig = analyzeConfig;
	}
}