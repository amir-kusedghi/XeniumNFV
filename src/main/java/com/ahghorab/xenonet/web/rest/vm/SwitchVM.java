package com.ahghorab.xenonet.web.rest.vm;

import java.util.List;

public class SwitchVM extends BaseEntityVM<Integer> {
    private String source;
    private String key;
    private String name;
    private String describtion;
    private String loc;
    private List<String>  leftArray;
    private List<String>  topArray;
    private List<String> bottomArray;
    private List<String>  rightArray;
    private List<DiagramEntityConnectionsVM> diagramEntityConnections;

    public SwitchVM(){

    }

    public SwitchVM(String source, String key, String name, String describtion, String loc, List<String> leftArray, List<String> topArray, List<String> bottomArray, List<String> rightArray, List<DiagramEntityConnectionsVM> diagramEntityConnections) {
        this.source = source;
        this.key = key;
        this.name = name;
        this.describtion = describtion;
        this.loc = loc;
        this.leftArray = leftArray;
        this.topArray = topArray;
        this.bottomArray = bottomArray;
        this.rightArray = rightArray;
        this.diagramEntityConnections = diagramEntityConnections;
    }

    public SwitchVM(Integer id, String createdDate, String updatedDate, String source, String key, String name, String describtion, String loc, List<String> leftArray, List<String> topArray, List<String> bottomArray, List<String> rightArray, List<DiagramEntityConnectionsVM> diagramEntityConnections) {
        super(id, createdDate, updatedDate);
        this.source = source;
        this.key = key;
        this.name = name;
        this.describtion = describtion;
        this.loc = loc;
        this.leftArray = leftArray;
        this.topArray = topArray;
        this.bottomArray = bottomArray;
        this.rightArray = rightArray;
        this.diagramEntityConnections = diagramEntityConnections;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<String> getLeftArray() {
        return leftArray;
    }

    public void setLeftArray(List<String> leftArray) {
        this.leftArray = leftArray;
    }

    public List<String> getTopArray() {
        return topArray;
    }

    public void setTopArray(List<String> topArray) {
        this.topArray = topArray;
    }

    public List<String> getBottomArray() {
        return bottomArray;
    }

    public void setBottomArray(List<String> bottomArray) {
        this.bottomArray = bottomArray;
    }

    public List<String> getRightArray() {
        return rightArray;
    }

    public void setRightArray(List<String> rightArray) {
        this.rightArray = rightArray;
    }

    public List<DiagramEntityConnectionsVM> getDiagramEntityConnections() {
        return diagramEntityConnections;
    }

    public void setDiagramEntityConnections(List<DiagramEntityConnectionsVM> diagramEntityConnections) {
        this.diagramEntityConnections = diagramEntityConnections;
    }
}
