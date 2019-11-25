import { ILocation } from 'app/shared/model/location.model';

export interface IProject {
  id?: string;
  projectName?: string;
  location?: ILocation;
}

export class Project implements IProject {
  constructor(public id?: string, public projectName?: string, public location?: ILocation) {}
}
