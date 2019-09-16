import { TestBed } from '@angular/core/testing';

import { CharacterDataService } from './character-data.service';

describe('CharacterDataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CharacterDataService = TestBed.get(CharacterDataService);
    expect(service).toBeTruthy();
  });
});
