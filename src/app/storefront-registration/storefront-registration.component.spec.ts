import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StorefrontRegistrationComponent } from './storefront-registration.component';

describe('StorefrontRegistrationComponent', () => {
  let component: StorefrontRegistrationComponent;
  let fixture: ComponentFixture<StorefrontRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StorefrontRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StorefrontRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
