package com.test1;

public class FileSystemVolume {
	private String volCode;
	private String fileSystemId;
	private boolean systemAccessDenied;
	private Integer rootId;
	private String path;
	private String fileSystemOwner;
	private String volumeGroup;
	private String parallelInstances;
	private String websiteFileSharing;
	private Integer storageTiers;
	private String costSaverType;
	private String linuxInstanceType;
	private String osIndependentType;

	private FileSystemVolume() {

	}

	public FileSystemVolume(String volCode, String fileSystemId, boolean systemAccessDenied, Integer rootId,
			String path, String fileSystemOwner, String volumeGroup, String parallelInstances,
			String websiteFileSharing, Integer storageTiers, String costSaverType, String linuxInstanceType,
			String osIndependentType) {
		super();
		this.volCode = volCode;
		this.fileSystemId = fileSystemId;
		this.systemAccessDenied = systemAccessDenied;
		this.rootId = rootId;
		this.path = path;
		this.fileSystemOwner = fileSystemOwner;
		this.volumeGroup = volumeGroup;
		this.parallelInstances = parallelInstances;
		this.websiteFileSharing = websiteFileSharing;
		this.storageTiers = storageTiers;
		this.costSaverType = costSaverType;
		this.linuxInstanceType = linuxInstanceType;
		this.osIndependentType = osIndependentType;
	}

	public String getVolCode() {
		return volCode;
	}

	public void setVolCode(String volCode) {
		this.volCode = volCode;
	}

	public String getFileSystemId() {
		return fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
	}

	public boolean isSystemAccessDenied() {
		return systemAccessDenied;
	}

	public void setSystemAccessDenied(boolean systemAccessDenied) {
		this.systemAccessDenied = systemAccessDenied;
	}

	public Integer getRootId() {
		return rootId;
	}

	public void setRootId(Integer rootId) {
		this.rootId = rootId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFileSystemOwner() {
		return fileSystemOwner;
	}

	public void setFileSystemOwner(String fileSystemOwner) {
		this.fileSystemOwner = fileSystemOwner;
	}

	public String getVolumeGroup() {
		return volumeGroup;
	}

	public void setVolumeGroup(String volumeGroup) {
		this.volumeGroup = volumeGroup;
	}

	public String getParallelInstances() {
		return parallelInstances;
	}

	public void setParallelInstances(String parallelInstances) {
		this.parallelInstances = parallelInstances;
	}

	public String getWebsiteFileSharing() {
		return websiteFileSharing;
	}

	public void setWebsiteFileSharing(String websiteFileSharing) {
		this.websiteFileSharing = websiteFileSharing;
	}

	public Integer getStorageTiers() {
		return storageTiers;
	}

	public void setStorageTiers(Integer storageTiers) {
		this.storageTiers = storageTiers;
	}

	public String getCostSaverType() {
		return costSaverType;
	}

	public void setCostSaverType(String costSaverType) {
		this.costSaverType = costSaverType;
	}

	public String getLinuxInstanceType() {
		return linuxInstanceType;
	}

	public void setLinuxInstanceType(String linuxInstanceType) {
		this.linuxInstanceType = linuxInstanceType;
	}

	public String getOsIndependentType() {
		return osIndependentType;
	}

	public void setOsIndependentType(String osIndependentType) {
		this.osIndependentType = osIndependentType;
	}

}
