import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearCanchaComponent } from './crear-cancha.component';

describe('CrearCanchaComponent', () => {
  let component: CrearCanchaComponent;
  let fixture: ComponentFixture<CrearCanchaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrearCanchaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CrearCanchaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
