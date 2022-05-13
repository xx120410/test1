package com.xx.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lvbing
 * @description 手环返回数据
 * @date 2017年10月18日 下午4:19
 */
public class DeviceReturn implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 制造商名称
     */
    private String vendor;
    /**
     * 终端序列号
     */
    private String deviceSerial;
    /**
     * 被确认的中心命令
     */
    private String command;
    /**
     * 数据有效位
     */
    private String dataStatus;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 纬度标志
     */
    private String latitudeTag;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 经度标志
     */
    private String longitudeTag;
    /**
     * 速度
     */
    private Double speed;
    /**
     * 方位角
     */
    private Integer direction;
    /**
     * 终端回传时间
     */
    private Date createdAt;
    /**
     * 终端状态
     */
    private String status;
    /**
     * 记录时间
     */
    private Date lasttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial == null ? null : deviceSerial.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLatitudeTag() {
        return latitudeTag;
    }

    public void setLatitudeTag(String latitudeTag) {
        this.latitudeTag = latitudeTag == null ? null : latitudeTag.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLongitudeTag() {
        return longitudeTag;
    }

    public void setLongitudeTag(String longitudeTag) {
        this.longitudeTag = longitudeTag == null ? null : longitudeTag.trim();
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public DeviceReturn() {
    }

    public DeviceReturn(Integer id, String vendor, String deviceSerial, String command, String dataStatus,
                        Double latitude, String latitudeTag, Double longitude, String longitudeTag,
                        Double speed, Integer direction, Date createdAt, String status, Date lasttime) {
        this.id = id;
        this.vendor = vendor;
        this.deviceSerial = deviceSerial;
        this.command = command;
        this.dataStatus = dataStatus;
        this.latitude = latitude;
        this.latitudeTag = latitudeTag;
        this.longitude = longitude;
        this.longitudeTag = longitudeTag;
        this.speed = speed;
        this.direction = direction;
        this.createdAt = createdAt;
        this.status = status;
        this.lasttime = lasttime;
    }



    @Override
    public String toString() {
        return "DeviceReturn{" +
                "id=" + id +
                ", vendor='" + vendor + '\'' +
                ", deviceSerial='" + deviceSerial + '\'' +
                ", command='" + command + '\'' +
                ", dataStatus='" + dataStatus + '\'' +
                ", latitude=" + latitude +
                ", latitudeTag='" + latitudeTag + '\'' +
                ", longitude=" + longitude +
                ", longitudeTag='" + longitudeTag + '\'' +
                ", speed=" + speed +
                ", direction=" + direction +
                ", createdAt=" + createdAt +
                ", status='" + status + '\'' +
                ", lasttime=" + lasttime +
                '}';
    }
}