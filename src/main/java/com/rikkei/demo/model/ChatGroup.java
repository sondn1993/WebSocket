package com.rikkei.demo.model;

public class ChatGroup {
    private int groupId;
    private String groupName;

    public ChatGroup() {
        super();
    }

    public ChatGroup(int groupId, String groupName) {
        super();
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
