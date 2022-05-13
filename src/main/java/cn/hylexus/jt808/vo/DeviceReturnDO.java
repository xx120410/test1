package cn.hylexus.jt808.vo;

import java.io.Serializable;

/**
 * 手环重点返回的信息结构
 * <p>
 * 示例数据：*HQ,2716323614,V1,115936,V,3127.6735,N,10446.9803,E,000.0,360,071017,FFE7FBFF#
 * *HQ,2716323729,V1,115835,A,3129.9474,N,10443.6972,E,000.6,131,071017,FFE7FBFF#
 *
 * @author wgybzb
 */
public class DeviceReturnDO implements Serializable {


    private static  long serialVersionUID = 1L;

    // 制造商名称，如：HQ
    private String vendor;
    // 终端序列号，如：2716323614
    private String deviceSerial;
    // 倍确认的中心命令，如：LINK
    private String command;
    // 时分秒，需要增加8小时，如：115941，实际是19:59:41
    private String hms;
    // 数据有效位，如：V
    private String dataStatus;
    // 纬度，如：3127.6735
    private Double latitude;
    // 纬度标志，如：N
    private String latitudeTag;
    // 经度，如：10446.9803
    private Double longitude;
    // 经度标志，如：E
    private String longitudeTag;
    // 速度，如：000.0
    private Double speed;
    // 方位角，如：360
    private Integer direction;
    // 日月年，如：071017
    private String dmy;
    // 跟踪状态，如：FFE7FBFF
    private String status;

    public DeviceReturnDO(String vendor, String deviceSerial, String command, String hms, String dataStatus, Double latitude, String latitudeTag, Double longitude, String longitudeTag, Double speed, Integer direction, String dmy, String status) {
        this.vendor = vendor;
        this.deviceSerial = deviceSerial;
        this.command = command;
        this.hms = hms;
        this.dataStatus = dataStatus;
        this.latitude = latitude;
        this.latitudeTag = latitudeTag;
        this.longitude = longitude;
        this.longitudeTag = longitudeTag;
        this.speed = speed;
        this.direction = direction;
        this.dmy = dmy;
        this.status = status;
    }

    public DeviceReturnDO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        DeviceReturnDO.serialVersionUID = serialVersionUID;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getHms() {
        return hms;
    }

    public void setHms(String hms) {
        this.hms = hms;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
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
        this.latitudeTag = latitudeTag;
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
        this.longitudeTag = longitudeTag;
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

    public String getDmy() {
        return dmy;
    }

    public void setDmy(String dmy) {
        this.dmy = dmy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeviceReturnDO{" +
                "vendor='" + vendor + '\'' +
                ", deviceSerial='" + deviceSerial + '\'' +
                ", command='" + command + '\'' +
                ", hms='" + hms + '\'' +
                ", dataStatus='" + dataStatus + '\'' +
                ", latitude=" + latitude +
                ", latitudeTag='" + latitudeTag + '\'' +
                ", longitude=" + longitude +
                ", longitudeTag='" + longitudeTag + '\'' +
                ", speed=" + speed +
                ", direction=" + direction +
                ", dmy='" + dmy + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
