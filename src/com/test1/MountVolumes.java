package com.test1;

public class MountVolumes {
	private String volCode;
	private String volName;
	private String volType;
	private String snapshotAvailable;
	private String gp2Type;
	private String gp1Type;
	private String gp3Type;
	private String zoneLevelLock;
	private String multiAttach;
	private String singleInstanceAttach;

	public MountVolumes() {

	}

	public MountVolumes(String volCode, String volName, String volType, String snapshotAvailable, String gp2Type,
			String gp1Type, String gp3Type, String zoneLevelLock, String multiAttach, String singleInstanceAttach) {
		super();
		this.volCode = volCode;
		this.volName = volName;
		this.volType = volType;
		this.snapshotAvailable = snapshotAvailable;
		this.gp2Type = gp2Type;
		this.gp1Type = gp1Type;
		this.gp3Type = gp3Type;
		this.zoneLevelLock = zoneLevelLock;
		this.multiAttach = multiAttach;
		this.singleInstanceAttach = singleInstanceAttach;
	}

	public String getVolCode() {
		return volCode;
	}

	public void setVolCode(String volCode) {
		this.volCode = volCode;
	}

	public String getVolName() {
		return volName;
	}

	public void setVolName(String volName) {
		this.volName = volName;
	}

	public String getVolType() {
		return volType;
	}

	public void setVolType(String volType) {
		this.volType = volType;
	}

	public String getSnapshotAvailable() {
		return snapshotAvailable;
	}

	public void setSnapshotAvailable(String snapshotAvailable) {
		this.snapshotAvailable = snapshotAvailable;
	}

	public String getGp2Type() {
		return gp2Type;
	}

	public void setGp2Type(String gp2Type) {
		this.gp2Type = gp2Type;
	}

	public String getGp1Type() {
		return gp1Type;
	}

	public void setGp1Type(String gp1Type) {
		this.gp1Type = gp1Type;
	}

	public String getGp3Type() {
		return gp3Type;
	}

	public void setGp3Type(String gp3Type) {
		this.gp3Type = gp3Type;
	}

	public String getZoneLevelLock() {
		return zoneLevelLock;
	}

	public void setZoneLevelLock(String zoneLevelLock) {
		this.zoneLevelLock = zoneLevelLock;
	}

	public String getMultiAttach() {
		return multiAttach;
	}

	public void setMultiAttach(String multiAttach) {
		this.multiAttach = multiAttach;
	}

	public String getSingleInstanceAttach() {
		return singleInstanceAttach;
	}

	public void setSingleInstanceAttach(String singleInstanceAttach) {
		this.singleInstanceAttach = singleInstanceAttach;
	}

}
