import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

checkoutForm = this.formBuilder.group({
      inputNumber: ''
    });

  constructor(private formBuilder: FormBuilder,) {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {

  }

}
