import { Area } from "./area";
import { Patient } from "./patients/patient";
import { User } from "./user";

export class Room {
    
    
    roomId:number;
    roomNumber:number;
    roomStatus:number;
    area:Area;
    patient:Patient;
    doctor:User;
    

    constructor(roomId:number, roomNumber:number, area:Area, roomStatus:number, patient:Patient, doctor:User){
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.area = area;
        this.roomStatus = roomStatus;
        this.patient = patient;
        this.doctor = doctor;

    }
       

}
