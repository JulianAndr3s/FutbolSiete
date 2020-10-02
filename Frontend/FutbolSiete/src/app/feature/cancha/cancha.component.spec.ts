import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CanchaComponent } from './cancha.component';

describe('CanchaComponent', () => {
  let component: CanchaComponent;
  let fixture: ComponentFixture<CanchaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CanchaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CanchaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
