import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NotesModernComponent } from './notes-modern.component';

describe('NotesModernComponent', () => {
  let component: NotesModernComponent;
  let fixture: ComponentFixture<NotesModernComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NotesModernComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NotesModernComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
