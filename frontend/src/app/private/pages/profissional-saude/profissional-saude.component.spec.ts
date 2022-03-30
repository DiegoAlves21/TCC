import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfissionalSaudeComponent } from './profissional-saude.component';

describe('ProfissionalSaudeComponent', () => {
  let component: ProfissionalSaudeComponent;
  let fixture: ComponentFixture<ProfissionalSaudeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfissionalSaudeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfissionalSaudeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
