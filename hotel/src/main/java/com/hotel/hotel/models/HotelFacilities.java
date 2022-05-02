package com.hotel.hotel.models;

public class HotelFacilities {

    private Long hotel_id;
    private Long value;
    private Long hotelfacilitytype_id;
    private Long facilitytype_id;
    private String facility_name;
    private String roomfacilitytype_id;
    private String is_common_room_facility;
    private String kind;
    private String facilitytype_name;

    public HotelFacilities() {
    }

    public HotelFacilities(Long hotel_id, Long value, Long facilitytype_id, String facility_name, String roomfacilitytype_id, String is_common_room_facility, Long hotelfacilitytype_id, String kind, String facilitytype_name) {
        this.hotel_id = hotel_id;
        this.value = value;
        this.facilitytype_id = facilitytype_id;
        this.facility_name = facility_name;
        this.roomfacilitytype_id = roomfacilitytype_id;
        this.is_common_room_facility = is_common_room_facility;
        this.hotelfacilitytype_id = hotelfacilitytype_id;
        this.kind = kind;
        this.facilitytype_name = facilitytype_name;
    }

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getFacilitytype_id() {
        return facilitytype_id;
    }

    public void setFacilitytype_id(Long facilitytype_id) {
        this.facilitytype_id = facilitytype_id;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public String getRoomfacilitytype_id() {
        return roomfacilitytype_id;
    }

    public void setRoomfacilitytype_id(String roomfacilitytype_id) {
        this.roomfacilitytype_id = roomfacilitytype_id;
    }

    public String getIs_common_room_facility() {
        return is_common_room_facility;
    }

    public void setIs_common_room_facility(String is_common_room_facility) {
        this.is_common_room_facility = is_common_room_facility;
    }

    public Long getHotelfacilitytype_id() {
        return hotelfacilitytype_id;
    }

    public void setHotelfacilitytype_id(Long hotelfacilitytype_id) {
        this.hotelfacilitytype_id = hotelfacilitytype_id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFacilitytype_name() {
        return facilitytype_name;
    }

    public void setFacilitytype_name(String facilitytype_name) {
        this.facilitytype_name = facilitytype_name;
    }
}
