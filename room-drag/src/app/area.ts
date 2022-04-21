import { User } from "./user";

export class Area {

    areaId:number;
    name:string;
    doctor: User;
    
    constructor(areaId:number, name:string, doctor: User){
        this.areaId = areaId;
        this.name = name;
        this.doctor = doctor;

}
}
